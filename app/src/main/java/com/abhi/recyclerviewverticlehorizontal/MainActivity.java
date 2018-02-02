package com.abhi.recyclerviewverticlehorizontal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mVerticalRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVerticalRecyclerView=findViewById(R.id.verticleRecyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        mVerticalRecyclerView.setLayoutManager(layoutManager);
        
        initList();
        VerticalListAdapter adapter=new VerticalListAdapter(this);
        mVerticalRecyclerView.setAdapter(adapter);


    }

    private void initList() {
    }
}
