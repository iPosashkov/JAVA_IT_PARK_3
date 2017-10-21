package com.company;

import java.time.LocalTime;

public class Channel {
    private String titleChannel;
    private Program program[];
    private LocalTime currentTime = LocalTime.now();
    private int currentHour = currentTime.getHour();
    public Channel (String titleChannel, Program program[]) {
        this.titleChannel = titleChannel;
        this.program = program;
    }

    public String getTitleChannel() {
        return titleChannel;
    }

    public Program[] getProgram() {
        return program;
    }

    public void setTitleChannel(String titleChannel) {
        this.titleChannel = titleChannel;
    }

    public void setProgram(Program[] program) {
        this.program = program;
    }
    void detectProgram (Program program[]) {
        for (int i = 0; i < program.length; i++) {
            if (program[i].getTimeBegin() <= currentHour && program[i].getTimeEnd() > currentHour) {
                System.out.println("В ЭФИРЕ: '" + program[i].getTitleProgram() + "' до " + program[i].getTimeEnd() + ":00\n");
            }
        }
    }
}