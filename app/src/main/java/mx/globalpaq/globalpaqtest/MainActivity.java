package mx.globalpaq.globalpaqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mx.globalpaq.globalpaqtest.network.API;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialize network request queue
        API.init(this);
        setContentView(R.layout.activity_main);
    }
}