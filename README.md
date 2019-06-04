# TimeLibrary
通过日历选择一段时间<br>
参考了https://github.com/richzjc/calendar_select项目修改了一些自己需要的功能<br>
## 添加依赖<br>
    implementation 'com.github.AndroidLMY:TimeLibrary:1.0.3'<br>
## 布局引用<br>
<com.example.timelibrary.CalendarSelectView<br>
android:id="@+id/calendar_select"<br>
android:layout_width="match_parent"<br>
android:layout_height="match_parent"<br>
android:clickable="true"<br>
app:locate_position="today"<br>
app:select_type="mult"><br>
</com.example.timelibrary.CalendarSelectView><br>
## Activity使用<br>

 calendarSelect.setistitleTimeShow(false);//隐藏控件顶部时间<br>
 ConfirmSelectDateCallback selectDateCallback = new ConfirmSelectDateCallback() {<br>
            @Override<br>
            public void selectSingleDate(DayTimeEntity timeEntity) {<br>
                //TODO 单选回调此方法<br>
            }<br>
            @Override<br>
            public void selectMultDate(DayTimeEntity startTimeEntity, DayTimeEntity endTimeEntity) {<br>
                //TODO 选择时间段回调些方法<br>
                Toast.makeText(SelectSpellActivity.this, startTimeEntity.getStartTime() + "///" + endTimeEntity.getEndTime(), Toast.LENGTH_SHORT).show();<br>
            }<br>
        };<br>
        calendarSelect.setConfirmCallback(selectDateCallback);<br>
