package com.model;

import java.util.List;

public class TimelineRet {
    private List<Statuses> statuses;

    private boolean hasvisible;

    private long previous_cursor;

    private long next_cursor;

    private long total_number;

    private long interval;

    public void setStatuses(List<Statuses> statuses) {
        this.statuses = statuses;
    }

    public List<Statuses> getStatuses() {
        return this.statuses;
    }

    public void setHasvisible(boolean hasvisible) {
        this.hasvisible = hasvisible;
    }

    public boolean getHasvisible() {
        return this.hasvisible;
    }

    public void setPrevious_cursor(long previous_cursor) {
        this.previous_cursor = previous_cursor;
    }

    public long getPrevious_cursor() {
        return this.previous_cursor;
    }

    public void setNext_cursor(long next_cursor) {
        this.next_cursor = next_cursor;
    }

    public long getNext_cursor() {
        return this.next_cursor;
    }

    public void setTotal_number(long total_number) {
        this.total_number = total_number;
    }

    public long getTotal_number() {
        return this.total_number;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public long getInterval() {
        return this.interval;
    }

}