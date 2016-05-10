/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tick.tack.toe;

/**
 *
 * @author Max
 */
public class Game implements Draw {

    public char[][] gf = new char[3][3]; // Game Field
    int gamenumber; // Game quantity for future)

    public void draw() {
        System.out.printf("%s %s %s\n%s %s %s\n%s %s %s\n", gf[0][0], gf[0][1], gf[0][2], gf[1][0], gf[1][1], gf[1][2], gf[2][0], gf[2][1], gf[2][2]);
    }

    public void clear() {
        gf[0][0] = '-';
        gf[0][1] = '-';
        gf[0][2] = '-';
        gf[1][0] = '-';
        gf[1][1] = '-';
        gf[1][2] = '-';
        gf[2][0] = '-';
        gf[2][1] = '-';
        gf[2][2] = '-';
    }
}
