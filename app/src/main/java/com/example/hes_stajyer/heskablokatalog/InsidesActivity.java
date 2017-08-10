package com.example.hes_stajyer.heskablokatalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ExpandableListView;

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
        }

    }
