package com.yet.spring.core.beans;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Event {

    private UUID id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat df) {
        this.id = UUID.randomUUID();
        this.date = date;
        this.dateFormat = df;
    }

    public UUID getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Event [id=" + id + ", msg=" + msg + ", date=" + dateFormat.format(date) + "]";
    }


}
