package com.example.easygo;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class DisplayRoute extends AppCompatActivity {
    EditText et1, et2;
    Button btnGo;
    ListView listRoute;
    ArrayList<String> Buses = new ArrayList<>();
    TextView tv3;
    public HashMap<String, ArrayList<String>> map = MainActivity.map;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv3 = findViewById(R.id.tv3);
        btnGo = findViewById(R.id.btnGo);
        listRoute = findViewById(R.id.listRoute);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Buses.clear();
                String source = et1.getText().toString();
                String dest = et2.getText().toString();
                Log.d("TAG", source + " " + dest);
                if (TextUtils.isEmpty(source) || TextUtils.isEmpty(dest))
                    Toast.makeText(getBaseContext(), "Please Enter Some characters", Toast.LENGTH_SHORT).show();
                else {
                    for (String key : map.keySet()) {
                        ArrayList<String> Stops = map.get(key);
                        Log.d("TAG", Stops.toString());
                        int c = 0;
                        for (String stops : Stops) {
                            if (stops.equals(source))
                                c++;
                            if (stops.equals(dest))
                                c++;
                        }
                        if (c == 2) {
                            Buses.add((Buses.size() + 1) + ". " + source + " -> " + key + " -> " + dest);
                            Log.d("TAG", Buses.size() + "");
                        }
                    }
                    if (Buses.size() == 0) {
                        tv3.setText("No Suggested Routes Available");
                    } else {
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), R.layout.item_row2, R.id.tv4, Buses);
                        listRoute.setAdapter(adapter);
                    }
                }
            }

        });

    }
}
