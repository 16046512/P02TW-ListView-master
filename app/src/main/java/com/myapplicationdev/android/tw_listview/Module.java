package com.myapplicationdev.android.tw_listview;

public class Module {
    private String year;
    private String course;
    private boolean star;
    public Module(String year,String course, boolean star) {
        this.year = year;
        this.course = course;
        this.star = star;
    }
    public String getYear() {
        return year;
    }
    public String getCourse() {
        return course;
    }
    public boolean isStar() {
        return star;
    }

}
