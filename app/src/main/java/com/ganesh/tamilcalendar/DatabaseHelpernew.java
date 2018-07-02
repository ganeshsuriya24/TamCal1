package com.ganesh.tamilcalendar;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelpernew extends SQLiteOpenHelper {
    private static  final String dbname="Calender.db";
    private static  final String TAG="Database Helper";
    private static  final String Col1="ID";
    private static  final String tableYear="ஹேவிளம்பி";
    //  private static  final String tablename2="year2";
    private static  final String month="Month";
    private static String[] months={"சித்திரை","வைகாசி","ஆனி","ஆடி","ஆவணி","புரட்டாசி","ஐப்பசி","கார்த்திகை","மார்கழி","தை","மாசி","பங்குனி"};
    String[] years = {"ஹேவிளம்பி","விளம்பி "};
    private static  final String day="Day";
    private static  final String days="Days";
    String cmd;
    private static  final String monthName="monthname",yearname="yearname";
    private static final String marriageday="Marriageday";
    private static final String specialday="Specialday";
    public DatabaseHelpernew(Context context) {
        super(context,dbname,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable="CREATE TABLE "+tableYear + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, "+month+" INTEGER, " + day + " INTEGER, " + days + " INTEGER, "+marriageday+" TEXT, "+specialday+" TEXT,"+yearname+" TEXT, "+monthName+" TEXT)";
        db.execSQL(createTable);
        String marri="4 8 11 17 24 25 27 29 31";
        String spl="1தமிழ் புத்தாண்டுt3ஈஸ்டர்t13அமாவாசைt15அக்ஷய திருதிt16அக்ஷய திருதிt17ஸ்ரீமத் சங்கர ஜெயந்திt18மே தினம்t21அக்னி நட்சத்திரம் ஆரம்பம்t27சித்ரா பௌர்ணமி";
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(1,5,31,'"+marri+"','"+spl+"','"+years[0]+"','"+months[0]+"')";
        db.execSQL(cmd);
        marri="3 4 8 15 18 21 22 25 28 31";
        //  spl="14அக்னி நட்சத்திரம் நிறைவுt11அமாவாசைt25பௌர்ணமிt"; //26பௌர்ணமி
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(2,1,31,'"+marri+"','"+spl+"','"+years[0]+"','"+months[1]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(3,4,32,'"+marri+"','"+spl+"','"+years[0]+"','"+months[2]+"')";
        marri="3 4 8 15 18 21 22 25 28 31";
        //   spl="14அக்னி நட்சத்திரம் நிறைவுt11அமாவாசைt25பௌர்ணமிt26பௌர்ணமி";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(4,1,31,'"+marri+"','"+spl+"','"+years[0]+"','"+months[3]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(5,4,31,'"+marri+"','"+spl+"','"+years[0]+"','"+months[4]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(6,0,31,'"+marri+"','"+spl+"','"+years[0]+"','"+months[5]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(7,3,30,'"+marri+"','"+spl+"','"+years[0]+"','"+months[6]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(8,5,29,'"+marri+"','"+spl+"','"+years[0]+"','"+months[7]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(9,6,29,'"+marri+"','"+spl+"','"+years[0]+"','"+months[8]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(10,0,30,'"+marri+"','"+spl+"','"+years[0]+"','"+months[9]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(11,2,30,'"+marri+"','"+spl+"','"+years[0]+"','"+months[10]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(12,4,30,'"+marri+"','"+spl+"','"+years[0]+"','"+months[11]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(13,6,31,'"+marri+"','"+spl+"','"+years[1]+"','"+months[0]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(14,2,31,'"+marri+"','"+spl+"','"+years[1]+"','"+months[1]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(15,5,32,'"+marri+"','"+spl+"','"+years[1]+"','"+months[2]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(16,2,31,'"+marri+"','"+spl+"','"+years[1]+"','"+months[3]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(17,5,31,'"+marri+"','"+spl+"','"+years[1]+"','"+months[4]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(18,1,31,'"+marri+"','"+spl+"','"+years[1]+"','"+months[5]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(19,4,30,'"+marri+"','"+spl+"','"+years[1]+"','"+months[6]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(20,6,29,'"+marri+"','"+spl+"','"+years[1]+"','"+months[7]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(21,0,30,'"+marri+"','"+spl+"','"+years[1]+"','"+months[8]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(22,2,29,'"+marri+"','"+spl+"','"+years[1]+"','"+months[9]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(23,3,30,'"+marri+"','"+spl+"','"+years[1]+"','"+months[10]+"')";
        db.execSQL(cmd);
        cmd = "INSERT INTO "+ tableYear + "("+month+","+day+","+days+","+marriageday+","+specialday+") VALUES(24,5,30,'"+marri+"','"+spl+"','"+years[1]+"','"+months[11]+"')";
        db.execSQL(cmd);

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public Cursor getData(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        String query="SELECT * FROM "+tableYear+" WHERE ID =?";
        Cursor data = db.rawQuery(query,new String[]{String.valueOf(id)});
        return data;
    }
}

