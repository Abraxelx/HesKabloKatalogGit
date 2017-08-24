package com.example.hes_stajyer.heskablokatalog;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Hes_Stajyer on 28.07.2017.
 */

public class DataProvider
{
    public static HashMap<String,List<String>> getInfo()
    {
        HashMap<String, List<String>> Details = new HashMap<String, List<String>>();



        //TESİSAT KABLOLARI ALANI
        List<String>One_Items = new ArrayList<String>();
        One_Items.add("PVC İzoleli, kılıfsız, tek damarlı, bakır iletkenli kablolar");
        One_Items.add("PVC İzoleli, kılıfsız, çok damarlı, bakır iletkenli tesisat kabloları");
        One_Items.add("PVC İzoleli, yassı bükülgen, bakır iletkenli kablolar");





        //PVC İZOLELİ ALÇAK GERİLİM KABLOLARI ALANI
        List<String>Second_Items = new ArrayList<String>();
        Second_Items.add("0.6/1 kV PVC izoleli, tek damarlı, bakır iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, çok damarlı, bakır iletkenli kablolar ");
        Second_Items.add("0.6/1 kV PVC izoleli, bakır iletkenli, kumanda kabloları");
        Second_Items.add("0.6/1 kV PVC izoleli, konsantrik iletkenli, tek damarlı, bakır iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, konsantrik iletkenli, çok damarlı, bakır iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, konsantrik iletkenli, bakır iletkenli, kumanda kabloları");
        Second_Items.add("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, tek damarlı, bakır iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, bakır iletkenli kumanda kabloları");
        Second_Items.add("0.6/1 kV PVC izoleli, yassı çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, çift kat çelik bant zırhlı, çok damarlı, bakır iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, tek damarlı, alüminyum iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, çok damarlı, alüminyum iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, konsantrik iletkenli, tek damarlı,alüminyum iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, konsantrik iletkenli, çok damarlı, alüminyum iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, tek damarlı, alüminyum iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, yuvarlak çelik tel zırhlı, çok damarlı, alüminyum iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, yassı çelik tel zırhlı, çok damarlı alüminyum iletkenli kablolar");
        Second_Items.add("0.6/1 kV PVC izoleli, çift kat çelik bant zırhlı, çok damarlı, alüminyum iletkenli kablolar");



        //XLPE İZOLELİALÇAK GERİLİM KABLOLARI ALANI
        List<String>Third_Items = new ArrayList<String>();
        Third_Items.add("0.6/1 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, çok damarlı, bakır iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, bakır iletkenli kumanda kabloları");
        Third_Items.add("0.6/1 kV XLPE izoleli, konsantrik iletkenli, tek damarlı, bakır iletkkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, konsantrik iletkenli, çok damarlı, bakır iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, konsantrik İletkenli, bakır iletkenli kumanda kabloları");
        Third_Items.add("0.6/1 kV XLPE izoleli, yuvarlak çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, yuvarlak çelik tel zırhlı, bakır iletkenli kumanda kabloları");
        Third_Items.add("0.6/1 kV XLPE izoleli, yassı çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, çift kat çelik bant zırhlı, çok damarlı, bakır iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, çok damarlı, alüminyum iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, konsantrik iletkenli, tek damarlı, alüminyum iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, konsantrik iletkenli, çok damarlı, alüminyum iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, yuvarlak çelik tel zırhlı, tek damarlı, alüminyum iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, yuvarlak çelik tel zırhlı, çok damarlı, alüminyum iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, çift kat çelik bant zırhlı, çok damarlı, alüminyum iletkenli kablolar");
        Third_Items.add("0.6/1 kV XLPE izoleli, yassı çelik tel zırhlı, çok damarlı, alüminyum İletkenli kablolar");



        //HALOJENSİZ TESİSAT KABLOLARI BÖLÜMÜ
        List<String>Four_Items = new ArrayList<String>();
        Four_Items.add("300/500V ve 450/750V halojensiz, alev iletmeyen, tek damarlı, bakır iletkenli kablolar");
        Four_Items.add("300/500V ve 450/750V halojensiz, alev iletmeyen, tek damarlı, bükülgen bakır iletkenli kablolar");
        Four_Items.add("300/500V halojensiz, alev iletmeyen XLPE izoleli, çok damarlı, bakır iletkenli kablolar");
        Four_Items.add("300/300V ve 300/500V halojensiz, alev iletmeyen, çok damarlı, bükülgen bakır iletkenli kablolar");




        //XLPE İZOLELİ HALOJENSİZ ALÇAK GERİLİM KABLOLARI BÖLÜMÜ
        List<String>Five_Items = new ArrayList<String>();
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, tek damarlı, bakır iletkenli kablolar");
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen XLPE izoleli, çok damarlı, bakır iletkenli kablolar");
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, bakır iletkenli kumanda kabloları ");
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, yassı çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar");
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, yuvarlak çelik tel zırhlı, tek damarlı, bakır iletkenli kablolar");
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, yuvarlak çelik tel zırhlı, çok damarlı, bakır iletkenli kablolar");
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen, konsantrik iletkenli, XLPE izoleli, çok damarlı, bakır iletkenli kablolar");
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen, konsantrik iletkenli, XLPE izoleli, çok damarlı bakır iletkenli kumanda kabloları");
        Five_Items.add("0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar");
        Five_Items.add("300/500V halojensiz, alev iletmeyen XLPE izoleli, çok damarlı, bakır iletkenli FE 180 kablolar");
        Five_Items.add(" 0.6/1 kV halojensiz, alev iletmeyen, XLPE izoleli, tek damarlı, bakır iletkenli FE 180 kablolar");


        //SOLAR KABLOLAR BÖLÜMÜ
        List<String>Six_Items = new ArrayList<String>();
        Six_Items.add("0.6/1 kV LSFOH izoleli, tek damarlı, solar kablolar");




        //ORTA GERİLİM KABLOLARI ALANI
        List<String>Seven_Items = new ArrayList<String>();
        Seven_Items.add("3.6/6 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar ");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, bakır iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, bakır iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, bakır iletkenli kablolar ");
        Seven_Items.add("8.7/15 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, bakır iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, bakır iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, bakır iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) XLPE izoleli, tek damarlı, yuvarlak alüminyum tel zırhlı, bakır iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, tek damarlı, yuvarlak alüminyum tel zırhlı, bakır iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, yuvarlak alüminyum tel zırhlı, bakır iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, yassı çelik tel zırhlı,üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar ");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar ");
        Seven_Items.add("3.6/6 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, bakır iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 XLPE izoleli, tek damarlı, boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli,tek damarlı, yuvarlak alüminyum tel zırhlı, alüminyum iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) XLPE izoleli, tek damarlı, yuvarlak alüminyum tel zırhlı, alüminyum iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, tek damarlı, yuvarlak alüminyum tel zırhlı, alüminyum iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, tek damarlı, yuvarlak alüminyum tel zırhlı, alüminyum iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, yassı çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, yuvarlak çelik tel zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("3.6/6 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("5.8/10 kV (6/10 kV) veya 6.35/11 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("8.7/15 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, alüminyum iletkenli kablolar");
        Seven_Items.add("20.3/35 kV veya 20.8/36 kV XLPE izoleli, çift kat çelik bant zırhlı, üç damarlı, alüminyum iletkenli kablolar");



        //YÜKSEK GERİLİM KABLOLARI BÖLÜMÜ
        List<String>Eight_Items = new ArrayList<String>();
        Eight_Items.add("40/69 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar");
        Eight_Items.add("89/154 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, bakır iletkenli kablolar");
        Eight_Items.add("40/69 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar");
        Eight_Items.add("89/154 kV XLPE izoleli, tek damarlı, enlemesine ve boylamasına su geçirmez, alüminyum iletkenli kablolar");






        //ALÜMİNYUM İLETKENLER BÖLÜMÜ
        List<String>Nine_Items = new ArrayList<String>();
        Nine_Items.add("Alüminyum İletken Özellikleri");
        Nine_Items.add("AAC Örgülü alüminyum iletken Amerikan ölçüleri ASTM B231 / B231M");
        Nine_Items.add("AAC Örgülü alüminyum iletken Kanada ölçüleri CSA C 49");
        Nine_Items.add("ACSR Örgülü alüminyum iletken Amerikan ölçüleri ASTM B 232/B 232M");
        Nine_Items.add("ACSR Örgülü alüminyum iletken Kanada ölçüleri CSA C 49");





        //AER KABLOLAR BÖLÜMÜ
        List<String>Ten_Items = new ArrayList<String>();
        Ten_Items.add("0.6/1kV PE izoleli, alüminyum iletkenli, çıplak askı telli enerji kabloları");










        //FİBER OPTİKLİ KORUMA İLETKENİ(OPGW) BÖLÜMÜ

        List<String>Eleven_Items = new ArrayList<String>();
        Eleven_Items.add("Fiber optikli koruma iletkeni (OPGW-95)");
        Eleven_Items.add("Fiber optikli koruma iletkeni (OPGW- 127-1)");
        Eleven_Items.add("Fiber optikli koruma iletkeni (OPGW-127-2)");
        Eleven_Items.add("Fiber optikli koruma iletkeni Özellikler (OPGW)");





        //BAKIR FİLMAŞİN BÖLÜMÜ
        List<String>Thirteen_Items = new ArrayList<String>();
        Thirteen_Items.add("Bakır filmaşin");





        //BAKIR İLETKEN BÖLÜMÜ
        List<String>Fourteen_Items = new ArrayList<String>();
        Fourteen_Items.add("Havai hatlar için örgülü bakır iletken");
        Fourteen_Items.add("Tavlanmış elektrolitik bakır iletken");





        //ALÜMİNYUM FİLMAŞİN BÖLÜMÜ
        List<String>Fifteen_Items = new ArrayList<String>();
        Fifteen_Items.add("Alüminyum filmaşin");



        //TEKNİK BİLGİLER BÖLÜMÜ
        List<String>Sixteen_Items = new ArrayList<>();
        Sixteen_Items.add("Teknik Bilgiler");










        ArrayList<String> titles=new ArrayList<String>();
        titles.add("01. TESİSAT KABLOLARI");
        titles.add("02. PVC İZOLELİ ALÇAK GERİLİM KABLOLARI");
        titles.add("03. XLPE İZOLELİ ALÇAK GERİLİM KABLOLARI");
        Details.put(titles.get(0),One_Items);
        Details.put(titles.get(1), Second_Items);
        Details.put(titles.get(2),Third_Items);
        Details.put("04. HALOJENSİZ TESİSAT KABLOLARI",Four_Items);
        Details.put("05. XLPE İZOLELİ HALOJENSİZ ALÇAK GERİLİM KABLOLARI",Five_Items);
        Details.put("06. SOLAR KABLOLAR",Six_Items);
        Details.put("07. ORTA GERİLİM KABLOLARI",Seven_Items);
        Details.put("08. YÜKSEK GERİLİM KABLOLARI",Eight_Items);
        Details.put("09. ALÜMİNYUM KABLOLAR",Nine_Items);
        Details.put("10. AER KABLOLAR",Ten_Items);
        Details.put("11. FİBER OPTİKLİ KORUMA İLETKENİ(OPGW)",Eleven_Items);
        Details.put("12. BAKIR FİLMAŞİN",Thirteen_Items);
        Details.put("13. BAKIR İLETKEN ",Fourteen_Items);
        Details.put("14. ALÜMİNYUM FİLMAŞİN",Fifteen_Items);
        Details.put("15. TEKNİK BİLGİLER",Sixteen_Items);
        return Details;

    }
}
