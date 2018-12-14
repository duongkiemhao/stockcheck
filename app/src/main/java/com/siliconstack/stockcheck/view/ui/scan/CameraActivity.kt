package com.siliconstack.stockcheck.view.ui.scan

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.databinding.DataBindingUtil
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.os.Bundle
import android.os.Handler
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewTreeObserver
import com.otaliastudios.cameraview.CameraListener
import com.otaliastudios.cameraview.Gesture
import com.otaliastudios.cameraview.GestureAction
import org.greenrobot.eventbus.EventBus
import android.view.Surface
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.databinding.CameraActivityBinding
import com.siliconstack.stockcheck.view.control.CameraOverlayViewGroup
import com.siliconstack.stockcheck.view.eventbus.MainEventBus
import com.siliconstack.stockcheck.view.utility.Utility
import android.widget.RelativeLayout
import com.otaliastudios.cameraview.CameraUtils


class CameraActivity : AppCompatActivity() {

    lateinit var cameraActivityBinding: CameraActivityBinding
    lateinit var animatorSet: AnimatorSet
    var frameDimension= arrayListOf<Int>()
    private var _xDelta: Int = 0
    private var _yDelta: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        setListener()
        init()
        loadInfo()
    }

    fun initViewBinding(){
        cameraActivityBinding = DataBindingUtil.setContentView(this, R.layout.camera_activity)
    }

    @SuppressLint("ClickableViewAccessibility")
    fun setListener(){
        cameraActivityBinding.btnTake.setOnClickListener {
            cameraActivityBinding.camera.capturePicture()
        }
        cameraActivityBinding.camera.addCameraListener(object :CameraListener(){
            override fun onPictureTaken(data: ByteArray?) {

                val width: Int = cameraActivityBinding.camera.width
                val height: Int = cameraActivityBinding.camera.height
                val options = BitmapFactory.Options()
                options.inPreferredConfig = Bitmap.Config.ARGB_8888
                options.inMutable = true
                options.inScaled = false
                options.inSampleSize = 2
                var bitmap = BitmapFactory.decodeByteArray(data, 0, data!!.size, options)
                val matrix = Matrix()
                val rotation = this@CameraActivity.getWindowManager().getDefaultDisplay().getRotation()
                var degrees = 0f
                when (rotation) {
                    Surface.ROTATION_0 -> degrees = 90f
                    Surface.ROTATION_90 -> degrees = 0f
                    Surface.ROTATION_180 -> degrees = 270f
                    Surface.ROTATION_270 -> degrees = 180f
                }
                matrix.postRotate(degrees)


                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, false)
                val bh = bitmap!!.height
                val bw = bitmap.width
                val l = cameraActivityBinding.capturedImage.x.toInt() * bw / width
                val t = cameraActivityBinding.capturedImage.y.toInt() * bh / height
                val w = cameraActivityBinding.capturedImage.width * bw / width
                val h = cameraActivityBinding.capturedImage.height * bh / height
                var resizedBitmap = Bitmap.createBitmap(bitmap, l, t, w, h)
                resizedBitmap = Utility.scaleBitmapDown(resizedBitmap,1280)
                if (resizedBitmap != null) {
                    val mainEventBus= MainEventBus()
                    mainEventBus.bitmapURL= Utility.saveBitmapToFile(resizedBitmap)
                    EventBus.getDefault().post(mainEventBus)
                    resizedBitmap.recycle()
                    finish()
                }
            }
        });
        cameraActivityBinding.overlayView.cameraOverlayViewGroupListener=object: CameraOverlayViewGroup.CameraOverlayViewGroupListener{
            override fun onTouch(motionEvent: MotionEvent) {
                cameraActivityBinding.camera.onTouchEvent(motionEvent)
            }

        }
        //camera
        cameraActivityBinding.camera.mapGesture(Gesture.PINCH, GestureAction.ZOOM); // Pinch to zoom!
        cameraActivityBinding.camera.mapGesture(Gesture.TAP, GestureAction.FOCUS_WITH_MARKER); // Tap to focus!

    }

    fun init(){
        cameraActivityBinding.capturedImage.viewTreeObserver.addOnGlobalLayoutListener (object:ViewTreeObserver.OnGlobalLayoutListener{
            override fun onGlobalLayout() {
                cameraActivityBinding.overlayView.visibility= View.VISIBLE
                cameraActivityBinding.capturedImage.viewTreeObserver.removeOnGlobalLayoutListener (this)
            }
        })
        val fadeOut = ObjectAnimator.ofFloat(cameraActivityBinding.capturedImage, "alpha",  1f, .1f);
        fadeOut.duration = 500;
        val fadeIn = ObjectAnimator.ofFloat(cameraActivityBinding.capturedImage, "alpha", .1f, 1f);
        fadeIn.duration = 500;
        animatorSet = AnimatorSet();
        var count=0
        animatorSet.play(fadeOut).after(fadeIn)
        animatorSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation);
                count++
                if(count<10)
                    animatorSet.start();
                else{
                    Handler().postDelayed({
                        count=0
                        animatorSet.start();
                    },5000)

                }
            }
        });
        animatorSet.start();
        cameraActivityBinding.capturedImage.postDelayed({

            frameDimension.add(cameraActivityBinding.capturedImage.width)
            frameDimension.add(cameraActivityBinding.capturedImage.height)

            val mainEventBus= MainEventBus()
            mainEventBus.frameDimension= frameDimension
            cameraActivityBinding.overlayView.myWidth= cameraActivityBinding.capturedImage.width.toFloat()
            cameraActivityBinding.overlayView.myHeight= cameraActivityBinding.capturedImage.height.toFloat()
            cameraActivityBinding.overlayView.invalidate()
            cameraActivityBinding.overlayView.requestFocus()
            EventBus.getDefault().post(mainEventBus)
        },500)

    }

    fun loadInfo(){

    }


    override fun onBackPressed() {
        finish()
    }

    override fun onResume() {
        super.onResume()
        cameraActivityBinding.camera.start()
    }

    override fun onPause() {
        super.onPause()
        cameraActivityBinding.camera.stop()
    }

    override fun onDestroy() {
        super.onDestroy()
        animatorSet.removeAllListeners()
        animatorSet.cancel()
        cameraActivityBinding.camera.destroy()
    }
}

