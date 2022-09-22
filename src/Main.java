public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1"); //Вывод в косоль переменных с различыми типами и значениями
        int i = 2147483647;
        byte b = 127;
        short s = 32767;
        long l = 9_223_372_036_854_775_807L;
        float f = 100.1234567F;
        double d = 1000.123456789;
        System.out.println("Значение переменой i с типом int =" + i);
        System.out.println("Значение переменой b с типом byte =" + b);
        System.out.println("Значение переменой s с типом short =" + s);
        System.out.println("Значение переменой l с типом long =" + l);
        System.out.println("Значение переменой f с типом float =" + f);
        System.out.println("Значение переменой d с типом double =" + d);
        System.out.println(" ");
        System.out.println("Задача 2"); //Вывод в косоль переменных по заданию с присвоением им типа
        float fl1 = 27.12F;
        long l1 = 987_678_965_549L;
        byte b1 = 2;
        short s1 = 786;
        boolean bool1 = b1 > s1;
        int i1 = 569;
        int i2 = -159;
        short s2 = 27897;
        byte b2 = 67;
        System.out.println(fl1 + ", " + l1 + ", " + b1 + ", " + s1 + ", " + bool1 + ", " + i1 + ", " + i2 + ", " + s2 + ", " + b2);
        System.out.println(" ");
        System.out.println("Задача 3"); //Расчет количества листов бумаги на учеников
        int firstTeacherLP = 23;
        int secondTeacherAS = 27;
        int thirdTeacherEA = 30;
        int paper = 480;
        int paperForStudent = (paper / (firstTeacherLP + secondTeacherAS + thirdTeacherEA));
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
        System.out.println(" ");
        System.out.println("Задача 4"); //Расчет производительности работы машиы для изготовления бутылок
        short bottlePerformance = 16;
        short time = 2;
        int bottleForMinute = bottlePerformance / time;
        short timeMinutes = 20;
        short timeDay = 1440;
        int timeThreeDay = 4320;
        int timeOneMonth = 43800;
        int bottlesForMinutes = timeMinutes * bottleForMinute;
        int bottlesForDay = timeDay * bottleForMinute;
        int bottlesForThreeDay = timeThreeDay * bottleForMinute;
        long bottlesForOneMonth = timeOneMonth * bottleForMinute;
        System.out.println("За 20 минут работы машины произвела бутылок " + bottlesForMinutes + " штук");
        System.out.println("За сутки работы машины произвела бутылок " + bottlesForDay + " штук");
        System.out.println("За 3 дня работы машины произвела бутылок " + bottlesForThreeDay + " штук");
        System.out.println("За 1 месяц работы машины произвела бутылок " + bottlesForOneMonth + " штук");
        System.out.println(" ");
        System.out.println("Задача 5"); //Расчет количества краски для ремонта школы
        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte paintInOneClass = (byte) (whitePaint + brownPaint);
        byte numberClass = (byte) (allPaint / paintInOneClass);
        byte allWhite = (byte) (whitePaint * numberClass);
        byte allBrown = (byte) (brownPaint * numberClass);
        System.out.println("В школе где " + numberClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");
        System.out.println(" ");
            System.out.println("Задача 6"); //Расчет веса продуктов
        short bananas = 5 * 80;
        short milk = 200 / 100 * 105;
        short iceCream = 2 * 100;
        short rawEggs = 4 * 70;
        short breakfast = (short) (bananas + milk + iceCream + rawEggs);
        float breakfastKg = breakfast / 1000F;
        System.out.println(breakfast);
        System.out.println("Суммарный вес завтрака " +breakfastKg + " кг");
        System.out.println(" ");
            System.out.println("Задача 7"); //количество дней для похудения спортсмена
        int weight = 7 * 1000;
        float oneDay250 = 250F;
        float oneDay500 = 500F;
        float dayIfOneDay250 = weight / oneDay250;
        float dayIfOneDay500 = weight / oneDay500;
        float dayMean = (dayIfOneDay250 + dayIfOneDay500) / 2;
        System.out.println("Если спортсмен будет терять каждый день по " + oneDay250 +
                " калорий, тогда для похужения ему потребуется " + dayIfOneDay250 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по " + oneDay500 +
                " калорий, тогда для похужения ему потребуется " + dayIfOneDay500 + " дней");
        System.out.println("Среднее количество дней для похудения спортсмеа " + dayMean + " дней");
        System.out.println(" ");
            System.out.println("Задача 8"); //Автоматизация повышения зарплаты сотрудникам
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryMasha10 = salaryMasha / 100 * 110;
        int salaryDenis10 = salaryDenis / 100 * 110;
        int salaryKristina10 = salaryKristina / 100 * 110;
        int salaryMashaInYear = (salaryMasha10 * 12) - (salaryMasha * 12) ;
        int salaryDenisInYear = (salaryDenis10 * 12) - (salaryDenis * 12);
        int salaryKristinaInYear = (salaryKristina10 * 12) - (salaryKristina * 12);
        System.out.println("Маша теперь получает " + salaryMasha10 + " рублей, годовой доход вырос на "
        + salaryMashaInYear + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis10 + " рублей, годовой доход вырос на "
                + salaryDenisInYear + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina10 + " рублей, годовой доход вырос на "
                + salaryKristinaInYear + " рублей");
    }
}