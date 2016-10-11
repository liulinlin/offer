package com.liu.practice.enumtest;

import com.liu.practice.enumtest.type.MYNOTNULL;

import java.util.Date;

/**
 * Created by liulinlin on 2016/10/2.
 */
public class EnumBean extends EnumBeanParent {

    @MYNOTNULL
    private int id;
    @MYNOTNULL
    private String name;
    @MYNOTNULL
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
