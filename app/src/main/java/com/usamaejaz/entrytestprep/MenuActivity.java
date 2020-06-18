package com.usamaejaz.entrytestprep;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity  {





RewardedVideoAd rewardedVideoAd;

    static String  caller;
    Button maths, physics, chemistry,help,english,support;
    String impname;
    DrawerLayout dl;
    Toolbar toolbar;TextView headname;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {


            finish();
            return true;
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        setUpToolbar();
        SharedPreferences prefs = getSharedPreferences(WelcomeActivity.MY_PREFS_NAME, MODE_PRIVATE);
        String restoredText = prefs.getString("text", null);

        impname = prefs.getString("name", "No name defined");//"No name defined" is the default value.






        navigationView = (NavigationView) findViewById(R.id.navigationview);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.ppolicy:
                        Intent i3 = new Intent(MenuActivity.this, PrivacyPolicy.class);
                        startActivity(i3);
                        break;
                    case R.id.home:
                        Toast.makeText(MenuActivity.this, "sweet home", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.setting:
                        Toast.makeText(MenuActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.message:
                        Intent i2 = new Intent(MenuActivity.this, Message_activity.class);
                        startActivity(i2);                         break;
                    case R.id.about:
                        Intent i = new Intent(MenuActivity.this, AboutUsAcitivity.class);
                        startActivity(i);                        break;
                    case R.id.donate:
                        if(rewardedVideoAd.isLoaded()){
                            rewardedVideoAd.show();
                        }
                        break;


                }
                return false;
            }
        });

        //Initializing buttons
        support=(Button)findViewById(R.id.support);
        maths = (Button) findViewById(R.id.maths);
        physics = (Button) findViewById(R.id.phy);
        chemistry = (Button) findViewById(R.id.chem);

        help = (Button) findViewById(R.id.phelp);
        english=(Button)findViewById(R.id.eng);

        //Making onclick listeners
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caller="maths";
                Intent i = new Intent(MenuActivity.this, CollegeYearActivity.class);
                startActivity(i);

            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caller="physics";
                Intent i = new Intent(MenuActivity.this, CollegeYearActivity.class);
                startActivity(i);

            }
        });
        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caller="chemistry";
                Intent i = new Intent(MenuActivity.this, CollegeYearActivity.class);
                startActivity(i);

            }
        });
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caller="english";
                Toast.makeText(MenuActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();



            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, InstructionActivity.class);
                startActivity(i);

            }
        });

        View header=navigationView.getHeaderView(0);
        headname=(TextView)header.findViewById(R.id.hname);
        headname.setText(impname);

    }


    private void setUpToolbar() {
        dl = (DrawerLayout) findViewById(R.id.drawerlayout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, dl, toolbar, R.string.app_name, R.string.app_name);
        dl.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    public void updateHeader() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationview);
        View Headerview = navigationView.getHeaderView(0);




    }


}
