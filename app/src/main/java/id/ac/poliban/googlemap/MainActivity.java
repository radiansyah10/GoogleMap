package id.ac.poliban.googlemap;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btGetLocationBaseServices = findViewById(R.id.button);
//jangan lupa java 1.8 diaktifikan untuk menggunakan lambda
        btGetLocationBaseServices.setOnClickListener(v -> {
            Intent intent = new Intent(this, MapsActivity.class);
            startActivity(intent);
        });
    }
}