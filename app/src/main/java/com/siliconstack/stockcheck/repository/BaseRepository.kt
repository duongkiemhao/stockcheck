package com.siliconstack.stockcheck.repository

import android.arch.lifecycle.MutableLiveData
import com.bol.instantapp.exception.AppException
import com.bol.instantapp.exception.NoNetworkException
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.model.ErrorResponse
import com.siliconstack.stockcheck.model.Resource
import com.siliconstack.stockcheck.view.utility.Utility
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

open class BaseRepository{
    companion object {
        open class MyRetrofitCallback<T>(var data: MutableLiveData<Resource<T>>) : Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {

                    if (response.body() != null)
                        data.value = Resource.success(response.body());
                    else {
                        var errorResponse = ErrorResponse()

                        if (response.errorBody() != null) {
                            try {
                                val jsonObject = JSONObject(response.errorBody()!!.string())
                                if (jsonObject != null) {
                                    data.value = Resource.error(AppException(Exception(jsonObject.get("Message") as String? ?: "")))
                                } else {
                                    data.value = Resource.error(AppException(Exception("Parsing exception " + jsonObject.toString())))
                                }
                            } catch (exp: Exception) {
                                data.value = Resource.error(AppException(Exception("Unknown exception " + exp.toString())))
                            }

                        } else data.value = Resource.error(AppException(Exception("Unknown exception")))

                    }

            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                var exception = AppException(t)
                if(!Utility.isNetworkAvailable(AppApplication.instance)) {
                    exception = NoNetworkException(Exception(AppApplication.instance.getString(R.string.msg_no_network)))
                }
                data.value = Resource.error(exception)
            }

        }


    }
}