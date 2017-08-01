package com.example.hes_stajyer.heskablokatalog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


public class Expandible_List extends BaseExpandableListAdapter{

    private Context ctx;
    private HashMap<String, List<String>> Categories;
    private List<String> List;

    public Expandible_List(Context ctx, HashMap<String, List<String>>Categories, List<String> List)
    {
        this.ctx=ctx;
        this.Categories=Categories;
        this.List = List;
    }




    @Override
    public int getGroupCount()
    {
        return List.size();
    }

    @Override
    public int getChildrenCount(int groupPosition)
    {
        return Categories.get(List.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition)
    {
        return List.get(groupPosition);
    }

    @Override
    public Object getChild(int parent, int child)
    {

        return Categories.get(List.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int groupPosition)
    {
        return groupPosition;
    }

    @Override
    public long getChildId(int parent, int child)
    {
        return child ;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentview)
    {
        String group_title = (String) getGroup(parent);
        if (convertView==null)
        {
            LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflator.inflate(R.layout.group, parentview,false);
        }
        TextView parent_txt =(TextView) convertView.findViewById(R.id.textView1);
        parent_txt.setTypeface(null, Typeface.BOLD);
        parent_txt.setText(group_title);
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean isLastChild, View convertView, ViewGroup parentView)
    {
        String child_title = (String) getChild(parent,child);
         if(convertView == null)
         {
             LayoutInflater inflator = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             convertView = inflator.inflate(R.layout.row,parentView,false);
         }
         TextView child_textview = (TextView) convertView.findViewById(R.id.child_txt);
        child_textview.setText(child_title);


        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }


}
