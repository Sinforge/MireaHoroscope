package ru.sinforge.mireahoroscope.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class ControllerApi {
    private  String sign;
    private  String day;


    public ControllerApi (String sign, String day) {
        this.sign = sign;
        this.day = day;
    }


    public void start(Callback<HoroscopeModel> callback) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://sameer-kumar-aztro-v1.p.rapidapi.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        HoroscopeApi horoscopeApi = retrofit.create(HoroscopeApi.class);
        Call<HoroscopeModel> call = horoscopeApi.GetHoroscopeInfo(sign, day);
        call.enqueue(callback);

    }
}
