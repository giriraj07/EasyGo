package com.example.easygo;
import android.os.Bundle;
import android.util.Log;
import android.view.textservice.TextInfo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONArray;
import org.json.JSONObject;

public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_main);
        TextInputEditText input=findViewById(R.id.input);
        Integer Busno=Integer.parseInt(input.getText().toString());
        System.out.println(Busno);
        Log.e("TAG",Busno.toString());
    }
}
