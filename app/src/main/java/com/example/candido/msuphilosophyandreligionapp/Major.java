package com.example.candido.msuphilosophyandreligionapp;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.HashMap;


public class Major extends ActionBarActivity {

    HashMap<String, List<String>> Major_Category;
    List<String> Major_List;
    ExpandableListView Exp_list;
    MajorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
        Exp_list = (ExpandableListView)findViewById(R.id.expandable_major_ListView);
        Major_Category = Major_Provider.getInfo();
        Major_List = new ArrayList<>(Major_Category.keySet());
        adapter = new MajorAdapter(this, Major_Category, Major_List);
        Exp_list.setAdapter(adapter);

        final TextView religion_major = (TextView)findViewById(R.id.religion_major_textView);
        religion_major.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent religionMajor = new Intent(v.getContext(),religion_major.class);
                startActivity(religionMajor);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_major, menu);
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
            case R.id.action_philosophy_home:
                Intent home = new Intent(this, Philosophy_Religion.class);
                startActivity(home);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
