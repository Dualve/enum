package com.company;

public class Main {

    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.CLASSIC;
        System.out.print(ms);

        switch (ms){
            case JAZZ:
                System.out.println(" in Jazz style");
                ms.showSinger();
                break;
            case CLASSIC:
                System.out.println(" in Classic style");
                ms.showSinger();
                break;
            case ROCK:
                System.out.println(" in Rock style");
                ms.showSinger();
                break;
            case BLUES:
                System.out.println(" in Blues style");
                ms.showSinger();
                break;
            default:
                System.out.println("Unknown music style");
        }
    }
}
