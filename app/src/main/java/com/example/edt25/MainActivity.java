package com.example.edt25;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    ArrayList<Animals> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        String[] meals = {"M01","M02"};
        animals.add(new Animals("https://joanseculi.com/images/image01.jpg","bird","BearYogi",2,2019,meals,"bear Alaska"));
        animals.add(new Animals("https://i.picsum.photos/id/1069/3500/2333.jpg?hmac=VBJ1vR2opkcKLS9NKGDl5uPxF02u6dSqbwc1x1b4oJc","yak","BearYogi",2,2019,meals,"bear Alaska"));
        animals.add(new Animals("https://i.picsum.photos/id/200/1920/1280.jpg?hmac=-eKjMC8-UrbLMpy1A4OWrK0feVPB3Ka5KNOGibQzpRU","walrus","BearYogi",2,2019,meals,"walrus Alaska"));
        animals.add(new Animals("https://i.picsum.photos/id/433/4752/3168.jpg?hmac=Og-twcmaH_j-JNExl5FsJk1pFA7o3-F0qeOblQiJm4s","Bear","BearYogi",2,2019,meals,"bear Alaska"));

        MyAdapter myAdapter = new MyAdapter(this,animals);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}