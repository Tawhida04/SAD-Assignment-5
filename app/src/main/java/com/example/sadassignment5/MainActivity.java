package com.example.sadassignment5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    // Using ArrayList to store images data
    ArrayList courseImg = new ArrayList<>(Arrays.asList(R.drawable.img, R.drawable.img_1,
            R.drawable.img_2, R.drawable.img_3,
            R.drawable.img_4, R.drawable.img_5,
            R.drawable.img_6, R.drawable.img_7,
            R.drawable.img_8, R.drawable.img_9,
            R.drawable.img_10, R.drawable.img_11,
            R.drawable.img_12, R.drawable.img_13,
                    R.drawable.img_14));
    ArrayList courseName = new ArrayList<>(Arrays.asList("Data Structure", "C++", "C#", "JavaScript", "Java",
            "C-Language", "HTML 5", "CSS", "Python", "PHP", "SQL", "MATLAB", "Kotlin", "TypeScript", "Scala" ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting reference of recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // Setting the layout as linear
        // layout for vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        // Sending reference and data to Adapter
        Adapter adapter = new Adapter(MainActivity.this, courseImg, courseName);

        // Setting Adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
