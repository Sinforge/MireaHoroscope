package ru.sinforge.mireahoroscope.API;

import retrofit2.Call;
import retrofit2.http.*;

public interface HoroscopeApi {
    @POST("/")
    @Headers({
            "X-RapidAPI-Key: 11c4589b27msh1bbbb4ad2a691abp1801a9jsna70929a3814f",
            "X-RapidAPI-Host: sameer-kumar-aztro-v1.p.rapidapi.com"
    })
    Call<HoroscopeModel> GetHoroscopeInfo (@Query("sign") String sign, @Query("day") String day);
}
