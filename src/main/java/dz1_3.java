import java.util.Scanner;

public class dz1_3 {
    public static void main(String[] args) {
        //Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали
        // или отрицательное. Замечание: ноль считаем положительным числом.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        if (a <= -1) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число Положительное");
        }
    }
}
