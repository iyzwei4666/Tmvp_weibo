/**
  * Copyright 2018 aTool.org 
  */
package com.model;

import java.util.List;

/**
 * Auto-generated: 2018-04-25 21:58:19
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class TimelineRet {

    private List<com.model.json.statues.Statuses> statuses;
    private List<String> advertises;
    private List<String> ad;
    private boolean hasvisible;

    private long previous_cursor;

    private long next_cursor;

    private long total_number;
    private long interval;

    private long uve_blank;

    private long since_id;

    private long max_id;

    private long has_unread;

    public List<com.model.json.statues.Statuses> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<com.model.json.statues.Statuses> statuses) {
        this.statuses = statuses;
    }

    public List<String> getAdvertises() {
        return advertises;
    }

    public void setAdvertises(List<String> advertises) {
        this.advertises = advertises;
    }

    public List<String> getAd() {
        return ad;
    }

    public void setAd(List<String> ad) {
        this.ad = ad;
    }

    public boolean isHasvisible() {
        return hasvisible;
    }

    public void setHasvisible(boolean hasvisible) {
        this.hasvisible = hasvisible;
    }

    public long getPrevious_cursor() {
        return previous_cursor;
    }

    public void setPrevious_cursor(long previous_cursor) {
        this.previous_cursor = previous_cursor;
    }

    public long getNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(long next_cursor) {
        this.next_cursor = next_cursor;
    }

    public long getTotal_number() {
        return total_number;
    }

    public void setTotal_number(long total_number) {
        this.total_number = total_number;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public long getUve_blank() {
        return uve_blank;
    }

    public void setUve_blank(long uve_blank) {
        this.uve_blank = uve_blank;
    }

    public long getSince_id() {
        return since_id;
    }

    public void setSince_id(long since_id) {
        this.since_id = since_id;
    }

    public long getMax_id() {
        return max_id;
    }

    public void setMax_id(long max_id) {
        this.max_id = max_id;
    }

    public long getHas_unread() {
        return has_unread;
    }

    public void setHas_unread(long has_unread) {
        this.has_unread = has_unread;
    }
}