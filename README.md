# TimeLibrary
通过日历选择一段时间<br>
参考了https://github.com/richzjc/calendar_select项目修改了一些自己需要的功能
## 添加依赖
    implementation 'com.github.AndroidLMY:TimeLibrary:1.0.4'
## 布局引用
```
    <com.example.timelibrary.CalendarSelectView
        android:id="@+id/calendar_select"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:clickable="true"
        app:locate_position="today"
        app:select_type="mult"/>

```

## Activity使用
```
        calendarSelect.setistitleTimeShow(false);//隐藏控件顶部时间
        ConfirmSelectDateCallback selectDateCallback = new ConfirmSelectDateCallback() {
            @Override
            public void selectSingleDate(DayTimeEntity timeEntity) {
                //TODO 单选回调此方法
            }

            @Override
            public void selectMultDate(DayTimeEntity startTimeEntity, DayTimeEntity endTimeEntity) {
                //TODO 选择时间段回调些方法
                Toast.makeText(SelectSpellActivity.this, startTimeEntity.getStartTime() + 
                        "///" + endTimeEntity.getEndTime(), Toast.LENGTH_SHORT).show();
            }
        };
        calendarSelect.setConfirmCallback(selectDateCallback);

```
 
