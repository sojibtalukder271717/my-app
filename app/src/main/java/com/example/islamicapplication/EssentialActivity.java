package com.example.islamicapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EssentialActivity extends AppCompatActivity {

    public ImageButton essential_img_btn;
    ExpandableListView expandableListView;
    List<String> listGroup;
    HashMap<String,List<String>> listItem;
    MainAdapter adapter;
    Toolbar toolsbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essential);

        toolsbar=findViewById(R.id.toolbarView);
        setSupportActionBar(toolsbar);
        getSupportActionBar().setTitle("    ESSENTIAL");
        toolsbar.setTitleTextColor(getResources().getColor(R.color.textColor));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        expandableListView = findViewById(R.id.essential_Expend_Lst);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        adapter = new MainAdapter(this,listGroup,listItem);
        expandableListView.setAdapter(adapter);
        initListData();



       /* essential_img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent = new Intent(EssentialActivity.this,MainActivity.class);
                 startActivity(intent);
            }
        });*/



    }

    private void initListData() {
        listGroup.add(getString(R.string.group1));
        listGroup.add(getString(R.string.group2));
        listGroup.add(getString(R.string.group3));
        listGroup.add(getString(R.string.group4));
        listGroup.add(getString(R.string.group5));

        String[]array;

        List<String>list1 = new ArrayList<>();
        array= getResources().getStringArray(R.array.group1);
        for (String item:array){
            list1.add(item);
        }

        List<String>list2 = new ArrayList<>();
        array= getResources().getStringArray(R.array.group2);
        for (String item:array){
            list2.add(item);
        }

        List<String>list3 = new ArrayList<>();
        array= getResources().getStringArray(R.array.group3);
        for (String item:array){
            list3.add(item);
        }

        List<String>list4 = new ArrayList<>();
        array= getResources().getStringArray(R.array.group4);
        for (String item:array){
            list4.add(item);
        }

        List<String>list5 = new ArrayList<>();
        array= getResources().getStringArray(R.array.group5);
        for (String item:array){
            list5.add(item);
        }
        listItem.put(listGroup.get(0),list1);
        listItem.put(listGroup.get(1),list2);
        listItem.put(listGroup.get(2),list3);
        listItem.put(listGroup.get(3),list4);
        listItem.put(listGroup.get(4),list5);

        adapter.notifyDataSetChanged();
    }
}
