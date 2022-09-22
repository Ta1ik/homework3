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
        System.out.println(+ fl1 + ", " +l1+", " +b1 + ", " +s1 + ", " +bool1 + ", " +i1 + ", " +i2 + ", " +s2 + ", " +b2);
        System.out.println(" ");
            System.out.println("Задача 3"); //Расчет количества листов бумаги на учеников
        int firstTeacherLP = 23;
        int secondTeacherAS = 27;
        int thirdTeacherEA = 30;
        int paper = 480;
        int paperForStudent = (paper / (firstTeacherLP + secondTeacherAS +thirdTeacherEA));
        System.out.println("На каждого ученика рассчитано " +paperForStudent + " листов бумаги");
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
            System.out.println("Задача 5"); //Расчет количества краски для ремота школы
        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte paintInOneClass = (byte) (whitePaint + brownPaint);
        byte numberClass = (byte) (allPaint / paintInOneClass);
        byte allWhite = (byte) (whitePaint * numberClass);
        byte allBrown = (byte) (brownPaint * numberClass);
        System.out.println("В школе где " + numberClass + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");



    }
}