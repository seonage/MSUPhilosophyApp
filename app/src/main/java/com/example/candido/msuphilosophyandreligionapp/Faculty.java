package com.example.candido.msuphilosophyandreligionapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
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
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Faculty extends ActionBarActivity {

    ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        myList = (ListView)findViewById(R.id.facultyListView);
        myList.setAdapter(new FacultyList(this));

    }

    class SingleRow {
        String professor_name;
        String locations;
        String phone;
        String email;
        String information;
        int image;

        SingleRow(String professor_name, String locations, String phone, String email, String information, int image) {
            this.professor_name = professor_name;
            this.locations = locations;
            this.phone = phone;
            this.email = email;
            this.information = information;
            this.image = image;
        }
    }

    class MyViewHolder{
        TextView professor;
        TextView location;
        TextView phone;
        TextView email;
        TextView information;
        ImageView image;

        MyViewHolder(View v){
            professor = (TextView)v.findViewById(R.id.text_layout2_professor_name);
            location = (TextView)v.findViewById(R.id.text_layout2_location);
            phone = (TextView)v.findViewById(R.id.text_layout2_phone);
            email = (TextView)v.findViewById(R.id.text_layout2_email);
            information = (TextView)v.findViewById(R.id.text_layout2_information);
            image = (ImageView)v.findViewById(R.id.faculty_info_layout_imageView);
        }

    }

    class FacultyList extends BaseAdapter {

        ArrayList<SingleRow> list;
        Context context;

        FacultyList(Context c) {
            context = c;
            list = new ArrayList<>();
            Resources resources = c.getResources();
            String[] professors = resources.getStringArray(R.array.professor_names);
            String[] locations = resources.getStringArray(R.array.locations);
            String[] phones = resources.getStringArray(R.array.phone);
            String[] emails = resources.getStringArray(R.array.email);
            String[] informations = resources.getStringArray(R.array.information);
            int[] images = {R.drawable.david_benfield, R.drawable.roland_garrett, R.drawable.christopher_herrera, R.drawable.kirk_mcdermid, R.drawable.dorothy_rogers, R.drawable.tiger_roholt, R.drawable.mark_clatterbuck, R.drawable.cynthia_eller, R.drawable.yasir_ibrahim, R.drawable.stephen_johnson, R.drawable.michael_kogan, R.drawable.lise_vail};
            for (int i = 0; i < 12; i++) {
                list.add(new SingleRow(professors[i], locations[i], phones[i], emails[i], informations[i], images[i]));
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
        public View getView(int i, View view, ViewGroup parent) {
            View row = view;
            MyViewHolder holder;
            if(row==null){
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.faculty_information_layout,parent,false); //row contains the faculty layout
                holder = new MyViewHolder(row);
                row.setTag(holder);
            } else {
                holder = (MyViewHolder)row.getTag();
            }

            SingleRow temp = list.get(i);

            holder.professor.setText(temp.professor_name);
            holder.location.setText(temp.locations);
            holder.phone.setText(temp.phone);
            holder.email.setText(temp.email);
            holder.information.setText(temp.information);
            holder.image.setImageResource(temp.image);

            return row;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_faculty, menu);
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
