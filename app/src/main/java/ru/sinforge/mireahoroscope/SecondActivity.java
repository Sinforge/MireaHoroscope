package ru.sinforge.mireahoroscope;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import ru.sinforge.mireahoroscope.R;

public class SecondActivity extends AppCompatActivity {
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        result = findViewById(R.id.textView);
        result.setText(getIntent().getStringExtra("Result"));
    }
}