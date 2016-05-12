package tick.tack.toe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Max Savchenko
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int i;
        int pvaiturn = 0;
        int pvpturn = 0;
        boolean win = false;
        int playerposition = 0;
        System.out.println("Добро пожаловать в игру Крестики Нолики");
        do {
            System.out.printf("1 - Игра против AI, \n2 - Игра против друг друга\n3 \n4 - Выход\n");
            String input1 = scanner1.nextLine();
            i = Integer.parseInt(input1);
            switch (i) {
                case 1:
                    win = false;
                    Game g1 = new Game();
                    g1.clear();
                    g1.draw();
                    do {
                        boolean endturnplayer = false;
                        do {
                            System.out.println("Куда сделать ход (строка - ");
                            String input2 = scanner1.nextLine();
                            int stroka = Integer.parseInt(input2);
                            System.out.println("Куда сделать ход (столбец - ");
                            String input3 = scanner1.nextLine();
                            int stolbec = Integer.parseInt(input3);
                            if (g1.gf[stroka][stolbec] == '-') {
                                g1.gf[stroka][stolbec] = 'X';
                                endturnplayer = true;
                                pvaiturn++;
                            } else {
                                System.out.println("Ячейка занята");
                            }
                        } while (endturnplayer == false);
                        switch (pvaiturn) {
                            case 1:
                                if (g1.gf[1][1] == 'X') {
                                    g1.gf[0][0] = 'O';
                                    playerposition = 10;
                                } else {
                                    g1.gf[1][1] = 'O';
                                    playerposition = 20;
                                }
                                g1.draw();
                                break;
                            case 2:
                                switch (playerposition) {
                                    case 10:
                                        if (g1.gf[2][2] == 'X') {
                                            g1.gf[2][0] = 'O';
                                        }
                                        if (g1.gf[0][1] == 'X') {
                                            g1.gf[2][1] = 'O';
                                        }
                                        if (g1.gf[0][2] == 'X') {
                                            g1.gf[2][0] = 'O';
                                        }
                                        if (g1.gf[1][2] == 'X') {
                                            g1.gf[1][0] = 'O';
                                        }
                                        if (g1.gf[2][1] == 'X') {
                                            g1.gf[0][1] = 'O';
                                        }
                                        if (g1.gf[2][0] == 'X') {
                                            g1.gf[0][2] = 'O';
                                        }
                                        if (g1.gf[1][0] == 'X') {
                                            g1.gf[1][2] = 'O';
                                        }
                                        g1.draw();
                                        break;
                                    case 20:
                                        if (g1.gf[0][0] == 'X' & g1.gf[0][1] == 'X') {
                                            g1.gf[0][2] = 'O';
                                            playerposition = 21;
                                        }
                                        if (g1.gf[0][2] == 'X' & g1.gf[0][1] == 'X') {
                                            g1.gf[0][0] = 'O';
                                            playerposition = 22;
                                        }
                                        if (g1.gf[0][2] == 'X' & g1.gf[1][2] == 'X') {
                                            g1.gf[2][2] = 'O';
                                            playerposition = 23;
                                        }
                                        if (g1.gf[1][2] == 'X' & g1.gf[2][2] == 'X') {
                                            g1.gf[0][2] = 'O';
                                            playerposition = 24;
                                        }
                                        if (g1.gf[2][2] == 'X' & g1.gf[2][1] == 'X') {
                                            g1.gf[2][0] = 'O';
                                            playerposition = 25;
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[2][1] == 'X') {
                                            g1.gf[2][2] = 'O';
                                            playerposition = 26;
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[1][0] == 'X') {
                                            g1.gf[0][0] = 'O';
                                            playerposition = 27;
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[1][0] == 'X') {
                                            g1.gf[2][0] = 'O';
                                            playerposition = 28;
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[0][2] == 'X') {
                                            g1.gf[0][1] = 'O';
                                            playerposition = 29;
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[2][0] == 'X') {
                                            g1.gf[1][0] = 'O';
                                            playerposition = 32;
                                        }
                                        if (g1.gf[0][2] == 'X' & g1.gf[2][2] == 'X') {
                                            g1.gf[1][2] = 'O';
                                            playerposition = 30;
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[2][2] == 'X') {
                                            g1.gf[2][1] = 'O';
                                            playerposition = 31;
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[0][2] == 'X') {
                                            g1.gf[0][1] = 'O';
                                            playerposition = 33;
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[2][2] == 'X') {
                                            g1.gf[0][1] = 'O';
                                            playerposition = 34;
                                        }
                                        g1.draw();
                                        break;
                                }
//                            case 3:

                        }
                    } while (win == false);
                    System.out.println("Drow !HUMAN CANT WIN ME!");
                    break;
                case 2:
                    win = false;
                    pvpturn = 0;
                    Game g2 = new Game();
                    g2.clear();
                    g2.draw();
                    do {
                        pvpturn++;
                        boolean endturnX = false;
                        do {
                            System.out.println("Ход X");
                            System.out.println("Куда сделать ход X (строка - ");
                            String input2 = scanner1.nextLine();
                            int strokaX = Integer.parseInt(input2);
                            System.out.println("Куда сделать ход X (столбец - ");
                            String input3 = scanner1.nextLine();
                            int stolbecX = Integer.parseInt(input3);
                            if (g2.gf[strokaX][stolbecX] == '-') {
                                g2.gf[strokaX][stolbecX] = 'X';
                                g2.draw();
                                endturnX = true;
                            } else {
                                System.out.println("Ячейка занята");
                            }
                        } while (endturnX == false);
                        g2.wincondX();
                        win = g2.winconditionX;
                        if (win) {
                            System.out.println("X win!");
                        }
                        boolean endturnO = false;
                        if (pvpturn <= 4 & win == false) {

                            do {
                                System.out.println("Ход O");
                                System.out.println("Куда сделать ход O (строка - ");
                                String input4 = scanner1.nextLine();
                                int strokaO = Integer.parseInt(input4);
                                System.out.println("Куда сделать ход O (столбец - ");
                                String input5 = scanner1.nextLine();
                                int stolbecO = Integer.parseInt(input5);
                                if (g2.gf[strokaO][stolbecO] == '-') {
                                    g2.gf[strokaO][stolbecO] = 'O';
                                    g2.draw();
                                    endturnO = true;
                                } else {
                                    System.out.println("Ячейка занята");
                                }

                            } while (endturnO == false);

                            g2.wincondO();
                            if (g2.winconditionO) {
                                System.out.println("O win!");
                                win = g2.winconditionO;
                            }
                        }
                        if (pvpturn == 5 & win == false) {
                            win = true;
                            System.out.println("DRAW");
                        }
                    } while (win == false);
                    break;
            }

        } while (i != 4);

    }

}
