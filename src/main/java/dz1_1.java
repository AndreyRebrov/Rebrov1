package lesson1.homeans;


public class dz1_1 {



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