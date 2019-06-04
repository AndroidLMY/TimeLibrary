package com.example.timelibrary;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by richzjc on 18/3/13.
 */

public class DayTimeEntity implements Parcelable {
    public int day;
    public int month;
    public int year;
    public int listPosition;
    public int monthPosition;

    public DayTimeEntity(int year, int month, int day, int listPosition, int monthPosition) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.listPosition = listPosition;
        this.monthPosition = monthPosition;
    }

    public String getStartTime() {
        String time = "";
        if (month < 10 && day < 10) {
            time = year + "0" + (month + 1) + "0" + day;
        }
        if (month < 10 && day > 9) {
            time = year + "0" + (month + 1) + "" + day;
        }
        if (month > 9 && day > 9) {
            time = year + "" + (month + 1) + "" + day;
        }
        if (month > 9 && day < 10) {
            time = year + "" + (month + 1) + "0" + day;
        }
        return time;
    }

    public String getEndTime() {
        String time = "";
        if (month < 10 && day < 10) {
            time = year + "0" + (month + 1) + "0" + day;
        }
        if (month < 10 && day > 9) {
            time = year + "0" + (month + 1) + "" + day;
        }
        if (month > 9 && day > 9) {
            time = year + "" + (month + 1) + "" + day;
        }
        if (month > 9 && day < 10) {
            time = year + "" + (month + 1) + "0" + day;
        }
        return time;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.day);
        dest.writeInt(this.month);
        dest.writeInt(this.year);
        dest.writeInt(this.listPosition);
        dest.writeInt(this.monthPosition);
    }

    protected DayTimeEntity(Parcel in) {
        this.day = in.readInt();
        this.month = in.readInt();
        this.year = in.readInt();
        this.listPosition = in.readInt();
        this.monthPosition = in.readInt();
    }

    public static final Creator<DayTimeEntity> CREATOR = new Creator<DayTimeEntity>() {
        @Override
        public DayTimeEntity createFromParcel(Parcel source) {
            return new DayTimeEntity(source);
        }

        @Override
        public DayTimeEntity[] newArray(int size) {
            return new DayTimeEntity[size];
        }
    };
}
