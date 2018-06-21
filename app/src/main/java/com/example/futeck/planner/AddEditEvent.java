package com.example.futeck.planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddEditEvent extends AppCompatActivity {

    private Button redirectCalendarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_event);

        redirectCalendarButton = findViewById(R.id.CalendarRedirectButton);

        redirectCalendarButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddEditEvent.this, Calendar_Overview.class);
                startActivity(intent);


    }
});
    }
}