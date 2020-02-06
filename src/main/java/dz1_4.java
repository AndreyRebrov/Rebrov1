import java.util.Scanner;

public class dz1_4 {
    public static void main(String[] args) {
      //  Написать метод, которому в качестве параметра передается целое число.
       //  Метод должен вернуть true, если число отрицательное.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        if (a < 0)
            System.out.println(true);
        else;
        System.out.println(false);


    }
}
