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
 * Created by Candido on 4/30/2015.
 */
public class MinorAdapter extends BaseExpandableListAdapter {

    private Context ctx;
    private HashMap<String, List<String>> Minor_Category;
    private List<String> Minor_List;

    public MinorAdapter(Context ctx, HashMap<String, List<String>> Minor_Category, List<String> Minor_List){
        this.ctx=ctx;
        this.Minor_Category=Minor_Category;
        this.Minor_List=Minor_List;

    }

    @Override
    public int getGroupCount() {
        return Minor_List.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return Minor_Category.get(Minor_List.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Minor_List.get(groupPosition);
    }

    @Override
    public Object getChild(int parent, int child) {
        return Minor_Category.get(Minor_List.get(parent)).get(child);
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
            convertView = inflater.inflate(R.layout.minor_parent_layout,parentView,false);
        }
        TextView parent_textView = (TextView) convertView.findViewById(R.id.minor_parent_textView);
        parent_textView.setTypeface(null, Typeface.BOLD);
        parent_textView.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean isLastChild, View convertView, ViewGroup parentView) {
        String child_title = (String)getChild(parent,child);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.minor_child_layout,parentView,false);
        }
        TextView child_textView = (TextView) convertView.findViewById(R.id.minor_child_textView);
        child_textView.setTypeface(null, Typeface.BOLD);
        child_textView.setText(child_title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
