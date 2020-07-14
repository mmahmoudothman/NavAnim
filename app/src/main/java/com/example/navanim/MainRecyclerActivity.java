package com.example.navanim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainRecyclerActivity extends AppCompatActivity implements ContentAdapter.ItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        ArrayList<String> list = new ArrayList<>();
        list.add("aaaaaaa");
        list.add("bbbbbbb");
        list.add("cccccccc");
        list.add("ddddddd");
        list.add("eeeeeeee");
        list.add("ffffffff");
        LinearLayoutManager manager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(manager);
        ContentAdapter adapter = new ContentAdapter(this, list);
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);

    }

    @Override
    public void onClick(View view, int position) {
        Intent intent = new Intent(this, TestActivity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(this, view, "profile");
        startActivity(intent, options.toBundle());

    }
}
