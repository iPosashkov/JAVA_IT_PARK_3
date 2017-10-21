package com.company;
public class TV {
    private Channel channel[];
    private static final TV instance;
    private TV(){
    }
    static {
        instance = new TV();
    }
    static TV getInstance() {
        return instance;
    }
    void showChannel (Channel channel[]){
        for (int i = 0; i < channel.length; i++) {
            System.out.println(channel[i].getTitleChannel());
        }
    }
    void detectChannel (Channel channel[], int x) {
        if (x >= channel.length) {
            System.out.println("ОШИБКА: такого канала нет\n");
        }
        else if (x < 0) {
            System.out.println("ОШИБКА: такого канала нет\n");
        }
        else {
            channel[x].detectProgram(channel[x].getProgram());
        }
    }
}
