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
    boolean winconditionX;
    boolean winconditionO;
    boolean aiturnend;
    boolean aiwin;

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

    public void wincondX() {
        if (gf[0][0] == 'X' & gf[0][1] == 'X' & gf[0][2] == 'X') {
            winconditionX = true;
        }
        if (gf[0][0] == 'X' & gf[1][0] == 'X' & gf[2][0] == 'X') {
            winconditionX = true;
        }
        if (gf[1][0] == 'X' & gf[1][1] == 'X' & gf[1][2] == 'X') {
            winconditionX = true;
        }
        if (gf[2][0] == 'X' & gf[2][1] == 'X' & gf[2][2] == 'X') {
            winconditionX = true;
        }
        if (gf[0][1] == 'X' & gf[1][1] == 'X' & gf[2][1] == 'X') {
            winconditionX = true;
        }
        if (gf[0][2] == 'X' & gf[1][2] == 'X' & gf[2][2] == 'X') {
            winconditionX = true;
        }
        if (gf[0][0] == 'X' & gf[1][1] == 'X' & gf[2][2] == 'X') {
            winconditionX = true;
        }
        if (gf[0][2] == 'X' & gf[1][1] == 'X' & gf[2][0] == 'X') {
            winconditionX = true;
        }
    }

    public void wincondO() {
        if (gf[0][0] == 'O' & gf[0][1] == 'O' & gf[0][2] == 'O') {
            winconditionO = true;
        }
        if (gf[0][0] == 'O' & gf[1][0] == 'O' & gf[2][0] == 'O') {
            winconditionO = true;
        }
        if (gf[1][0] == 'O' & gf[1][1] == 'O' & gf[1][2] == 'O') {
            winconditionO = true;
        }
        if (gf[2][0] == 'O' & gf[2][1] == 'O' & gf[2][2] == 'O') {
            winconditionO = true;
        }
        if (gf[0][1] == 'O' & gf[1][1] == 'O' & gf[2][1] == 'O') {
            winconditionO = true;
        }
        if (gf[0][2] == 'O' & gf[1][2] == 'O' & gf[2][2] == 'O') {
            winconditionO = true;
        }
        if (gf[0][0] == 'O' & gf[1][1] == 'O' & gf[2][2] == 'O') {
            winconditionO = true;
        }
        if (gf[0][2] == 'O' & gf[1][1] == 'O' & gf[2][0] == 'O') {
            winconditionO = true;
        }
    }

    public void aiattack() {
        //line 0
        if (gf[0][0] == 'O' & gf[0][1] == 'O' & gf[0][2] == '-') {
            gf[0][2] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][0] == 'O' & gf[0][1] == '-' & gf[0][2] == 'O') {
            gf[0][1] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][0] == '-' & gf[0][1] == 'O' & gf[0][2] == 'O') {
            gf[0][0] = 'O';
            aiturnend = true;
        }
        //line 1
        if (gf[1][0] == 'O' & gf[1][1] == 'O' & gf[1][2] == '-') {
            gf[1][2] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[1][0] == 'O' & gf[1][1] == '-' & gf[1][2] == 'O') {
            gf[1][1] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[1][0] == '-' & gf[1][1] == 'O' & gf[1][2] == 'O') {
            gf[1][0] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        //line 2
        if (gf[2][0] == 'O' & gf[2][1] == 'O' & gf[2][2] == '-') {
            gf[2][2] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[2][0] == 'O' & gf[2][1] == '-' & gf[2][2] == 'O') {
            gf[2][1] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[2][0] == '-' & gf[2][1] == 'O' & gf[2][2] == 'O') {
            gf[2][0] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        //colunm 0
        if (gf[0][0] == 'O' & gf[1][0] == 'O' & gf[2][0] == '-') {
            gf[2][0] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][0] == 'O' & gf[1][0] == '-' & gf[2][0] == 'O') {
            gf[1][0] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][0] == '-' & gf[1][0] == 'O' & gf[2][0] == 'O') {
            gf[0][0] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        //colunm 1
        if (gf[0][1] == 'O' & gf[1][1] == 'O' & gf[2][1] == '-') {
            gf[2][1] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][1] == 'O' & gf[1][1] == '-' & gf[2][1] == 'O') {
            gf[1][1] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][1] == '-' & gf[1][1] == 'O' & gf[2][1] == 'O') {
            gf[0][1] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        //colunm 2
        if (gf[0][2] == 'O' & gf[1][2] == 'O' & gf[2][2] == '-') {
            gf[2][2] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][2] == 'O' & gf[1][2] == '-' & gf[2][2] == 'O') {
            gf[1][2] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][2] == '-' & gf[1][2] == 'O' & gf[2][2] == 'O') {
            gf[0][2] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        //diagonal 1
        if (gf[0][0] == 'O' & gf[1][1] == 'O' & gf[2][2] == '-') {
            gf[2][2] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][0] == 'O' & gf[1][1] == '-' & gf[2][2] == 'O') {
            gf[1][1] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][0] == '-' & gf[1][1] == 'O' & gf[2][2] == 'O') {
            gf[0][0] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        //diagonal 2
        if (gf[0][2] == 'O' & gf[1][1] == 'O' & gf[2][0] == '-') {
            gf[2][0] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][2] == 'O' & gf[1][1] == '-' & gf[2][0] == 'O') {
            gf[1][1] = 'O';
            aiturnend = true;
            aiwin = true;
        }
        if (gf[0][2] == '-' & gf[1][1] == 'O' & gf[2][0] == 'O') {
            gf[0][2] = 'O';
            aiturnend = true;
            aiwin = true;
        }
    }

    public void aidefence() {
        //line 0
        if (gf[0][0] == 'X' & gf[0][1] == 'X' & gf[0][2] == '-') {
            gf[0][2] = 'O';
            aiturnend = true;
        }
        if (gf[0][0] == 'X' & gf[0][1] == '-' & gf[0][2] == 'X') {
            gf[0][1] = 'O';
            aiturnend = true;
        }
        if (gf[0][0] == '-' & gf[0][1] == 'X' & gf[0][2] == 'X') {
            gf[0][0] = 'O';
            aiturnend = true;
        }
        //line 1
        if (gf[1][0] == 'X' & gf[1][1] == 'X' & gf[1][2] == '-') {
            gf[1][2] = 'O';
            aiturnend = true;
        }
        if (gf[1][0] == 'X' & gf[1][1] == '-' & gf[1][2] == 'X') {
            gf[1][1] = 'O';
            aiturnend = true;
        }
        if (gf[1][0] == '-' & gf[1][1] == 'X' & gf[1][2] == 'X') {
            gf[1][0] = 'O';
            aiturnend = true;
        }
        //line 2
        if (gf[2][0] == 'X' & gf[2][1] == 'X' & gf[2][2] == '-') {
            gf[2][2] = 'O';
            aiturnend = true;
        }
        if (gf[2][0] == 'X' & gf[2][1] == '-' & gf[2][2] == 'X') {
            gf[2][1] = 'O';
            aiturnend = true;
        }
        if (gf[2][0] == '-' & gf[2][1] == 'X' & gf[2][2] == 'X') {
            gf[2][0] = 'O';
            aiturnend = true;
        }
        //colunm 0
        if (gf[0][0] == 'X' & gf[1][0] == 'X' & gf[2][0] == '-') {
            gf[2][0] = 'O';
            aiturnend = true;
        }
        if (gf[0][0] == 'X' & gf[1][0] == '-' & gf[2][0] == 'X') {
            gf[1][0] = 'O';
            aiturnend = true;
        }
        if (gf[0][0] == '-' & gf[1][0] == 'X' & gf[2][0] == 'X') {
            gf[0][0] = 'O';
            aiturnend = true;
        }
        //colunm 1
        if (gf[0][1] == 'X' & gf[1][1] == 'X' & gf[2][1] == '-') {
            gf[2][1] = 'O';
            aiturnend = true;
        }
        if (gf[0][1] == 'X' & gf[1][1] == '-' & gf[2][1] == 'X') {
            gf[1][1] = 'O';
            aiturnend = true;
        }
        if (gf[0][1] == '-' & gf[1][1] == 'X' & gf[2][1] == 'X') {
            gf[0][1] = 'O';
            aiturnend = true;
        }
        //colunm 2
        if (gf[0][2] == 'X' & gf[1][2] == 'X' & gf[2][2] == '-') {
            gf[2][2] = 'O';
            aiturnend = true;
        }
        if (gf[0][2] == 'X' & gf[1][2] == '-' & gf[2][2] == 'X') {
            gf[1][2] = 'O';
            aiturnend = true;
        }
        if (gf[0][2] == '-' & gf[1][2] == 'X' & gf[2][2] == 'X') {
            gf[0][2] = 'O';
            aiturnend = true;
        }
        //diagonal 1
        if (gf[0][0] == 'X' & gf[1][1] == 'X' & gf[2][2] == '-') {
            gf[2][2] = 'O';
            aiturnend = true;
        }
        if (gf[0][0] == 'X' & gf[1][1] == '-' & gf[2][2] == 'X') {
            gf[1][1] = 'O';
            aiturnend = true;
        }
        if (gf[0][0] == '-' & gf[1][1] == 'X' & gf[2][2] == 'X') {
            gf[0][0] = 'O';
            aiturnend = true;
        }
        //diagonal 2
        if (gf[0][2] == 'X' & gf[1][1] == 'X' & gf[2][0] == '-') {
            gf[2][0] = 'O';
            aiturnend = true;
        }
        if (gf[0][2] == 'X' & gf[1][1] == '-' & gf[2][0] == 'X') {
            gf[1][1] = 'O';
            aiturnend = true;
        }
        if (gf[0][2] == '-' & gf[1][1] == 'X' & gf[2][0] == 'X') {
            gf[0][2] = 'O';
            aiturnend = true;
        }
    }

    public void aifindempty() {

        if (aiturnend == false & gf[0][0] == '-') {
            gf[0][0] = 'O';
            aiturnend = true;
        }
        if (aiturnend == false & gf[2][2] == '-') {
            gf[2][2] = 'O';
            aiturnend = true;
        }
        if (aiturnend == false & gf[2][0] == '-') {
            gf[2][0] = 'O';
            aiturnend = true;
        }
        if (aiturnend == false & gf[0][2] == '-') {
            gf[0][2] = 'O';
            aiturnend = true;
        }
        if (aiturnend == false & gf[0][1] == '-') {
            gf[0][1] = 'O';
            aiturnend = true;
        }
        if (aiturnend == false & gf[1][0] == '-') {
            gf[1][0] = 'O';
            aiturnend = true;
        }
        if (aiturnend == false & gf[1][2] == '-') {
            gf[1][2] = 'O';
            aiturnend = true;
        }
        if (aiturnend == false & gf[2][1] == '-') {
            gf[2][1] = 'O';
            aiturnend = true;
        }
    }
}
