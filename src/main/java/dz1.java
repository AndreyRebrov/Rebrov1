public class dz1 {
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