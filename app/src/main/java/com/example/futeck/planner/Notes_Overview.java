package com.example.futeck.planner;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Notes_Overview extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton FAB;
    private EditText tasktitle;
    private RecyclerView recyclerView;

    @Override
    public void onClick(View v) {
        FAB = findViewById(R.id.floatingActionButton);
        tasktitle = findViewById(R.id.task_title_edittext);
        recyclerView = findViewById(R.id.recycler_view);

       /* FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tasktitle != null) {*/


































    }

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


        }
    }

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

}
*/
}
