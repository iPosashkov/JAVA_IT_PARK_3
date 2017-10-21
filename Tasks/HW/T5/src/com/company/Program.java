package com.company;
import java.time.LocalTime;
public class Program {
    String titleProgram;
    private int timeBegin;
    private int timeEnd;
    public Program(String titleProgram, int timeBegin, int timeEnd) {
        this.titleProgram = titleProgram;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
    }

    public String getTitleProgram() {
        return titleProgram;
    }

    public int getTimeBegin() {
        return timeBegin;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTitleProgram(String titleProgram) {
        this.titleProgram = titleProgram;
    }

    public void setTimeBegin(int timeBegin) {
        this.timeBegin = timeBegin;
    }

    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }
}
