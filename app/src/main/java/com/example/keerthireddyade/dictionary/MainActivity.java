package com.example.keerthireddyade.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView listView;
private String[] meanings={
        "cease to support or look after.",
        "an act of breaking or observe a law.",
        "express complete disapproval of.",
        "methodically cut up(a body)in order to study its internal parts.",
        "motivated by a spirit of rivalry.",
        "a very unusual and unexpected event an situation.",
        "smoothness and elegance of movement.","a kind of strong, smooth brown wrapping paper.",
        "sumptuously rich, elaborate, or luxurious.",
        "a movement or series of moves requiring skill and care.",
        "famous or well known, typically for some bad quality or deed.",
        "elaborately or highly decorated.",
        "first in importance, order, or position; leading.",
        "a question, especially one expressing doubt or requesting information.",
        "provide or give (a service, help, etc.).",
        "having or showing dogged determination not to change one's attitude or position on something, especially in spite of good reasons to do so.",
"the conditions under which land or buildings are held or occupied.",
        "present, appearing, or found everywhere.",

        "exposed to the possibility of being attacked or harmed, either physically or emotionally.",
        "equivalent in value to the sum or item specified."

};
private String[] examples={"Her natural mother had abandoned her at an early age.",
                            "A widening beach between governament and church.",
                             "The rebels had been condemned to death.",
                              "He dissected the primeminister's statement and revealed the truth.",
                               "There are many emulous young writers.",
                                 "She can't see me when she walks,she'll freak out.",
        "She moved through the water with effortless grace.",
        "Work Kraft and Stoff (1855), which became a kind of B textbook of materialism.",
        "A lavish banquet.",
        "The lorry was unable to manoeuvre comfortably in the narrow street.",
        "Los Angeles is notorious for its smog.",
        "An ornate wrought-iron railing",
        "Germany's premier rock band.",
        "Many people queried whether any harm had been done",
"money serves as a reward for services rendered.",
        "You're a silly, stubborn old woman.",
        "His tenure of the premiership would be threatened",
        "His ubiquitous influence was felt by all the family.",
        "We were in a vulnarable position",
        "The museums in the district are well worth a visit."
                              };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);

        ArrayList<main2activity> listItems = new ArrayList<main2activity>();

        main2activity obj1 = new main2activity("abandon");
        listItems.add(obj1);
        main2activity obj2 = new main2activity("breach");
        listItems.add(obj2);
        main2activity obj3 = new main2activity("condemn");
        listItems.add(obj3);
        main2activity obj4 = new main2activity("dissect");
        listItems.add(obj4);
        main2activity obj5 = new main2activity("emulous");
        listItems.add(obj5);
        main2activity obj6 = new main2activity("freak");
        listItems.add(obj6);
        main2activity obj7 = new main2activity("grace");
        listItems.add(obj7);
        main2activity obj8 = new main2activity("kraft");
        listItems.add(obj8);
        main2activity obj9 = new main2activity("lavish");
        listItems.add(obj9);
        main2activity obj10 = new main2activity("manoeurve");
        listItems.add(obj10);
        main2activity obj11 = new main2activity("notorious");
        listItems.add(obj11);
        main2activity obj12 = new main2activity("ornate");
        listItems.add(obj12);
        main2activity obj13 = new main2activity("premier");
        listItems.add(obj13);
        main2activity obj14 = new main2activity("query");
        listItems.add(obj14);
        main2activity obj15 = new main2activity("render");
        listItems.add(obj15);
        main2activity obj16 = new main2activity("stubborn");
        listItems.add(obj16);
        main2activity obj17 = new main2activity("tenure");
        listItems.add(obj17);
        main2activity obj18 = new main2activity("ubiquitous");
        listItems.add(obj18);
        main2activity obj19 = new main2activity("vulnerable");
        listItems.add(obj19);
        main2activity obj20 = new main2activity("worth");
        listItems.add(obj20);
        final MyListAdapter adapter = new MyListAdapter(MainActivity.this, listItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                main2activity obj = adapter.getItem(position);
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                Bundle bundle=new Bundle();
                String itemClicked=meanings[position];
                String itemClick=examples[position];
                bundle.putString("meaning",itemClicked);
                bundle.putString("example",itemClick);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    }