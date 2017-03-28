//package com.yeejoin.http
//
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
///**
// * Created by zhou on 2017/3/13.
// */
//
//class RetrofitFactory {
//    companion object{
//        var api : API =  Retrofit.Builder()
//                .baseUrl("http://115.159.241.129:8080/FireIotPlatform/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//                .create(API::class.java)
//    }
//}