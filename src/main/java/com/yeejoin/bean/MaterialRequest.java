package com.yeejoin.bean;

import java.io.Serializable;

/**
 * Created by zhou on 2017/3/16.
 */
public class MaterialRequest implements Serializable{
    private String type;
    private int offset;
    private int count;

    public MaterialRequest(String type, int offset, int count) {
        this.type = type;
        this.offset = offset;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

