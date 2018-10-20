package com.example.d2a.aplikasilistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
//    private ListView listpiw;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        String buah[]={"Mangga","Jeruk","Anggur","Apel"};
//        ArrayAdapter adaptor=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,buah);
//
//        listpiw=(ListView)findViewById(R.id.listVie);
//
//        listpiw.setAdapter(adaptor);
    //}

    private ListView listView1;

         @Override
 public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         Fruit weather_data[] = new Fruit[]
         {
             new Fruit(R.drawable.apel, "Apel"),
                     new Fruit(R.drawable.anggur, "Anggur"),
                     new Fruit(R.drawable.mangga, "Mangga"),
                     new Fruit(R.drawable.jeruk, "Jeruk"),
                     new Fruit(R.drawable.semangka, "Semangka")
             };

         FruitAdapter adapter = new FruitAdapter(this,
                 R.layout.listview_item_row, weather_data);

         listView1 = (ListView)findViewById(R.id.listVie);

         View header =
                (View)getLayoutInflater().inflate(R.layout.list_view_header_row, null);
         listView1.addHeaderView(header);

         listView1.setAdapter(adapter);
         }
}
