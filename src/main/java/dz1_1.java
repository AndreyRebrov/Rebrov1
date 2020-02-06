package lesson1;

public class MyHomeWork {
    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {


    }
    //2. Создать переменные всех пройденных типов данных и инициализировать их значения.

    byte by = -120;
    short sh = 12442;
    int in = 1000;
    long lo = 200000L;
    float fl = 12.23f;
    double doub = -123.123;
    char ch = '*';
    boolean bool = false;

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    //4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean task10and20(int x1, int x2) {
        int summ = x1 + x2;
        return (summ >= 10) && (summ <= 20);

    }
    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


    //6. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное.

    public static boolean isNegative(int x) {
        return x < 0;
    }


    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

}