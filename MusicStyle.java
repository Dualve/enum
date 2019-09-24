package com.company;

public enum MusicStyle {
    JAZZ(10), CLASSIC(5), ROCK(117), BLUES;
    MusicStyle(){}
    int Group;
    MusicStyle(int amountOfGroups){
        this.Group = amountOfGroups;
    }
    public void showSinger(){
        switch (this){
            case JAZZ:
                System.out.println("Frank Synatra");
                break;
            case ROCK:
                System.out.println("Jhon Lenon");
                break;
            case BLUES:
                System.out.println("B.B.King");
                break;
            case CLASSIC:
                System.out.println("Luciano Pavarotti");
                break;
        }
    }

    public String toString(){
        return String.format("%s has %d groups", name(), Group);
    }
}
