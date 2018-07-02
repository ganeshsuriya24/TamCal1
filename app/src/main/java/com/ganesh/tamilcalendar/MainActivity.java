package com.ganesh.tamilcalendar;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatabaseHelpernew md;
    Button x1,x2;
    String y,m;
    int n= 1,days,yearCount=0,monthCount = 1;
    float v1,v2,y1,y2;
    TextView monthName,yearName;
    String spl,marri;

    String[] years = {"ஹேவிளம்பி","விளம்பி "};
    String[] months={"சித்திரை","வைகாசி","ஆனி","ஆடி","ஆவணி","புரட்டாசி","ஐப்பசி","கார்த்திகை","மார்கழி","தை","மாசி","பங்குனி"};
    Button b[] = new Button[42];
    TextView sptv[] = new TextView[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        x1 = (Button) findViewById(R.id.right);
        x2 = (Button) findViewById(R.id.left);
        b[0] = (Button) findViewById(R.id.button0);
        b[1] = (Button) findViewById(R.id.button1);
        b[2] = (Button) findViewById(R.id.button2);
        b[3] = (Button) findViewById(R.id.button3);
        b[4] = (Button) findViewById(R.id.button4);
        b[5] = (Button) findViewById(R.id.button5);
        b[6] = (Button) findViewById(R.id.button7);
        b[7] = (Button) findViewById(R.id.button8);
        b[8] = (Button) findViewById(R.id.button9);
        b[9] = (Button) findViewById(R.id.button10);
        b[10] = (Button) findViewById(R.id.button11);
        b[11] = (Button) findViewById(R.id.button12);
        b[12] = (Button) findViewById(R.id.button13);
        b[13] = (Button) findViewById(R.id.button14);
        b[14] = (Button) findViewById(R.id.button15);
        b[15] = (Button) findViewById(R.id.button16);
        b[16] = (Button) findViewById(R.id.button17);
        b[17] = (Button) findViewById(R.id.button18);
        b[18] = (Button) findViewById(R.id.button19);
        b[19] = (Button) findViewById(R.id.button20);
        b[20] = (Button) findViewById(R.id.button21);
        b[21] = (Button) findViewById(R.id.button22);
        b[22] = (Button) findViewById(R.id.button23);
        b[23] = (Button) findViewById(R.id.button24);
        b[24] = (Button) findViewById(R.id.button26);
        b[25] = (Button) findViewById(R.id.button27);
        b[26] = (Button) findViewById(R.id.button28);
        b[27] = (Button) findViewById(R.id.button29);
        b[28] = (Button) findViewById(R.id.button30);
        b[29] = (Button) findViewById(R.id.button31);
        b[30] = (Button) findViewById(R.id.button32);
        b[31] = (Button) findViewById(R.id.button33);
        b[32] = (Button) findViewById(R.id.button34);
        b[33] = (Button) findViewById(R.id.button35);
        b[34] = (Button) findViewById(R.id.button6);
        b[35] = (Button) findViewById(R.id.button);
        b[36] = (Button) findViewById(R.id.button36);
        b[37] = (Button) findViewById(R.id.button37);
        b[38] = (Button) findViewById(R.id.button38);
        b[39] = (Button) findViewById(R.id.button39);
        b[40] = (Button) findViewById(R.id.button40);
        b[41] = (Button) findViewById(R.id.button41);
        sptv[0] = (TextView) findViewById(R.id.t1);
        sptv[1] = (TextView) findViewById(R.id.t2);
        sptv[2] = (TextView) findViewById(R.id.t3);
        sptv[3] = (TextView) findViewById(R.id.t4);
        sptv[4] = (TextView) findViewById(R.id.t5);
        sptv[5] = (TextView) findViewById(R.id.t6);
        sptv[6] = (TextView) findViewById(R.id.t7);
        sptv[7] = (TextView) findViewById(R.id.t8);
        sptv[8] = (TextView) findViewById(R.id.t9);
        sptv[9] = (TextView) findViewById(R.id.t10);
        yearName = (TextView) findViewById(R.id.year);
        monthName=(TextView) findViewById(R.id.monthName);
        for (int i = 0; i < 42; i++) {
            String s = Integer.toString(i + 1);
            b[i].setText(" ");
        }
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Specialevents.class);
                i.putExtra("spl",spl);
                startActivity(i);
            }
        });
        b[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[0].getText().toString());
                dateListener(r,0);
            }
        });
        b[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[1].getText().toString());
                dateListener(r,1);
            }
        });
        b[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[2].getText().toString());
                dateListener(r,2);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[3].getText().toString());
                dateListener(r,3);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[4].getText().toString());
                dateListener(r,4);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[5].getText().toString());
                dateListener(r,5);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[6].getText().toString());
                dateListener(r,6);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[7].getText().toString());
                dateListener(r,7);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[8].getText().toString());
                dateListener(r,8);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[9].getText().toString());
                dateListener(r,9);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[10].getText().toString());
                dateListener(r,10);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[11].getText().toString());
                dateListener(r,11);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[12].getText().toString());
                dateListener(r,12);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[13].getText().toString());
                dateListener(r,13);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[14].getText().toString());
                dateListener(r,14);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[15].getText().toString());
                dateListener(r,15);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[16].getText().toString());
                dateListener(r,16);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[17].getText().toString());
                dateListener(r,17);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[18].getText().toString());
                dateListener(r,18);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[19].getText().toString());
                dateListener(r,19);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[20].getText().toString());
                dateListener(r,20);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[21].getText().toString());
                dateListener(r,21);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[22].getText().toString());
                dateListener(r,22);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[23].getText().toString());
                dateListener(r,23);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[24].getText().toString());
                dateListener(r,24);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[25].getText().toString());
                dateListener(r,25);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[26].getText().toString());
                dateListener(r,26);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[27].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[27].getText().toString());
                dateListener(r,27);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[28].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[28].getText().toString());
                dateListener(r,28);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[29].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[29].getText().toString());
                dateListener(r,29);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[30].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[30].getText().toString());
                dateListener(r,30);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[31].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[31].getText().toString());
                dateListener(r,31);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[32].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[32].getText().toString());
                dateListener(r,32);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[33].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[33].getText().toString());
                dateListener(r,33);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[34].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[34].getText().toString());
                dateListener(r,34);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[35].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[35].getText().toString());
                dateListener(r,35);
            }
        });
        b[36].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[36].getText().toString());
                dateListener(r,36);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[37].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[37].getText().toString());
                dateListener(r,37);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[38].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[38].getText().toString());
                dateListener(r,38);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[39].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[39].getText().toString());
                dateListener(r,39);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[40].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[40].getText().toString());
                dateListener(r,40);
                //Toast.makeText(getBaseContext(), ""+r, Toast.LENGTH_LONG).show();
            }
        });
        b[41].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(b[41].getText().toString());
                dateListener(r,41);
            }
        });
        on();
        x1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                monRight();
            }
        });
        x2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                monLeft();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public boolean onTouchEvent(MotionEvent t)
    {
        switch (t.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                v1=t.getX();
                y1=t.getY();
                break;
            case MotionEvent.ACTION_UP:
                v2=t.getX();
                y2=t.getY();
                if(v1<v2)
                    monLeft();
                if(v1>v2)
                    monRight();
                break;
        }
        return false;
    }
    public void monLeft(){

        cursorFunc();
    }
    public void monRight(){
        cursorFunc();
    }
    protected void on() {
        md = new DatabaseHelpernew(this);

        cursorFunc();;

    }
    protected void cursorFunc(){
        Cursor data = md.getData(n);
        while(data.moveToNext()) {
            String s1 = data.getString(2);
            String s2 = data.getString(3);
            marri=data.getString(4);
            spl=data.getString(5);
            y=data.getString(6);
            m=data.getString(7);
            int day = Integer.parseInt(s1);
            monthName.setText(m);
            yearName.setText(y);
            days = Integer.parseInt(s2);
            for (int i = 0; i < day; i++) {
                b[i].setText("");
                b[i].setEnabled(false);
            }
            int j = day;
            for (int i = 1; i <= days; i++,j++) {
                String f = Integer.toString(i);
                b[j].setEnabled(true);
                b[j].setText(f);
                if(j%7==0)
                    b[j].setTextColor(Color.parseColor("#FF0000"));
            }
            for (int i = j; i <= 41; i++) {
                b[i].setText("");
                b[i].setEnabled(false);
            }
            String spArr[] = spl.split("t");
            for(int i=0;i<spArr.length;i++){
                sptv[i].setVisibility(View.VISIBLE);
                sptv[i].setText(spArr[i]);
            }
            for(int i=spArr.length;i<10;i++){
                sptv[i].setVisibility(View.INVISIBLE);
            }
        }
    }
    protected void dateListener(int d,int a){
        Intent i=new Intent(MainActivity.this,DateDisplay.class);
        String s=Integer.toString(d);
        String as=Integer.toString(a%7);
        i.putExtra("kilamai",as);
        i.putExtra("month",n-1);
        i.putExtra("date",s);
        i.putExtra("days",days);
        i.putExtra("marri",marri);
        i.putExtra("spl",spl);
        startActivity(i);
    }
}

