package com.company;

public class BroadcastsPro {
    public String title;
    public int timeBegin;
    public int timeEnd;
    public BroadcastsPro(String title, int timeBegin, int timeEnd) {
        setTitle(title);
        setTimeBegin(timeBegin);
        setTimeEnd(timeEnd);
    }

    public BroadcastsPro() {
    }

    public String getTitle() {
        return title;
    }

    public int getTimeBegin() {
        return timeBegin;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTimeBegin(int timeBegin) {
        this.timeBegin = timeBegin;
    }
    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }
}
