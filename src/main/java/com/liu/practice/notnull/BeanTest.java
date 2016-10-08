package com.liu.practice.notnull;


import com.google.common.base.Objects;
import com.sun.istack.internal.NotNull;

import java.util.Date;

/**
 * @author liulinlin1
 * @since：2016/9/30
 */
public class BeanTest {
    private int id;
    private String name;
    @NotNull
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
    return date.toString();
    }
}
