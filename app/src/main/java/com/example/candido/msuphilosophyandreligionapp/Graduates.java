package com.example.candido.msuphilosophyandreligionapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Graduates extends ActionBarActivity {

    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduates);
        myList = (ListView)findViewById(R.id.graduatesListView);
        myList.setAdapter(new GraduateList(this));

    }

    public class SingleRow{
        String graduate_names;
        String graduate_information;
        int image;

        SingleRow(String graduate_names,String graduate_information,int image){
            this.graduate_names=graduate_names;
            this.graduate_information=graduate_information;
            this.image=image;
        }
    }

    class MyViewHolder{
        TextView graduate_names;
        TextView information;
        ImageView image;

        MyViewHolder(View v){
            graduate_names = (TextView)v.findViewById(R.id.text_graduate_names);
            information = (TextView)v.findViewById(R.id.text_graduate_information);
            image = (ImageView)v.findViewById(R.id.graduate_imageView);
        }
    }

    public class GraduateList extends BaseAdapter{

        ArrayList<SingleRow> list;
        Context context;
        GraduateList(Context c){
            context=c;
            list = new ArrayList<>();
            Resources resources = c.getResources();
            String[] graduates = resources.getStringArray(R.array.graduate_names);
            String[] infomation = resources.getStringArray(R.array.graduate_information);
            int[] images = {R.drawable.rika_dunlap,R.drawable.peter_lagreca,R.drawable.natalie_rusciani,R.drawable.sean_skedzielewski,R.drawable.james_owen,R.drawable.ron_chicken};
            for(int i=0;i<6;i++){
                list.add(new SingleRow(graduates[i],infomation[i],images[i]));
            }
        }


        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View row = view;
            MyViewHolder holder;
            if(row==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.graduate_layout,viewGroup,false);
                holder = new MyViewHolder(row);
                row.setTag(holder);
            }else {
                holder = (MyViewHolder)row.getTag();
            }

            SingleRow temp = list.get(i);

            holder.graduate_names.setText(temp.graduate_names);
            holder.information.setText(temp.graduate_information);
            holder.image.setImageResource(temp.image);

            return row;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_graduates, menu);
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
