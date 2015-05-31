package com.example.candido.msuphilosophyandreligionapp;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MSU_Home extends ActionBarActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msu__home);

        mWebView = (WebView) findViewById(R.id.activity_msu_home_webView);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        mWebView.setInitialScale(1);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("http://www.montclair.edu/");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_msu__home, menu);
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
