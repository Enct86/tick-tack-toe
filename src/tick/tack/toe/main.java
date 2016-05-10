
package tick.tack.toe;

import java.util.Scanner;

/**
 *
 * @author Max Savchenko
 */
public class main {


    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int i;
        System.out.println("Добро пожаловать в игру Крестики Нолики");
        do {  
            System.out.printf("1 - Игра против AI, \n2 - Игра против друг друга\n3 \n4 - Выход\n");
            String input1 = scanner1.nextLine();
            i = Integer.parseInt(input1);
            switch(i) {
                case 1:
                    
            }
            
        } while (i != 4);
    }
    
}
