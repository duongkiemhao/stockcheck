package com.siliconstack.stockcheck.view.control;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0002,-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0014J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020$H\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d\u00a8\u0006."}, d2 = {"Lcom/siliconstack/stockcheck/view/control/CameraOverlayViewGroup;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cameraOverlayViewGroupListener", "Lcom/siliconstack/stockcheck/view/control/CameraOverlayViewGroup$CameraOverlayViewGroupListener;", "getCameraOverlayViewGroupListener", "()Lcom/siliconstack/stockcheck/view/control/CameraOverlayViewGroup$CameraOverlayViewGroupListener;", "setCameraOverlayViewGroupListener", "(Lcom/siliconstack/stockcheck/view/control/CameraOverlayViewGroup$CameraOverlayViewGroupListener;)V", "mBackgroundPaint", "Landroid/graphics/Paint;", "mCx", "", "mCy", "mTutorialColor", "myHeight", "getMyHeight", "()F", "setMyHeight", "(F)V", "myWidth", "getMyWidth", "setMyWidth", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "CameraOverlayViewGroupListener", "Companion", "app_debug"})
public final class CameraOverlayViewGroup extends android.widget.FrameLayout {
    private android.graphics.Paint mBackgroundPaint;
    private float mCx;
    private float mCy;
    private float myWidth;
    private float myHeight;
    private final int mTutorialColor = 0;
    @org.jetbrains.annotations.Nullable()
    private com.siliconstack.stockcheck.view.control.CameraOverlayViewGroup.CameraOverlayViewGroupListener cameraOverlayViewGroupListener;
    private static final float RADIUS = 200.0F;
    public static final com.siliconstack.stockcheck.view.control.CameraOverlayViewGroup.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final float getMyWidth() {
        return 0.0F;
    }
    
    public final void setMyWidth(float p0) {
    }
    
    public final float getMyHeight() {
        return 0.0F;
    }
    
    public final void setMyHeight(float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siliconstack.stockcheck.view.control.CameraOverlayViewGroup.CameraOverlayViewGroupListener getCameraOverlayViewGroupListener() {
        return null;
    }
    
    public final void setCameraOverlayViewGroupListener(@org.jetbrains.annotations.Nullable()
    com.siliconstack.stockcheck.view.control.CameraOverlayViewGroup.CameraOverlayViewGroupListener p0) {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    private final void init() {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public CameraOverlayViewGroup(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public CameraOverlayViewGroup(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CameraOverlayViewGroup(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public CameraOverlayViewGroup(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/siliconstack/stockcheck/view/control/CameraOverlayViewGroup$CameraOverlayViewGroupListener;", "", "onTouch", "", "motionEvent", "Landroid/view/MotionEvent;", "app_debug"})
    public static abstract interface CameraOverlayViewGroupListener {
        
        public abstract void onTouch(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent motionEvent);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/siliconstack/stockcheck/view/control/CameraOverlayViewGroup$Companion;", "", "()V", "RADIUS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}