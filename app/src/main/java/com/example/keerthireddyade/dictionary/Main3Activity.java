package com.example.keerthireddyade.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView meaning,sentence;
    String xyz,abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        meaning=findViewById(R.id.item_meaning);
        sentence=findViewById(R.id.item_sentence);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        xyz=bundle.getString("meaning");
        abc=bundle.getString("example");
        meaning.setText(xyz);
        sentence.setText(abc);
    }
}
