import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class dz1_2 {
    public static void main(String[] args) {
        //Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true, в противном случае – false.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else
            System.out.println("false");
        }
    }


















