package com.yeejoin.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhou on 2017/3/28.
 */
public class EquipResponse implements Serializable{
    private String state = "";
    private List<EquipModel> data = new ArrayList<>();
    private String time = "";
    private String message = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<EquipModel> getData() {
        return data;
    }

    public void setData(List<EquipModel> data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
