package com.example.hes_stajyer.heskablokatalog;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class InsidesActivity extends AppCompatActivity {
    HashMap<String, List<String>> Insides_Categories;
    List<String> List_Items;
    ExpandableListView expandableListView;
    Expandible_List ExpListClass;
    Toolbar tb;
    int lastPosition = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insides);
        expandableListView = (ExpandableListView) findViewById(R.id.explist);


            Insides_Categories = DataProvider.getInfo();
            List_Items = new ArrayList<String>(Insides_Categories.keySet());
        Collections.sort(List_Items);

//        List<Map.Entry<String,List<String>>> entries = new ArrayList<Map.Entry<String,List<String>>>(Insides_Categories.entrySet());
//        Collections.sort(entries, new Comparator<Map.Entry<String,List<String>>>() {
//            public int compare(Map.Entry<String,List<String>> l1, Map.Entry<String,List<String>> l2) {
//                return l1.getValue().get(0).compareTo(l2.getValue().get(0));
//            }
//        });



            ExpListClass = new Expandible_List(this, Insides_Categories, List_Items);
            expandableListView.setAdapter(ExpListClass);



            expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                @Override
                public void onGroupExpand(int i) {
                    if (lastPosition != -1 && lastPosition != i) {
                        expandableListView.collapseGroup(lastPosition);
                    }
                    lastPosition = i;
                }
            });


            expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView expandableListView, View view, int group_position, int child_position, long id)
                {
                    //Child Click Event
                    Toast.makeText(InsidesActivity.this,List_Items.get(group_position),Toast.LENGTH_SHORT).show();
                    return false;
                }
            });
        }



    }
