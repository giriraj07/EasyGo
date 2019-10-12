package com.example.easygo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;


public class DisplayStops extends AppCompatActivity {
    EditText et;TextView tvBusno;
    TextView Source,Dest;
    HashMap<String,ArrayList<String>> map=MainActivity.map;

    @Override
    public void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity2_main);
        et= findViewById(R.id.input);
        Button go = findViewById(R.id.btnSearch);
        tvBusno=findViewById(R.id.tvBusNo);
        Source=findViewById(R.id.tvSource);
        Dest=findViewById(R.id.tvDest);
        final ListView lvStops=findViewById(R.id.lvStops);

         go.setOnClickListener(new View.OnClickListener() {
             @SuppressLint("ResourceAsColor")
             @Override
               public void onClick(View v) {
                 String Busno = et.getText().toString();
                 ArrayList<String> routeList = map.get(Busno);
                 if (routeList == null) {
                     tvBusno.setText("Please Enter A valid Bus No.");
                     tvBusno.setVisibility(View.VISIBLE);
                     Source.setVisibility(View.GONE);
                     Dest.setVisibility(View.GONE);
                     lvStops.setVisibility(View.GONE);
                     findViewById(R.id.tvbusList).setVisibility(View.GONE);
                     tvBusno.setTextColor(android.R.color.holo_orange_light);
                     Toast.makeText(getBaseContext(),"Please Enter Valid Bus No. ",Toast.LENGTH_LONG).show();
                     // tvBusno.setTextSize(200);
                     return;
                 }
                 findViewById(R.id.tvbusList).setVisibility(View.VISIBLE);
                 Source.setVisibility(View.VISIBLE);
                 Dest.setVisibility(View.VISIBLE);
                 lvStops.setVisibility(View.VISIBLE);
                 tvBusno.setText(Busno);
                 Source.setText("Source : "+routeList.get(1));
                 Dest.setText("Destination : " + routeList.get(routeList.size() - 1));
                 ArrayAdapter<String> adapter = new ArrayAdapter<String
                         >(
                         getBaseContext(), R.layout.item_row1, R.id.tv_row, routeList);
                 lvStops.setAdapter(adapter);
             }

             });
         }
}
