package com.myapplicationdev.android.tw_listview;

public class Module {
    private String course;
    private String year;
    private boolean programming;
    public Module(String year,String course, boolean isprog) {
        this.year = year;
        this.course = course;
        this.programming = isprog;
    }
    public String getYear() {
        return year;
    }
    public String getCourse() {
        return course;
    }
    public boolean isprog() {
        return programming;
    }

}
