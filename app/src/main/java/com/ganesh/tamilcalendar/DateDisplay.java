package com.ganesh.tamilcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DateDisplay extends AppCompatActivity {
    TextView nalatime1,nalatime2,day,date,raguText,yemaText,disp;
    Button left,right;
    String d,kil;
    float x1,x2,y1,y2;
    int days;
    String nala,ragu,yama,marri;
    int m,tempkila,temp;
    String[] nalaarr={"06:15-07:15 03:15-04:15","06:15-07:15 04:45-05:45","10:45-11:45 04:45-05:45","09:15-10:15 04:45-05:45","10:45-11:45 12:15-01:15","09:15-10:15 04:45-05:45","07:45-08:45 04:45-05:45"};
    String[] raghu={"16.30-18.00","07.30-09.00","15.00-16.30","12.00-13.30","13.30-15.00","10.30-12.00","09.00-10.30"};
    String[] yema={"12.00-01.30","10.30-12.00","09.00-10.30","07.30-09.00","06.00-07.30","03.00-04.30","01.30-03.00"};
    String[] kilamai={"ஞாயிறு","திங்கள்","செவ்வாய்","புதன்","வியாழன்","வெள்ளி","சனி"};
    String[] months={"சித்திரை","வைகாசி","ஆனி","ஆடி","ஆவணி","புரட்டாசி","ஐப்பசி","கார்த்திகை","மார்கழி","தை","மாசி","பங்குனி"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_display);
        nalatime1=(TextView)findViewById(R.id.morningtime);
        nalatime2=(TextView)findViewById(R.id.eveningtime);
        raguText=(TextView) findViewById(R.id.raguTime);
        disp=(TextView) findViewById(R.id.dispdate);
        yemaText=(TextView)findViewById(R.id.yamatime);
        day=(TextView)findViewById(R.id.day);
        date=(TextView)findViewById(R.id.date);
        d=getIntent().getExtras().getString("date");
        kil=getIntent().getExtras().getString("kilamai");
        int kilamai1= Integer.parseInt(kil);
        nala=nalaarr[kilamai1];
        tempkila=kilamai1;
        temp=Integer.parseInt(d);
        ragu=raghu[kilamai1];
        yama=yema[kilamai1];
        days=getIntent().getExtras().getInt("days");
        marri=getIntent().getExtras().getString("marri");
        m=getIntent().getExtras().getInt("month");
        left=(Button)findViewById(R.id.left);
        right=(Button)findViewById(R.id.right);
        call();
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dayLeft();;
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dayRight();
            }
        });
    }
    public boolean onTouchEvent(MotionEvent t) {
        switch (t.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1=t.getX();
                y1=t.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2=t.getX();
                y2=t.getY();
                if(x1<x2)
                {
                    if(x2-x1 >Math.abs(y2-y1))
                        dayLeft();

                }
                if(x1>x2) {
                    if(x1-x2 >Math.abs(y2-y1))
                        dayRight();
                }
                break;
        }
        return false;
    }
    public void dayLeft(){
        tempkila=Math.abs((tempkila-1)%7);
        temp--;
        call();
    }
    public void dayRight(){
        tempkila=(tempkila+1)%7;
        temp++;
        call();
    }
    public void call(){
        if(temp>0&&temp<=days) {
            nala = nalaarr[tempkila];
            String[] nal = nala.split(" ");
            ragu = raghu[tempkila];
            yama = yema[tempkila];
            nalatime1.setText(nal[0]);
            nalatime2.setText(nal[1]);
            String fr = months[m] + ", ஹேவிளம்பி";
            disp.setText(fr);
            disp.setTextSize(8 * getResources().getDisplayMetrics().density);
            date.setText(String.valueOf(temp));
            raguText.setText(ragu);
            yemaText.setText(yama);
            day.setText(kilamai[tempkila]);
        }if(temp<=0){
            temp=1;
        }
        else if(temp>days){
            temp=days;
        }
    }
}
