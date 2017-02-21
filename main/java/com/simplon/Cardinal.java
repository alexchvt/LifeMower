package com.simplon;

/**
 * Created by alex on 21/02/2017.
 */
public class Cardinal {
    public enum cardinal{
        N(0,0,1),
        W(90,0,-1),
        S(180,-1,0),
        E(270,1,0),

        private int degre;
        private int x;
        private int y;

        Cardinaux (int degre, int x, int y){
            this.degre = degre;
            this.x = x;
            this.y = y;
        }


    }


}
