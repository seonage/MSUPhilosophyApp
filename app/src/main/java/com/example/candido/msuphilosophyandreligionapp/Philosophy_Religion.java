package com.example.candido.msuphilosophyandreligionapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Philosophy_Religion extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philosophy__religion);

        final Button NewsAndEvents = (Button) findViewById(R.id.b_news_events);
        NewsAndEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),News_Events.class);
                startActivityForResult(intent,0);
            }
        });

        Button faculty = (Button) findViewById(R.id.b_faculty);
        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Faculty.class);
                startActivityForResult(intent,0);
            }
        });

        Button major = (Button) findViewById(R.id.b_major);
        major.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Major.class);
                startActivityForResult(intent,0);
            }
        });

        Button minor = (Button) findViewById(R.id.b_minor);
        minor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Minor.class);
                startActivityForResult(intent,0);
            }
        });

        Button graduates = (Button) findViewById(R.id.b_graduates);
        graduates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Graduates.class);
                startActivityForResult(intent,0);
            }
        });

        Button BenfieldPrize = (Button) findViewById(R.id.b_benfield_prize);
        BenfieldPrize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Benfield_Prize.class);
                startActivityForResult(intent,0);
            }
        });

        Button map = (Button) findViewById(R.id.b_map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Map.class);
                startActivityForResult(intent,0);
            }
        });

        Button courses = (Button) findViewById(R.id.b_courses);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Courses.class);
                startActivityForResult(intent,0);
            }
        });

        Button msu_home = (Button) findViewById(R.id.b_msu_home);
        msu_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MSU_Home.class);
                startActivityForResult(intent,0);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_philosophy__religion, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        switch (item.getItemId()) {
            case R.id.action_bar_benfield_prize:
                Intent benprize = new Intent(this, Benfield_Prize.class);
                startActivity(benprize);
                return true;
            case R.id.action_bar_courses:
                Intent course = new Intent(this, Courses.class);
                startActivity(course);
                return true;
            case R.id.action_bar_faculty:
                Intent facul = new Intent(this, Faculty.class);
                startActivity(facul);
                return true;
            case R.id.action_bar_graduates:
                Intent grad = new Intent(this, Graduates.class);
                startActivity(grad);
                return true;
            case R.id.action_bar_major:
                Intent major = new Intent(this, Major.class);
                startActivity(major);
                return true;
            case R.id.action_bar_map:
                Intent map = new Intent(this, Map.class);
                startActivity(map);
                return true;
            case R.id.action_bar_minor:
                Intent minor = new Intent(this, Minor.class);
                startActivity(minor);
                return true;
            case R.id.action_bar_msu_home:
                Intent msu = new Intent(this, MSU_Home.class);
                startActivity(msu);
                return true;
            case R.id.action_bar_news_events:
                Intent news = new Intent(this, News_Events.class);
                startActivity(news);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
