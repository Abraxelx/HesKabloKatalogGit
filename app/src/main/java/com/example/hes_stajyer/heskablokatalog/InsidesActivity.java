package com.example.hes_stajyer.heskablokatalog;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
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

import static com.example.hes_stajyer.heskablokatalog.R.menu.insides_search;

public class InsidesActivity extends AppCompatActivity {
    HashMap<String, List<String>> Insides_Categories;
    List<String> List_Items;
    ExpandableListView expandableListView;
    Expandible_List ExpListClass;
    Toolbar tb;
    int lastPosition = -1;
    public static int jump;
    Intent mIntent;
    Bundle extras;
    ListView listView;
    ArrayAdapter<CharSequence> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insides);
        expandableListView = (ExpandableListView) findViewById(R.id.explist);
        listView = (ListView) findViewById(R.id.list_item2);


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

//CHILD POSITIONS
            expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView expandableListView, View view, int group_position, int child_position, long id) {
                    //Child Click Event
                    mIntent = new Intent(InsidesActivity.this, MainActivity.class);
                    String page = "page";
                    int pgNumber = 0;

                    //01.TESİSAT KABLOLARI
                    if (group_position == 0) {
                        if (child_position == 0) {
                            pgNumber = 5;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 7;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else {
                            pgNumber = 9;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }

                    }//TESİSAT KABLOLARI BİTİŞ


                    //PVC İZOLELİ ALÇAK GERİLİM KABLOLARI

                    else if (group_position == 1) {
                        if (child_position == 0) {
                            pgNumber = 11;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 12;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 2) {
                            pgNumber = 16;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 3) {
                            pgNumber = 18;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 4) {
                            pgNumber = 19;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 5) {
                            pgNumber = 22;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 6) {
                            pgNumber = 25;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 7) {
                            pgNumber = 26;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 8) {
                            pgNumber = 30;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 9) {
                            pgNumber = 32;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 10) {
                            pgNumber = 36;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 11) {
                            pgNumber = 40;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 12) {
                            pgNumber = 41;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 13) {
                            pgNumber = 45;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 14) {
                            pgNumber = 46;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 15) {
                            pgNumber = 47;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 16) {
                            pgNumber = 48;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 17) {
                            pgNumber = 52;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 18) {
                            pgNumber = 56;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }


                    }//PVC İZOLELİ ALÇAK GERİLİM KABLOLARI BİTİŞ


                    //XLPE İZOLELİ ALÇAK GERİLİM KABLOLARI BAŞLANGIÇ
                    else if (group_position == 2) {

                        if (child_position == 0) {
                            pgNumber = 60;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 61;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 2) {
                            pgNumber = 64;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 3) {
                            pgNumber = 66;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 4) {
                            pgNumber = 67;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 5) {
                            pgNumber = 68;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 6) {
                            pgNumber = 69;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 7) {
                            pgNumber = 72;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 8) {
                            pgNumber = 74;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 9) {
                            pgNumber = 78;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 10) {
                            pgNumber = 81;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 11) {
                            pgNumber = 82;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 12) {
                            pgNumber = 86;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 13) {
                            pgNumber = 87;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 14) {
                            pgNumber = 88;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 15) {
                            pgNumber = 89;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 16) {
                            pgNumber = 92;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 17) {
                            pgNumber = 95;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }

                    }//XLPE İZOLELİ ALÇAK GERİLİM KABLOLARI BİTİŞ


                    //HALOJENSİZ TESİSAT KABLOLARI BAŞLANGIÇ

                    else if (group_position == 3) {
                        if (child_position == 0) {
                            pgNumber = 100;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 101;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 2) {
                            pgNumber = 102;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 3) {
                            pgNumber = 103;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }

                    } //HALOJENSİZ TESİSAT KABLOLARI BİTİŞ


                    //XLPE İZOLELİ HALOJENSİZ ALÇAK GERİLİM KABLOLARI BAŞLANGIÇ


                    else if (group_position == 4) {

                        if (child_position == 0) {
                            pgNumber = 104;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 105;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 2) {
                            pgNumber = 109;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 3) {
                            pgNumber = 111;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 4) {
                            pgNumber = 115;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 5) {
                            pgNumber = 116;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 6) {
                            pgNumber = 120;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 7) {
                            pgNumber = 122;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 8) {
                            pgNumber = 124;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 9) {
                            pgNumber = 129;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 10) {
                            pgNumber = 130;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }

                    }//XLPE İZOLELİ HALOJENSİZ ALÇAK GERİLİM KABLOLARI BİTİŞ


                    //SOLAR KABLO BAŞLANGIÇ
                    else if (group_position == 5) {
                        if (child_position == 0) {
                            pgNumber = 136;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }
                    } //SOLAR KABLO BİTİŞ


                    //ORTA GERİLİM KABLOLARI BAŞLANGIÇ
                    else if (group_position == 6) {


                        if (child_position == 0) {
                            pgNumber = 137;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 138;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 2) {
                            pgNumber = 139;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 3) {
                            pgNumber = 140;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 4) {
                            pgNumber = 141;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 5) {
                            pgNumber = 142;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 6) {
                            pgNumber = 143;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 7) {
                            pgNumber = 144;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 8) {
                            pgNumber = 145;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 9) {
                            pgNumber = 146;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 10) {
                            pgNumber = 147;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 11) {
                            pgNumber = 148;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 12) {
                            pgNumber = 149;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 13) {
                            pgNumber = 150;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 14) {
                            pgNumber = 151;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 15) {
                            pgNumber = 152;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 16) {
                            pgNumber = 153;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 17) {
                            pgNumber = 154;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 18) {
                            pgNumber = 155;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 19) {
                            pgNumber = 156;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 20) {
                            pgNumber = 157;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 21) {
                            pgNumber = 158;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 22) {
                            pgNumber = 159;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 23) {
                            pgNumber = 160;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 24) {
                            pgNumber = 161;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 25) {
                            pgNumber = 162;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 26) {
                            pgNumber = 163;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 27) {
                            pgNumber = 164;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 28) {
                            pgNumber = 165;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 29) {
                            pgNumber = 166;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 30) {
                            pgNumber = 167;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 31) {
                            pgNumber = 168;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 32) {
                            pgNumber = 169;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 33) {
                            pgNumber = 170;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 34) {
                            pgNumber = 171;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 35) {
                            pgNumber = 172;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 36) {
                            pgNumber = 173;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 37) {
                            pgNumber = 174;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 38) {
                            pgNumber = 175;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 39) {
                            pgNumber = 176;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 40) {
                            pgNumber = 177;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 41) {
                            pgNumber = 178;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 42) {
                            pgNumber = 179;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 43) {
                            pgNumber = 180;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 44) {
                            pgNumber = 181;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 45) {
                            pgNumber = 182;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 46) {
                            pgNumber = 183;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 47) {
                            pgNumber = 184;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 48) {
                            pgNumber = 185;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 49) {
                            pgNumber = 186;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 50) {
                            pgNumber = 187;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 51) {
                            pgNumber = 188;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 52) {
                            pgNumber = 189;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 53) {
                            pgNumber = 190;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 54) {
                            pgNumber = 191;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 55) {
                            pgNumber = 192;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 56) {
                            pgNumber = 193;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 57) {
                            pgNumber = 194;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 58) {
                            pgNumber = 195;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 59) {
                            pgNumber = 196;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 60) {
                            pgNumber = 197;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 61) {
                            pgNumber = 198;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 62) {
                            pgNumber = 199;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }


                    }//ORTA GERİLİM KABLOLARI BİTİŞ


                    //YÜKSEK GERİLİM KABLOLARI BAŞLANGIÇ
                    else if (group_position == 7) {
                        if (child_position == 0) {
                            pgNumber = 200;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 201;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 2) {
                            pgNumber = 202;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 3) {
                            pgNumber = 203;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }
                    }  //YÜKSEK GERİLİM KABLOLARI BİTİŞ


                    //ALÜMİNYUM KABLOLAR BAŞLANGIÇ
                    else if (group_position == 8) {
                        if (child_position == 0) {
                            pgNumber = 205;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 206;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 2) {
                            pgNumber = 207;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 3) {
                            pgNumber = 208;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 4) {
                            pgNumber = 210;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }

                    }  //ALÜMİNYUM KABLOLAR BİTİŞ


                    //AER KABLOLAR BAŞLANGIÇ


                    else if (group_position == 9) {
                        if (child_position == 0) {
                            pgNumber = 212;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }
                    }//AER KABLOLAR BİTİŞ


                    //FİBER OPTİKLİ KORUMA İLETKENİ BAŞLANGIÇ
                    else if (group_position == 10) {
                        if (child_position == 0) {
                            pgNumber = 214;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 1) {
                            pgNumber = 215;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 2) {
                            pgNumber = 216;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        } else if (child_position == 3) {
                            pgNumber = 217;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }
                    }//FİBER OPTİKLİ KORUMA İLETKENİ BİTİŞ



                    //BAKIR FİLMAŞİN BAŞLANGIÇ
                    else if(group_position==11)
                        {
                            if(child_position==0)
                            {
                                pgNumber = 219;
                                mIntent.putExtra(page, pgNumber);
                                startActivity(mIntent);
                            }

                     }//BAKIR FİLMAŞİN BİTİŞ



                    //BAKIR İLETKEN BAŞLANGIÇ
                    else if(group_position==12)
                    {
                        if(child_position==0)
                        {
                            pgNumber = 221;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }
                        else if (child_position == 1) {
                            pgNumber = 222;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }

                    }//BAKIR İLETKEN BİTİŞ

                    //ALÜMİNYUM FİLMAŞİN BAŞLANGIÇ
                    else if(group_position==13)
                    {
                        if(child_position==0)
                        {
                            pgNumber = 223;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }

                    }//ALÜMİNYUM FİLMAŞİN BİTİŞ


                    //TEKNİK BİLGİLER BAŞLANGIÇ

                    else if(group_position==14)
                    {
                        if(child_position==0)
                        {
                            pgNumber = 224;
                            mIntent.putExtra(page, pgNumber);
                            startActivity(mIntent);
                        }

                    }//TEKNİK BİLGİLER BİTİŞ


                    return false;
                }
            });



        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {



        final MenuInflater[] inflater = {getMenuInflater()};
        inflater[0].inflate(R.menu.insides_search,menu);
        adapter = adapter.createFromResource(InsidesActivity.this,R.array.insides_suggetions,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        final SearchView searchView = (SearchView) menu.findItem(R.id.action_search_insides).getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                listView.setVisibility(View.VISIBLE);
                adapter.getFilter().filter(newText);


                if (TextUtils.isEmpty(newText)){
                    listView.setVisibility(View.INVISIBLE);
                }
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent mIntent = new Intent(InsidesActivity.this, MainActivity.class);
                final String page = "page";
                int pgNumber= 0;
                int k = listView.getSelectedItemPosition();
                String name = listView.getItemAtPosition(position).toString();
                view.setSelected(true);

                if(name.equals("Tesisat Kabloları") || name.equals("PVC İzoleli, kılıfsız, tek damarlı, bakır iletkenli kablolar")|| name.equals("H05V-U, H07V-U, H07V-R (NYA), CU/PVC"))//TESİSAT KABLOLARI
                {
                    pgNumber = 5;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("PVC İzoleli, kılıfsız, çok damarlı, bakır iletkenli tesisat kabloları"))
                {
                    pgNumber = 7;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("PVC İzoleli, yassı bükülgen, bakır iletkenli kablolar"))
                {
                    pgNumber = 9;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("PVC İzoleli Alçak Gerilim Kabloları") || name.equals("0.6/1 kV PVC izoleli, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 11;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 12;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, bakır iletkenli, kumanda kabloları"))
                {
                    pgNumber = 16;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, konsantrik iletkenli, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 18;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, konsantrik iletkenli, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 19;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, konsantrik iletkenli, bakır iletkenli, kumanda kabloları"))
                {
                    pgNumber = 22;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 25;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 26;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, çok damarlı, bakır iletkenli kumanda kabloları"))
                {
                    pgNumber = 30;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, yassı çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 32;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, çift kat çelik bant zırhlı, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 36;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 40;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, çok damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 41;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, konsantrik iletkenli, tek damarlı,alüminyum iletkenli kablolar"))
                {
                    pgNumber = 45;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, konsantrik iletkenli, çok damarlı,alüminyum iletkenli kablolar"))
                {
                    pgNumber = 46;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 47;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, çok damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 48;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, yassı çelik tel zırhlı, çok damarlı alüminyum iletkenli kablolar"))
                {
                    pgNumber = 52;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV PVC izoleli, çift kat çelik bant zırhlı, çok damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 56;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("XLPE İzoleli Alçak Gerilim Kabloları")|| name.equals("0.6/1 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 60;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 61;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, bakır iletkenli kumanda kabloları"))
                {
                    pgNumber = 64;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, konsantrik iletkenli, tek damarlı, bakır iletkkenli"))
                {
                    pgNumber = 66;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, konsantrik iletkenli, çok damarlı, bakır iletkkenli"))
                {
                    pgNumber = 67;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, konsantrik İletkenli, bakır iletkenli kumanda kabloları"))
                {
                    pgNumber = 68;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, yuvarlak çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 69;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, yuvarlak çelik tel zırhlı, bakır iletkenli kumanda kabloları"))
                {
                    pgNumber = 72;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, yassı çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 74;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, çift kat çelik bant zırhlı, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 78;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 81;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, çok damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 82;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, konsantrik iletkenli, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 86;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, konsantrik iletkenli, çok damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 87;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, yuvarlak çelik tel zırhlı, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 88;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, yuvarlak çelik tel zırhlı, çok damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 89;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, çift kat çelik bant zırhlı, çok damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 92;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV XLPE izoleli, yassı çelik tel zırhlı, çok damarlı, alüminyum İletkenli kablolar"))
                {
                    pgNumber = 95;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Halojensiz Tesisat Kabloları")|| name.equals("300/500V ve 450/750V halojensiz, alev iletmeyen, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 100;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("300/500V ve 450/750V halojensiz, alev iletmeyen, tek damarlı, bükülgen bakır iletkenli kablolar"))
                {
                    pgNumber = 101;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("300/500V ve 450/750V halojensiz, alev iletmeyen, çok damarlı, bükülgen bakır iletkenli kablolar"))
                {
                    pgNumber = 102;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("300/300V ve 300/500V halojensiz, alev iletmeyen, çok damarlı, bükülgen bakır iletkenli kablolar"))
                {
                    pgNumber = 103;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("XLPE İzoleli Halojensiz Alçak Gerilim Kabloları")|| name.equals("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 105;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen XLPE izoleli, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 105;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, bakır iletkenli kumanda kabloları"))
                {
                    pgNumber = 109;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, yassı çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 111;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, yuvarlak çelik tel zırhlı, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 115;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, yuvarlak çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 116;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen, konsantrik iletkenli, XLPE izoleli, çok damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 120;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen, konsantrik iletkenli, XLPE izoleli, çok damarlı bakır iletkenli kumanda kabloları"))
                {
                    pgNumber = 122;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 124;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("300/500V halojensiz, alev iletmeyen XLPE izoleli, çok damarlı, bakır iletkenli FE 180 kablolar"))
                {
                    pgNumber = 129;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, tek damarlı, bakır iletkenli FE 180 kablolar"))
                {
                    pgNumber = 130;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Solar Kablolar")|| name.equals("0.6/1 kV LSFOH izoleli, tek damarlı, solar kablolar"))
                {
                    pgNumber = 136;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Orta Gerilim Kabloları")|| name.equals("3.6/6 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 137;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 138;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 139;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 140;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 141;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 142;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 143;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 144;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 145;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 146;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 147;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 148;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 149;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 150;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 151;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 152;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 153;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 154;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/1 kV XLPE izoleli, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 155;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 156;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, yassı çelik tel zırhlı,üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 157;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) XLPE izoleli, yassı çelik tel zırhlı,üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 158;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, yassı çelik tel zırhlı,üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 159;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, yassı çelik tel zırhlı,üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 160;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 161;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 162;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 163;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 164;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 165;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 166;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 167;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, bakır iletkenli kablolar"))
                {
                    pgNumber = 168;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 169;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 170;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 171;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 172;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 173;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 XLPE izoleli, tek damarlı, boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 174;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 175;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 176;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 177;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 178;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 179;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 180;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 181;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 182;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 183;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 184;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 185;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 186;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 187;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 188;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 189;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 190;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 191;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 192;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 193;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 194;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 195;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("3.6/6 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 196;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 197;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("8.7/15 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 198;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("20.3/35 kV veya 20.8/36 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 199;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Yüksek Gerilim Kabloları")|| name.equals("40/69 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 200;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("89/154 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar"))
                {
                    pgNumber = 201;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("40/69 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 202;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("89/154 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar"))
                {
                    pgNumber = 203;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Alüminyum İletken")|| name.equals("Alüminyum İletken Özellikleri"))
                {
                    pgNumber = 205;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("AAC Örgülü alüminyum iletken Amerikan ölçüleri ASTM B231 / B231M"))
                {
                    pgNumber = 206;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("AAC Örgülü alüminyum iletken Kanada ölçüleri CSA C 49"))
                {
                    pgNumber = 207;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("ACSR Örgülü alüminyum iletken Amerikan ölçüleri ASTM B 232/B 232M"))
                {
                    pgNumber = 208;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("ACSR Örgülü alüminyum iletken Kanada ölçüleri CSA C 49"))
                {
                    pgNumber = 210;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Aer Kablolar")|| name.equals("0.6/1kV PE izoleli, alüminyum iletkenli, çıplak askı telli enerji kabloları"))
                {
                    pgNumber = 212;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Fiber Optikli Koruma İletkeni(OPGW)")|| name.equals("Fiber optikli koruma iletkeni (OPGW-95)"))
                {
                    pgNumber = 214;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Fiber optikli koruma iletkeni (OPGW- 127-1)"))
                {
                    pgNumber = 215;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Fiber optikli koruma iletkeni (OPGW-127-2)"))
                {
                    pgNumber = 216;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Fiber optikli koruma iletkeni Özellikler (OPGW)"))
                {
                    pgNumber = 217;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Bakır Filmaşin"))
                {
                    pgNumber = 219;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Bakır İletken")|| name.equals("Havai hatlar için örgülü bakır iletken"))
                {
                    pgNumber = 221;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Tavlanmış elektrolitik bakır iletken"))
                {
                    pgNumber = 222;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Alüminyum Filmaşin"))
                {
                    pgNumber = 223;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }
                else if(name.equals("Teknik Bilgiler"))
                {
                    pgNumber = 224;
                    mIntent.putExtra(page, pgNumber);
                    startActivity(mIntent);
                }






            }
        });


        return super.onCreateOptionsMenu(menu);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_search_insides:
                setTitle("");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    }

