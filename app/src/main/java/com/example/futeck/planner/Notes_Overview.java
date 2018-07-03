package com.example.futeck.planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;


public class Notes_Overview extends AppCompatActivity {

    private Button RedirectToDoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes__overview);

        RedirectToDoButton = findViewById(R.id.button2);


        RedirectToDoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notes_Overview.this, Calendar_Overview.class);
                startActivity(intent);
            }
        });





    }
}
































/*


    }

*/
/*    private EditText itemET;
    private Button btn;
    private ListView itemsList;

    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes__overview);

        itemET = findViewById(R.id.item_edit_text);
        btn = findViewById(R.id.add_button);
        itemsList = findViewById(R.id.items_list);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.add_button:
                String itemEntered = itemET.getText().toString();
                adapter.add(itemEntered);
                itemET.setText("");

                Toast.makeText(this, "Task Added", Toast.LENGTH_SHORT).show();*//*
*/
/*


        }
    }

*//*

*/
/*    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes__overview);

        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("message");
    }*//*
*/
/*

}
*//*

}
*/
