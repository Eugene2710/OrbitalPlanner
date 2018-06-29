package com.example.futeck.planner;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.time.Clock;
import java.util.Calendar;

public class AddEditEvent extends AppCompatActivity {



    TextView datepicktextview;
    Calendar mCurrentDate;
    int day, month, year;
    Button datepickbutton;
    Calendar mCurrentTime;
    int hour, minute;
    TextView frompicktextview;
    Button fromtimebutton;
    String format;
    TextView topicktextview;
    Button totimebutton;


    //to select date using a Calendar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_event);

        datepicktextview = findViewById(R.id.datepickerTextView);
        datepickbutton = findViewById(R.id.button3);

        mCurrentDate = Calendar.getInstance();

        day = mCurrentDate.get(Calendar.DAY_OF_MONTH);
        month = mCurrentDate.get(Calendar.MONTH);
        year = mCurrentDate.get(Calendar.YEAR);

        month = month + 1;

        datepicktextview.setText(day + "/" + month + "/" + year);

        datepickbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(AddEditEvent.this, new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        monthOfYear = monthOfYear + 1;
                        datepicktextview.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
                    }
                }, year, month, day);
                datePickerDialog.show();

            }
        });

        //to select From: time using a Clock
        frompicktextview = findViewById(R.id.frompickerTextView);
        fromtimebutton = findViewById(R.id.fromButton);

        mCurrentTime = Calendar.getInstance();

        hour = mCurrentTime.get(Calendar.HOUR_OF_DAY);
        minute = mCurrentTime.get(Calendar.MINUTE);

        selectedTimeFormat(hour);

        frompicktextview.setText(hour + " : " + minute + " " + format);

        fromtimebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(AddEditEvent.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        selectedTimeFormat(hourOfDay);
                        frompicktextview.setText(hourOfDay + " : " + minute + " " + format);
                    }
                }, hour, minute, true);
                timePickerDialog.show();
            }
        });

        //to select To: time using a Clock
        topicktextview = findViewById(R.id.topickerTextView);
        totimebutton = findViewById(R.id.toButton);

        mCurrentTime = Calendar.getInstance();

        hour = mCurrentTime.get(Calendar.HOUR_OF_DAY);
        minute = mCurrentTime.get(Calendar.MINUTE);

        selectedTimeFormat(hour);

        topicktextview.setText(hour + " : " + minute + " " + format);

        totimebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(AddEditEvent.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        selectedTimeFormat(hourOfDay);
                        topicktextview.setText(hourOfDay + " : " + minute + " " + format);
                    }
                }, hour, minute, true);
                timePickerDialog.show();
            }
        });
    }

    public void selectedTimeFormat(int hour){

        if (hour == 0){
            hour += 12;
            format = "AM";
        } else if (hour == 12){
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }





        /*fromtimebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(AddEditEvent.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        hourOfDay = hourOfDay + 1;
                        frompicktextview.setText(hourOfDay + ":" + minute);
                    }
                }, );
                timePickerDialog.show();
            }
        });*/









    /*    private Button redirectCalendarButton;*/

/*        redirectCalendarButton = findViewById(R.id.CalendarRedirectButton);

        redirectCalendarButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddEditEvent.this, Calendar_Overview.class);
                startActivity(intent);*/

    }
}