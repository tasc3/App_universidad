package com.example.familia.app_universidad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class carreras extends AppCompatActivity {

    private String[] carreras={"Ingeniería de Sistemas", "Enfermería", "Desarrollo Familiar", "Trabajo Social", "Geología"};
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carreras);

        lv1= (ListView) findViewById(R.id.listView);
        ArrayAdapter adap= new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, carreras);
        lv1.setAdapter(adap);


    }
}
