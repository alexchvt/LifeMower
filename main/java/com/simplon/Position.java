package com.simplon;

/**
 * Created by alex on 21/02/2017.
 */
public class Position {
    private int x;
    private int y;
    private char orientation;

    public Position(int x, int y, char orientation){
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public int getX (){
        return this.x;
    }

    public int getY (){
        return this.y;
    }

    public char getOrientation(){
        return this.orientation;
    }

    public void setOrientation(char orientation){
        this.orientation = orientation;
    }



}

