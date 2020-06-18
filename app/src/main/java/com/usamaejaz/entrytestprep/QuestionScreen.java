package com.usamaejaz.entrytestprep;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class QuestionScreen extends AppCompatActivity {
    static int start,end,cr;
    Mcqs m;

    static int num=0;
    Button opt1,opt2,opt3,opt4,next,prev;
    TextView quess;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            if(CollegeYearActivity.caller2.equals("1") && MenuActivity.caller.equals("maths")){
                QuestionScreen.start=0;}
            if(CollegeYearActivity.caller2.equals("1") && MenuActivity.caller.equals("physics")){
                QuestionScreen.start=180;}

            if(CollegeYearActivity.caller2.equals("2") && MenuActivity.caller.equals("maths")){
                QuestionScreen.start=354;}

            if(CollegeYearActivity.caller2.equals("2") && MenuActivity.caller.equals("physics")){
                QuestionScreen.start=494;}

            if(CollegeYearActivity.caller2.equals("1") && MenuActivity.caller.equals("chemistry")){
                QuestionScreen.start=694;}
            if(CollegeYearActivity.caller2.equals("2") && MenuActivity.caller.equals("chemistry")){
                QuestionScreen.start=859;}
            cr=0;
            finish();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);




        m=new Mcqs();

        //Initializing


        opt1=(Button)findViewById(R.id.option1);
        opt2=(Button)findViewById(R.id.option2);
        opt3=(Button)findViewById(R.id.option3);
        opt4=(Button)findViewById(R.id.option4);
        next=(Button)findViewById(R.id.nexxxt);
        prev=(Button)findViewById(R.id.prev);
        quess=(TextView)findViewById(R.id.questions);

        //To call next question

        nextques();




        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt1.setBackgroundColor(Color.GRAY);
                opt2.setBackgroundColor(Color.WHITE);
                opt3.setBackgroundColor(Color.WHITE);
                opt4.setBackgroundColor(Color.WHITE);

                greenybastard();
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt2.setBackgroundColor(Color.GRAY);
                opt1.setBackgroundColor(Color.WHITE);
                opt3.setBackgroundColor(Color.WHITE);
                opt4.setBackgroundColor(Color.WHITE);

                greenybastard();
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt3.setBackgroundColor(Color.GRAY);
                opt1.setBackgroundColor(Color.WHITE);
                opt2.setBackgroundColor(Color.WHITE);
                opt4.setBackgroundColor(Color.WHITE);

                greenybastard();
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt4.setBackgroundColor(Color.GRAY);
                opt1.setBackgroundColor(Color.WHITE);
                opt2.setBackgroundColor(Color.WHITE);
                opt3.setBackgroundColor(Color.WHITE);

                greenybastard();
            }
        });




        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt1.setBackgroundColor(Color.WHITE);
                opt2.setBackgroundColor(Color.WHITE);
                opt3.setBackgroundColor(Color.WHITE);
                opt4.setBackgroundColor(Color.WHITE);
                if(num>start){
                    cr--;
                num--;}

                nextques();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt1.setBackgroundColor(Color.WHITE);
                opt2.setBackgroundColor(Color.WHITE);
                opt3.setBackgroundColor(Color.WHITE);
                opt4.setBackgroundColor(Color.WHITE);
                if(num<end){
                    num++;
                    cr++;
                }

                nextques();
                }



        });
    }
    public void nextques(){
        if(MenuActivity.caller.equals("ppapers")) {

            quess.setText(m.past_question(num));
            opt1.setText(m.past_option1(num));
            opt2.setText(m.past_option2(num));
            opt3.setText(m.past_option3(num));
            opt4.setText(m.past_option4(num));
        }else{

            quess.setText(" "+(cr+1)+". "+m.getquestion(num));
            opt1.setText(m.option1(num));
            opt2.setText(m.option2(num));
            opt3.setText(m.option3(num));
            opt4.setText(m.option4(num));
        }
    }
    public void greenybastard(){
        if(opt4.getText()==m.answers[num]) {
            opt4.setBackgroundColor(Color.GREEN);
        }else if(opt3.getText()==m.answers[num]){
            opt3.setBackgroundColor(Color.GREEN);
        }else if(opt2.getText()==m.answers[num]){
            opt2.setBackgroundColor(Color.GREEN);
        }else if(opt1.getText()==m.answers[num]){
            opt1.setBackgroundColor(Color.GREEN);
        }

    }

}
