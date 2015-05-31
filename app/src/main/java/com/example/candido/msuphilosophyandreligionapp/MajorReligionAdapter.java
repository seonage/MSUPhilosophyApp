package com.example.candido.msuphilosophyandreligionapp;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Candido on 5/7/2015.
 */
public class MajorReligionAdapter extends BaseExpandableListAdapter {

    private Context ctx;
    private HashMap<String, List<String>> Major_Religion_Category;
    private List<String> Major_Religion_List;

    public MajorReligionAdapter(Context ctx, HashMap<String, List<String>> Major_Religion_Category, List<String> Major_Religion_List){
        this.ctx=ctx;
        this.Major_Religion_Category=Major_Religion_Category;
        this.Major_Religion_List=Major_Religion_List;
    }

    @Override
    public int getGroupCount() {
        return Major_Religion_List.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return Major_Religion_Category.get(Major_Religion_List.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Major_Religion_List.get(groupPosition);
    }

    @Override
    public Object getChild(int parent, int child) {
        return Major_Religion_Category.get(Major_Religion_List.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int parent, int child) {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentView) {
        String group_title = (String) getGroup(parent);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.major_layout,parentView,false);
        }
        TextView parent_textView = (TextView) convertView.findViewById(R.id.major_parent_textView);
        parent_textView.setTypeface(null, Typeface.BOLD);
        parent_textView.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean isLastChild, View convertView, ViewGroup parentView) {
        String child_title = (String)getChild(parent,child);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.major_child_layout,parentView,false);
        }
        TextView child_textView = (TextView) convertView.findViewById(R.id.major_child_textView);
        child_textView.setTypeface(null, Typeface.BOLD);
        child_textView.setText(child_title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
