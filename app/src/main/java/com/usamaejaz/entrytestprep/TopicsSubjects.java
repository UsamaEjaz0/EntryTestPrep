package com.usamaejaz.entrytestprep;

import android.content.Intent;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TopicsSubjects extends AppCompatActivity {
     Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
     TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics_subjects);

        t1=(TextView)findViewById(R.id.textchap);
        c1=(Button)findViewById(R.id.ch1);

        c2=(Button)findViewById(R.id.ch2);
        c3=(Button)findViewById(R.id.ch3);
        c4=(Button)findViewById(R.id.ch4);
        c5=(Button)findViewById(R.id.ch5);
        c6=(Button)findViewById(R.id.ch6);
        c7=(Button)findViewById(R.id.ch7);
        c8=(Button)findViewById(R.id.ch8);
        c9=(Button)findViewById(R.id.ch9);
        c10=(Button)findViewById(R.id.ch10);
        c11=(Button)findViewById(R.id.ch11);

        chooseTopics();

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+14;
                }

            else if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("2")){
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+29;
            }else{

                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+15;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("2")){
                    QuestionScreen.start=QuestionScreen.start+30;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+29;
                }else{
                QuestionScreen.start=QuestionScreen.start+20;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+30;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("2")){
                    QuestionScreen.start=QuestionScreen.start+60;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+29;
                }else{
                QuestionScreen.start=QuestionScreen.start+40;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+45;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("2")){
                    QuestionScreen.start=QuestionScreen.start+90;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+29;
                }else{
                QuestionScreen.start=QuestionScreen.start+60;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+60;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("2")){
                    QuestionScreen.start=QuestionScreen.start+120;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+29;
                }else{
                QuestionScreen.start=QuestionScreen.start+80;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+75;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("2")){
                    QuestionScreen.start=QuestionScreen.start+150;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+29;
                }else{
                QuestionScreen.start=QuestionScreen.start+100;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+90;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("2")){
                    QuestionScreen.start=QuestionScreen.start+180;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+29;
                }
                else if(MenuActivity.caller.equals("physics") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+120;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+53;}
                    else{
                QuestionScreen.start=QuestionScreen.start+120;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}


                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+105;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("2")){
                    QuestionScreen.start=QuestionScreen.start+210;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+29;
                }else{
                QuestionScreen.start=QuestionScreen.start+140;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+120;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else{
                QuestionScreen.start=QuestionScreen.start+160;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+135;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else{
                QuestionScreen.start=QuestionScreen.start+180;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MenuActivity.caller.equals("chemistry") && CollegeYearActivity.caller2.equals("1")){
                    QuestionScreen.start=QuestionScreen.start+150;
                    QuestionScreen.num=QuestionScreen.start;
                    QuestionScreen.end=QuestionScreen.start+14;
                }else{
                QuestionScreen.start=QuestionScreen.start+200;
                QuestionScreen.num=QuestionScreen.start;
                QuestionScreen.end=QuestionScreen.start+19;}
                Intent i = new Intent(TopicsSubjects.this, QuestionScreen.class);
                startActivity(i);
            }
        });




    }

    public void chooseTopics(){
        if(MenuActivity.caller.equals("maths") && CollegeYearActivity.caller2.equals("1")){

            c1.setText("Ch 1: Number Systems");
            c2.setText("Ch 2: Sets, Functions and groups");
            c3.setText("Ch 3: Matrices and Determinants");
            c4.setText("Ch 4: Quadratic Equations");
            c5.setText("Ch 5: Paritial Fractions");
            c6.setText("Ch 6: Sequence and Series");
            c7.setText("Ch 7: Permutations and Combinations");
            c8.setText("Ch 8: Mathematical Induction");
            c9.setText("Ch 9,10,11,12,13,14: Trignometry");

            c10.setEnabled(false);
            c11.setEnabled(false);
            c10.setBackgroundColor(Color.TRANSPARENT);
            c11.setBackgroundColor(Color.TRANSPARENT);
        }
        if(MenuActivity.caller.equals("maths") && CollegeYearActivity.caller2.equals("2")){
            c1.setText("Ch 1: Functions and Limits");
            c2.setText("Ch 2: Differentiation");
            c3.setText("Ch 3: Integration");
            c4.setText("Ch 4: Intro to Analytical Geometry");
            c5.setText("Ch 5: Linear Inequalities");
            c6.setText("Ch 6: Conic Section");
            c7.setText("Ch 7: Vectors");

            c8.setEnabled(false);
            c9.setEnabled(false);
            c10.setEnabled(false);
            c11.setEnabled(false);
            c8.setBackgroundColor(Color.TRANSPARENT);
            c9.setBackgroundColor(Color.TRANSPARENT);
            c10.setBackgroundColor(Color.TRANSPARENT);
            c11.setBackgroundColor(Color.TRANSPARENT);
        }
        if(MenuActivity.caller.equals("physics")&& CollegeYearActivity.caller2.equals("1")){
            c1.setText("Ch 1: Measurements");
            c2.setText("Ch 2: Vectors and Equilibrium");
            c3.setText("Ch 3: Motion and Force");
            c4.setText("Ch 4: Work and Energy");
            c5.setText("Ch 5: Circular Motion");
            c6.setText("Ch 6: Fluid Dynamics (unavailable)");
            c7.setText("Ch 7,8,9,10,11");

            c8.setEnabled(false);
            c9.setEnabled(false);
            c10.setEnabled(false);
            c11.setEnabled(false);
            c8.setBackgroundColor(Color.TRANSPARENT);
            c9.setBackgroundColor(Color.TRANSPARENT);
            c10.setBackgroundColor(Color.TRANSPARENT);
            c11.setBackgroundColor(Color.TRANSPARENT);
        }
        if(MenuActivity.caller.equals("physics")&& CollegeYearActivity.caller2.equals("2")){
            c1.setText("Ch 12: Electrostatics");
            c2.setText("Ch 13: Current Electricity");
            c3.setText("Ch 14: Electromagnetism");
            c4.setText("Ch 15: Electromagnetic Induction");
            c5.setText("Ch 16: Alternating Current");
            c6.setText("Ch 17: Physics and Solids");
            c7.setText("Ch 18: Electronics");
            c8.setText("Ch 19: Dawn of modern physics");
            c9.setText("Ch 20: Atomic spectra");
            c10.setText("Ch 21: Nuclear Physics");

            c11.setBackgroundColor(Color.TRANSPARENT);
            c11.setEnabled(false);
        }
        if(MenuActivity.caller.equals("chemistry")&& CollegeYearActivity.caller2.equals("1")){
            c1.setText("Ch 1: Basic Concepts");
            c2.setText("Ch 2: Experimental Techniques in Chemistry");
            c3.setText("Ch 3: Gases");
            c4.setText("Ch 4: Liquids and Solids");
            c5.setText("Ch 5: Atomic Structure");
            c6.setText("Ch 6: Chemical Bonding");
            c7.setText("Ch 7: Thermochemistry");
            c8.setText("Ch 8: Chemical Equilibrium");
            c9.setText("Ch 9: Solutions");
            c10.setText("Ch 10: Electrochemistry");
            c11.setText("Ch 11: Reaction Kinetics");

        }
        if(MenuActivity.caller.equals("chemistry")&& CollegeYearActivity.caller2.equals("2")){
            c1.setText("Ch 1 + Ch 2");
            c2.setText("Ch 3 + Ch 4");
            c3.setText("Ch 5 + Ch 6");
            c4.setText("Ch 7 + Ch 8");
            c5.setText("Ch 9 + Ch 10");
            c6.setText("Ch 11 + Ch 12 ");
            c7.setText("Ch 13 + Ch 14");
            c8.setText("Ch 15 + Ch 16");
            c9.setEnabled(false);
            c10.setEnabled(false);
            c11.setEnabled(false);
            c9.setBackgroundColor(Color.TRANSPARENT);
            c10.setBackgroundColor(Color.TRANSPARENT);
            c11.setBackgroundColor(Color.TRANSPARENT);

        }

    }

}
