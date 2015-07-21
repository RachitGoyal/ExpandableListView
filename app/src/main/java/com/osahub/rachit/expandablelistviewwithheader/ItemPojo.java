package com.osahub.rachit.expandablelistviewwithheader;

/**
 * Created by Rachit on 21-07-2015.
 */
public class ItemPojo {
    String title;
    int num;

    public ItemPojo() {
    }

    public ItemPojo(String title, int num) {
        this.title = title;
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
