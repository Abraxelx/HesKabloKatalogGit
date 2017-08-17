package com.example.hes_stajyer.heskablokatalog;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;
import static uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.*;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private final static String KEY_CURRENT_PAGE = "current_page";
    private int mCurrentPage = 0;

         PDFView pdfView;
         ListView listView;
         ArrayAdapter<CharSequence> adapter;
         MaterialTapTargetPrompt tapTarget1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null)
        {
            mCurrentPage = savedInstanceState.getInt(KEY_CURRENT_PAGE);
        }
        else
        {
            mCurrentPage = -1;
        }
        if(savedInstanceState==null)
        {

            //BAŞLANGIÇTAKİ KARŞILAMA MESAJI
            Toast toast = new Toast(getApplicationContext());
            View view  = getLayoutInflater().inflate(R.layout.toast_settings,null);
            toast.setView(view);
            toast.setDuration(Toast.LENGTH_LONG);
            int margin = getResources().getDimensionPixelSize(R.dimen.toast_vertical_margin);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_VERTICAL,0,margin);
            toast.show();


            Bundle bnd = getIntent().getExtras();
            if(bnd != null)
            {
                mCurrentPage= bnd.getInt("page");
                //mCurrentPage = bnd.getInt("page1");
                //mCurrentPage = bnd.getInt("page2");

            }





        }






        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //PDF LOAD KISMI
        pdfView= (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("Heskatalog.pdf")
                //.enableAntialiasing(true)
                .defaultPage(mCurrentPage)
                .onRender(new OnRenderListener() {
            @Override
            public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {
                pdfView.fitToWidth(mCurrentPage);
            }
        })
                .onPageChange(new OnPageChangeListener() {
            @Override
            public void onPageChanged(int page, int pageCount) {

                mCurrentPage = page;

                setTitle(String.format("%s %s / %s", "Ürün Kataloğu",page+1,pageCount));

            }
        }).onLoad(new OnLoadCompleteListener() {
            @Override
            public void loadComplete(int nbPages) {

                if (mCurrentPage >= 0)
                {
                    pdfView.jumpTo(mCurrentPage);
                }
            }
        }).load();
       // pdfView.setSoundEffectsEnabled(true);
        pdfView.setBackgroundColor(Color.rgb(255,240,245));






        //E-Mail GÖNDERİM KISMI
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



    //TAP TARGET ANİMASYONU BAŞLANGIÇ
                tapTarget1 =new MaterialTapTargetPrompt.Builder(MainActivity.this)
                        .setTarget(R.id.fab)
                        .setFocalPadding(R.dimen.MaterialTapView)
                        .setPrimaryText("E-Mail Göndermek İçin Tıklayınız")
                        .setSecondaryText("Bizimle İletişime Geçmek İçin Tıklayınız")
                        .setBackButtonDismissEnabled(true)
                        .setAnimationInterpolator(new FastOutSlowInInterpolator())
                        .setPromptStateChangeListener(new MaterialTapTargetPrompt.PromptStateChangeListener()
                        {
                            @Override
                            public void onPromptStateChanged(MaterialTapTargetPrompt prompt, int state)
                            {
                                if (state == MaterialTapTargetPrompt.STATE_FOCAL_PRESSED)
                                {
                                    Intent intent = new Intent(MainActivity.this, SendEmail.class);
                                    startActivity(intent);
                                }
                            }
                        })
                        .create();
                tapTarget1.show();

                //TAP TARGET ANİMASYONU BİTİŞ


            }
        });

        //SOLDAN AÇILAN MENÜ(NAVİGATİON DRAWER)
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        listView = (ListView)findViewById(R.id.list_item1);
       adapter= adapter.createFromResource(this,R.array.query_suggestions,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);






        final SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        //SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        //searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {
                listView.setVisibility(View.VISIBLE);
                adapter.getFilter().filter(text);



                if (TextUtils.isEmpty(text)){
                    listView.setVisibility(View.INVISIBLE);
                }


                return false;
            }
        });



        //ARAMADA GİDİLEN SAYFALAR

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long l)
            {
                int k = listView.getSelectedItemPosition();
                String selecteditem = adapter.getItemAtPosition(position).toString();
                view.setSelected(true);

                if(selecteditem.equals("Tesisat Kabloları"))//TESİSAT KABLOLARI
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(6);
                    listView.setVisibility(View.INVISIBLE);
                }
                if("PVC İzoleli Alçak Gerilim Kabloları".equals(selecteditem))
                {
                    pdfView.jumpTo(11);
                    searchView.setIconified(true);
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    listView.setVisibility(View.GONE);
                }
                 if(selecteditem.equals("XLPE İzoleli Alçak Gerilim Kabloları"))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(60);
                    listView.setVisibility(View.INVISIBLE);
                }
                if("Halojensiz Tesisat Kabloları".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(99);
                    listView.setVisibility(View.GONE);
                }
                 if("XLPE İzoleli Halojensiz Alçak Gerilim Kabloları".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(104);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Solar Kablolar".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(135);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Orta Gerilim Kabloları".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(137);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Yüksek Gerilim Kabloları".equals(selecteditem))
                {
                    pdfView.jumpTo(200);
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    listView.setVisibility(View.INVISIBLE);

                }
                 if("Alüminyum İletken".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(204);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Aer Kablolar".equals(selecteditem))
                {
                    pdfView.jumpTo(212);
                    //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Fiber Optikli Koruma İletkeni(OPGW)".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(214);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Bakır Filmaşin".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(219);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Bakır İletken".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(221);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Alüminyum Filmaşin".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(223);
                    listView.setVisibility(View.INVISIBLE);
                }
                 if("Teknik Bilgiler".equals(selecteditem))
                {
                    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                    pdfView.jumpTo(224);
                    listView.setVisibility(View.INVISIBLE);
                }

            }
        });

        return true;

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        mCurrentPage = savedInstanceState.getInt(KEY_CURRENT_PAGE);

    }
    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_CURRENT_PAGE, mCurrentPage);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.search_layout) {
            //Toast.makeText(this,"Selam",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();
        if (id==R.id.nav_inside)
        {


            Intent intent = new Intent(this,InsidesActivity.class);
            startActivity(intent);

           // Toast.makeText(this,"selam",Toast.LENGTH_SHORT).show();
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
