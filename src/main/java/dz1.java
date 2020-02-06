package lesson1.homeans;

public class dz01_1 {

    //Создаем пустой проект в IntelliJ IDEA и прописываем метод main
    public static void main(String[] args) {


        //Создаём переменные всех пройденных типов данных, и инициализируем их значения
        byte b = 98; // -128 до 127
        short sh = 18345; //-32768 до 32767
        int i = 1856326482; // -2147483648 до 2147483647
        long l = 554664615641561l; //от -9223372036854775808 до 9223372036854775807
        float f = 125856.5455f; //плавающая точка
        double d = 54521.487654; //плавающая точка с большим диапазоном и размером памяти
        char c = 'd'; // символ, кроме ключевых символов
        boolean bool = c < 'N';// большие буквы всегда меньше
        System.out.println("Значение тиипа byte = " + b);
        System.out.println("Значение тиипа short = " + sh);
        System.out.println("Значение тиипа int = " + i);
        System.out.println("Значение тиипа long = " + l);
        System.out.println("Значение тиипа float = " + f);
        System.out.println("Значение тиипа double = " + d);
        System.out.println("Значение тиипа char = " + c);
        System.out.println("Значение тиипа bookean = " + bool);
    }
}


public class dz1_1 {
    public static void main(String[] args) {
        //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.
        int a = 4, b = 12, c = 76, d = 7;
        int e = a * (b + (c / d));
        System.out.println((float) e);


    }
}


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


import java.util.Scanner;

public class dz_5 {


    //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Привет," + a);
    }
}
