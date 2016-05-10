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
                        if (g1.gf[0][0] == 'X' & g1.gf[0][1] == 'X' & g1.gf[0][2] == 'X') {
                            win = true;
                        }
                        if (g1.gf[0][0] == 'X' & g1.gf[1][0] == 'X' & g1.gf[2][0] == 'X') {
                            win = true;
                        }
                        if (g1.gf[1][0] == 'X' & g1.gf[1][1] == 'X' & g1.gf[1][2] == 'X') {
                            win = true;
                        }
                        if (g1.gf[2][0] == 'X' & g1.gf[2][1] == 'X' & g1.gf[2][2] == 'X') {
                            win = true;
                        }
                        if (g1.gf[0][1] == 'X' & g1.gf[1][1] == 'X' & g1.gf[2][1] == 'X') {
                            win = true;
                        }
                        if (g1.gf[0][2] == 'X' & g1.gf[1][2] == 'X' & g1.gf[2][2] == 'X') {
                            win = true;
                        }
                        if (g1.gf[0][0] == 'X' & g1.gf[1][1] == 'X' & g1.gf[2][2] == 'X') {
                            win = true;
                        }
                        if (g1.gf[0][2] == 'X' & g1.gf[1][1] == 'X' & g1.gf[2][0] == 'X') {
                            win = true;
                        }
                    } while (win == false);
                    System.out.println("X WIN!");
            }
        } while (i != 4);

    }

}
