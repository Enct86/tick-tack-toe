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
                    pvaiturn = 0;
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
                                    playerposition = 1;
                                } else {
                                    g1.gf[1][1] = 'O';
                                    playerposition = 2;
                                }
                                g1.draw();
                                break;
                            case 2:
                                switch (playerposition) {
                                    case 1:
                                        if (g1.gf[2][2] == 'X') {
                                            g1.gf[2][0] = 'O';
                                            playerposition = 11;
                                        }
                                        if (g1.gf[0][1] == 'X') {
                                            g1.gf[2][1] = 'O';
                                            playerposition = 12;
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
                                    case 2:
                                        if (g1.gf[0][0] == 'X' & g1.gf[0][1] == 'X') {
                                            g1.gf[0][2] = 'O';
                                        }
                                        if (g1.gf[0][2] == 'X' & g1.gf[0][1] == 'X') {
                                            g1.gf[0][0] = 'O';
                                        }
                                        if (g1.gf[0][2] == 'X' & g1.gf[1][2] == 'X') {
                                            g1.gf[2][2] = 'O';
                                        }
                                        if (g1.gf[1][2] == 'X' & g1.gf[2][2] == 'X') {
                                            g1.gf[0][2] = 'O';
                                        }
                                        if (g1.gf[2][2] == 'X' & g1.gf[2][1] == 'X') {
                                            g1.gf[2][0] = 'O';
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[2][1] == 'X') {
                                            g1.gf[2][2] = 'O';
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[1][0] == 'X') {
                                            g1.gf[0][0] = 'O';
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[1][0] == 'X') {
                                            g1.gf[2][0] = 'O';
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[0][2] == 'X') {
                                            g1.gf[0][1] = 'O';
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[2][0] == 'X') {
                                            g1.gf[1][0] = 'O';
                                        }
                                        if (g1.gf[0][2] == 'X' & g1.gf[2][2] == 'X') {
                                            g1.gf[1][2] = 'O';
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[2][2] == 'X') {
                                            g1.gf[2][1] = 'O';
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[0][2] == 'X') {
                                            g1.gf[0][1] = 'O';
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[2][2] == 'X') {
                                            g1.gf[0][1] = 'O';
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[1][2] == 'X') {
                                            g1.gf[0][2] = 'O';
                                        }
                                        if (g1.gf[0][0] == 'X' & g1.gf[2][1] == 'X') {
                                            g1.gf[2][0] = 'O';
                                        }
                                        if (g1.gf[2][2] == 'X' & g1.gf[0][1] == 'X') {
                                            g1.gf[0][2] = 'O';
                                        }
                                        if (g1.gf[2][2] == 'X' & g1.gf[1][0] == 'X') {
                                            g1.gf[0][2] = 'O';
                                        }
                                        if (g1.gf[0][2] == 'X' & g1.gf[2][1] == 'X') {
                                            g1.gf[0][2] = 'O';
                                        }
                                        if (g1.gf[0][2] == 'X' & g1.gf[1][0] == 'X') {
                                            g1.gf[2][0] = 'O';
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[0][1] == 'X') {
                                            g1.gf[0][0] = 'O';
                                        }
                                        if (g1.gf[2][0] == 'X' & g1.gf[1][2] == 'X') {
                                            g1.gf[0][2] = 'O';
                                        }
                                        g1.draw();
                                        break;
                                }
                                break;
                            case 3:
                                do {
                                    g1.aiturnend = false;
                                    if (g1.aiturnend == false) {
                                        g1.aiattack();
                                    }
                                    if (g1.aiturnend == false) {
                                        g1.aidefence();
                                    }
                                    if (g1.aiturnend == false) {
                                        g1.aifindempty();
                                    }
                                } while (g1.aiturnend == false);
                                g1.draw();
                                if (g1.aiwin) {
                                    win = true;
                                    System.out.println("AI WIN! BUGAGA)))");
                                }
                                break;
                            case 4:
                                do {
                                    g1.aiturnend = false;
                                    if (g1.aiturnend == false) {
                                        g1.aiattack();
                                    }
                                    if (g1.aiturnend == false) {
                                        g1.aidefence();
                                    }
                                    if (g1.aiturnend == false) {
                                        g1.aifindempty();
                                    }
                                } while (g1.aiturnend == false);
                                g1.draw();
                                if (g1.aiwin) {
                                    win = true;
                                    System.out.println("AI WIN! BUGAGA)))");
                                }
                                break;
                            case 5:
                                g1.draw();
                                System.out.println("DRAW!) HUMAN CANT BEAT ME!)))");
                                win = true;
                                break;

                        }
                    } while (win == false);
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
