package com.example.hes_stajyer.heskablokatalog;

import android.content.ClipData;
import android.content.Intent;
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
    public static int jump;
    Intent mIntent;
    Bundle extras;

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



    }
