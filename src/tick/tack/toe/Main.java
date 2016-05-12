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
        int k = 0;
        int pvpturn = 0;
        boolean win = false;
        System.out.println("Добро пожаловать в игру Крестики Нолики");
        do {
            System.out.printf("1 - Игра против AI, \n2 - Игра против друг друга\n3 \n4 - Выход\n");
            String input1 = scanner1.nextLine();
            i = Integer.parseInt(input1);
            switch (i) {
                case 1:
                    win = false;
                    k++;
                    Game g1 = new Game();
                    g1.clear();
                    g1.draw();
                    do {
                        System.out.println("Куда сделать ход (строка - ");
                        String input2 = scanner1.nextLine();
                        int stroka = Integer.parseInt(input2);
                        System.out.println("Куда сделать ход (столбец - ");
                        String input3 = scanner1.nextLine();
                        int stolbec = Integer.parseInt(input3);
                        if (g1.gf[stroka][stolbec] == '-') {
                            g1.gf[stroka][stolbec] = 'X';
                            g1.draw();
                        } else {
                            System.out.println("Ячейка занята");
                        }
                        g1.wincondX();
                        win = g1.winconditionX;
                    } while (win == false);
                    System.out.println("X WIN!");
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
