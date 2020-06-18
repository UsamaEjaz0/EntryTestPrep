package com.usamaejaz.entrytestprep;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdView;

public class CollegeYearActivity extends AppCompatActivity {
    Button year1,year2;
    static String caller2;
AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_year);
        year1=(Button)findViewById(R.id.yearone);
        year2=(Button)findViewById(R.id.yeartwo);

        year1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caller2="1";
                if(MenuActivity.caller.equals("maths")){
                    QuestionScreen.start=0;
                    Intent i = new Intent(CollegeYearActivity.this, TopicsSubjects.class);
                    startActivity(i);

                }
                if(MenuActivity.caller.equals("physics")){
                    QuestionScreen.start=180;
                    Intent i = new Intent(CollegeYearActivity.this, TopicsSubjects.class);
                    startActivity(i);

                }
                if(MenuActivity.caller.equals("chemistry")){
                    QuestionScreen.start=694;
                    Intent i = new Intent(CollegeYearActivity.this, TopicsSubjects.class);
                    startActivity(i);

                }

            }
        });

        year2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caller2="2";
                if(MenuActivity.caller.equals("maths")){
                    QuestionScreen.start=354;
                    Intent i = new Intent(CollegeYearActivity.this, TopicsSubjects.class);
                    startActivity(i);

                }
                if(MenuActivity.caller.equals("physics")){
                    QuestionScreen.start=494;
                    Intent i = new Intent(CollegeYearActivity.this, TopicsSubjects.class);
                    startActivity(i);

                }
                if(MenuActivity.caller.equals("chemistry")){
                    QuestionScreen.start=859;
                    Intent i = new Intent(CollegeYearActivity.this, TopicsSubjects.class);
                    startActivity(i);

                }
            }
        });


    }

}
