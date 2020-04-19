package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btMove;
    Button button2;
    EditText editText;
    EditText editText2;
    ListView listofnames;
    List<String> grocery = new ArrayList<String>();
    String [] startingList = {"tomato", "fish"}
    List<Integer> grosum = new ArrayList<Integer>();


    ArrayAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btMove = findViewById(R.id.bt);
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        listofnames = findViewById(R.id.listofnames);
        grocery = new ArrayList<String>(Arrays.asList(startingList));
        grosum = new ArrayList<Integer>();

        ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,grocery,grosum);

        listofnames.setAdapter(ad);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String newName = editText.getText().toString();
                String newNumber = editText2.getText().toString();
                grocery.add(newName);
                grosum.add(newNumber);
                ad.notifyDataSetChanged();


            }

            }
        btMove.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveToActivityTwo();
            }
        });


    }
    private void  moveToActivityTwo(){
        Intent intent = new Intent(MainActivity.tis)
    }
}
