package com.example.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String[] MENU = new String[]{
            "Black Coffee", "Arabian Coffee", "Choco Coffee", "Milo Coffee", "Vanila Late",
            "Matcha Coffee", "Choco Milk", "Oreo Milk", "Redvelvet Coffee", "Strawberu Milk"
    };

    Spinner spinner;

    ListView listView;

//    ListView listViewMajor;
//    String[] major;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        Kodingan AutoCompleteTextView
        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MENU);
        editText.setAdapter(adapter);

        //        Kodingan Spiner
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.menu, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String menu = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Anda klik menu" + menu, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //        Kodingan listViewMajor
        listView = findViewById(R.id.ListView);
        String[] values = new String[]{
                "Black Coffee", "Arabian Coffee", "Choco Coffee", "Milo Coffee", "Vanila Late",
                "Matcha Coffee", "Choco Milk", "Oreo Milk", "Redvelvet Coffee", "Strawberu Milk"
        };

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Anda klik menu:" + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });

//        listViewMajor = findViewById(R.id.lvMajor);
//        major = new DateFormatSymbols().getMonths();
//        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, major);
//        listViewMajor.setAdapter(monthAdapter);
//        listViewMajor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String month = adapterView.getItemAtPosition(1).toString();
//                Toast.makeText(getApplicationContext(), "Clicked"+month, Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}