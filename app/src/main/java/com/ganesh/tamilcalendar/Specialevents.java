package com.ganesh.tamilcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Specialevents extends AppCompatActivity {
    private ListView lv;
    int width, height;
    String spl;
    String[] splArr;
    String[] sl={"pyhgdg","pyhgdg","pyhgdg","pyhgdg","pyhgdg","pyhgdg","pyhgdg","pyhgdg","pyhgdg","pyhgdg","pyhgdg","pyhgdg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialevents);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        width = dm.widthPixels;
        height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .6));
        spl = getIntent().getExtras().getString("spl");
        splArr=spl.split(" ");
        lv=(ListView) findViewById(R.id.lv);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,android.R.id.text1,splArr);
        lv.setAdapter(arrayAdapter);

    }
}
