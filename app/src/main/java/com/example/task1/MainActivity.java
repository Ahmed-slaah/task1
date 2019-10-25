package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private mailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRecyclerView ();
    }

    private void setRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.RV);
        GridLayoutManager mngr = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(mngr);
        adapter = new mailAdapter(this);
        recyclerView.setAdapter(adapter);
        setUpData ();

    }

    private void setUpData() {
        String Mail_address [] = {"Sam","FaceBook","Google+","Twitter","Pinterest Weekly","Josh"};
        String Mail_content [] = {"Weekend advanture","james,you have 1 new message","top suggested Google+ for you","follow T_Mobil,Samsung mobile U","pins you'll love!","Going lunch"};
        List<Mail>mailList=new ArrayList<>();
        for (int i = 0 ; i<Mail_address.length;i++){
            mailList.add(new Mail(Mail_address[i],Mail_content[i]));
        }
        adapter.setDataSource (mailList);
        adapter.notifyDataSetChanged();
    }
}
