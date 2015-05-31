package com.example.candido.msuphilosophyandreligionapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


public class News_Events extends ActionBarActivity {

    //private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__events);

        /*mWebView = (WebView) findViewById(R.id.activity_news_events_webView);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        mWebView.setInitialScale(1);
        mWebView.loadUrl("http://www.montclair.edu/chss/philosophy-religion/meetings-and-events/");*/

        new scrapePage().execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_news__events, menu);
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

    public class scrapePage extends AsyncTask<Void, Void, Void>
    {
        Elements classesArticle;
        String classesString;
        TextView coursesText = (TextView) findViewById(R.id.coursesText);

        protected Void doInBackground(Void... params)
        {
            try
            {
                Document doc = Jsoup.connect("http://www.montclair.edu/chss/philosophy-religion/meetings-and-events/").get();
                classesArticle = doc.select(".news-article .article-content");
                classesString = classesArticle.toString();

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            return null;
        }

        protected void onPostExecute (Void result)
        {
            try
            {
                coursesText.setMovementMethod(new ScrollingMovementMethod());
                coursesText.setText(Html.fromHtml(classesString));
            }

            catch (java.lang.NullPointerException e)
            {
                e.printStackTrace();
                coursesText.setText("No internet connection. You must be connected to the internet to display this");
            }
        }
    }
}
