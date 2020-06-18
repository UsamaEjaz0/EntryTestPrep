package com.usamaejaz.entrytestprep;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {
    boolean firsttime;
    EditText name;
    Button cont;
    String namaywa;
    // MY_PREFS_NAME - a static String variable like:
    public static final String MY_PREFS_NAME = "MyPrefsFile";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = getSharedPreferences(WelcomeActivity.MY_PREFS_NAME, MODE_PRIVATE);
        if(prefs.getString("name", "No name defined").equals("No name defined")){

        name=(EditText) findViewById(R.id.namee);

        cont= (Button) findViewById(R.id.b1);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaywa=name.getText().toString();
                if(namaywa.equals("")) {
                    Toast.makeText(WelcomeActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }else{

                    saveName();
                    Intent i = new Intent(WelcomeActivity.this, MenuActivity.class);
                    startActivity(i);
                    finish();
                }




            }
        });}
        else{
    Intent i = new Intent(WelcomeActivity.this, MenuActivity.class);
    startActivity(i);
    finish();
        }
        }
public void saveName(){
    SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
    editor.putString("name",namaywa);

    editor.commit();
}





    }

