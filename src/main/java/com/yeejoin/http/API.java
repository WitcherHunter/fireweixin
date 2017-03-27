package com.yeejoin.http;

import com.yeejoin.bean.EquipResponse;
import com.yeejoin.bean.MaterialRequest;
import com.yeejoin.bean.MaterialResponse;
import com.yeejoin.bean.NotificationRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by zhou on 2017/3/20.
 */
public interface API{

    @POST("phoneapp/query/equip")
    Call<EquipResponse> getEquip(@Query("rfid") String rfid);

    @POST("sendall")
    Call<String> sendNotification(@Query("access_token") String token, @Body NotificationRequest body);

    @POST("batchget_material")
    Call<MaterialResponse> getMaterial(@Query("access_token") String token, @Body MaterialRequest body);
}
