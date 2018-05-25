package com.luckyshane.cnblogs.model.api

import retrofit2.Retrofit

interface ApiService {

    //fun




    companion object Factory {
        private const val BASE_URL = "http://wcf.open.cnblogs.com/"

        fun create(): ApiService {
            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .build()
            return retrofit.create(ApiService::class.java)
        }
    }




}