package ru.sinforge.mireahoroscope;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ru.sinforge.mireahoroscope.API.ControllerApi;
import ru.sinforge.mireahoroscope.API.HoroscopeModel;
import ru.sinforge.mireahoroscope.API.ResponseModel;

import javax.xml.transform.Result;


public class MainActivity extends AppCompatActivity {
    private TextView Result_API_TextView;


    //Can change with anonymous interface
    public class ReloadText implements Callback<HoroscopeModel> {


        @Override
        public void onResponse(Call<HoroscopeModel> call, Response<HoroscopeModel> response) {
            Result_API_TextView.setText(response.body().toString());
        }

        @Override
        public void onFailure(Call<HoroscopeModel> call, Throwable t) {
            Result_API_TextView.setText("We got error");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result_API_TextView = findViewById(R.id.textView);
        ControllerApi controllerApi = new ControllerApi("Aquarius", "today");


        controllerApi.start(new ReloadText());




    }
}