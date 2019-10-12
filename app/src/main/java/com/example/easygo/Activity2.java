package com.example.easygo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;


public class Activity2  extends AppCompatActivity {
    EditText et;TextView tvBusno;
    @Override
    public void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity2_main);
        et= findViewById(R.id.input);
        Button go = findViewById(R.id.btnSearch);
         tvBusno=findViewById(R.id.tvBusNo);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue requestQueue = Volley.newRequestQueue(Activity2.this);
                String url = "https://raw.githubusercontent.com/djinn/DTC-Routes/master/dtc_data.json";
                JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.
                        Method.GET, url, null, new Response.Listener<JSONObject>(){

                    @Override
                    public void onResponse(JSONObject response) {
                        if(response!=null)
                            Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_LONG).show();
                         //   tvJson.setText(response.toString());
                    }
                }
                ,new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        volleyError.printStackTrace();
                        Log.d("Error = ", volleyError.toString());
                       Toast.makeText(getApplicationContext(),"Error Arrives",Toast.LENGTH_SHORT).show();
                        //pDialog.hide();
                    }
                });
                requestQueue.add(jsonObjectRequest);
            }
        });
    }
}
