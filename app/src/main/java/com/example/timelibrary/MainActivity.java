package com.example.timelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private CalendarSelectView calendarSelect;
    Calendar startCalendar;//开始控件的月份
    Calendar endCalendar;//开始控件的月份
    Calendar startCalendarDate;
    Calendar endCalendarDate;
    DayTimeEntity startDayTime;
    DayTimeEntity endDayTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarSelect = findViewById(R.id.calendar_select);
        calendarSelect.setistitleTimeShow(false);
        ConfirmSelectDateCallback selectDateCallback = new ConfirmSelectDateCallback() {
            @Override
            public void selectSingleDate(DayTimeEntity timeEntity) {
                //TODO 单选回调此方法
            }

            @Override
            public void selectMultDate(DayTimeEntity startTimeEntity, DayTimeEntity endTimeEntity) {
                //TODO 选择时间段回调些方法
                Toast.makeText(MainActivity.this, startTimeEntity.getStartTime() + "///" + endTimeEntity.getEndTime(), Toast.LENGTH_SHORT).show();

            }
        };
        calendarSelect.setConfirmCallback(selectDateCallback);
    }
}
