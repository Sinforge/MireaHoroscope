package ru.sinforge.mireahoroscope.API;

import okhttp3.Response;

public class ResponseModel {

    HoroscopeModel response_from_api;
    boolean status_code;

    public ResponseModel (HoroscopeModel response_from_api, boolean status_code) {
        this.response_from_api = response_from_api;
        this.status_code = status_code;
    }

    @Override
    public String toString() {
        return "ResponseModel{" +
                "response_from_api=" + response_from_api.toString() +
                ", status_code=" + status_code +
                '}';
    }
}
