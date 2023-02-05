public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int a = 2147483646;
        byte b = 126;
        short c = 32766;
        long d = 446554515;
        float e = 3.14F;
        double f = 72342.534234;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte b = 67;
        short c = -159;
        short g = 569;
        short p = 27897;
        long d = 987678965549L;
        float e = 27.12F;
        float k = 2.786f;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovnaChildren = 23;
        byte annaSergeenaChildren = 27;
        byte ekaterinaAndreevnaChildren = 30;
        System.out.println("На каждого ученика рассчитано " + 480/(ludmilaPavlovnaChildren+annaSergeenaChildren+ekaterinaAndreevnaChildren) + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte proizvoditelnostMashini = 16/2;
        System.out.println("За 20 минут машина произвела " + (20*proizvoditelnostMashini) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (24*60*proizvoditelnostMashini) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (24*60*3*proizvoditelnostMashini) + " штук бутылок");
        System.out.println("За месяц машина произвела " + (24*60*30*proizvoditelnostMashini) + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte whitePaint = 2;
        byte brownePaint = 4;
        float allClasses;
        allClasses = 120 / (whitePaint+brownePaint);
        System.out.println("В школе, где " + Math.round(allClasses) + " классов, нужно " + Math.round(allClasses*whitePaint) + " банок белой краски и " + Math.round(allClasses*brownePaint) + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        byte milk = 2;
        byte icecream = 2;
        byte eggs = 4;
        short breakfastWeight = (short) ((banana*80)+(milk*105)+(icecream*100)+(eggs*70));
        float breakfastWeightKilogram = breakfastWeight / 1000f;
        System.out.println("Вес завтрака в граммах " + breakfastWeight);
        System.out.println("Вес завтрака в килограммах " + breakfastWeightKilogram);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short minWeight = 250;
        short maxWeight = 500;
        float maxDays = 7000/minWeight;
        float minDays = 7000/maxWeight;
        float averageDays = (minDays+maxDays)/2;
        System.out.println("Минимальное количество дней на похудение: " + Math.round(minDays));
        System.out.println("Максимальное количество дней на похудение: " + Math.round(maxDays));
        System.out.println("Среднее количество дней на похудение: " + Math.round(averageDays));
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        System.out.println("Маша теперь получает " + Math.round(masha*1.1) + " рублей. Годовой доход вырос на " + Math.round(masha*1.2) + " рублей");
        System.out.println("Денис теперь получает " + Math.round(denis*1.1) + " рублей. Годовой доход вырос на " + Math.round(denis*1.2) + " рублей");
        System.out.println("Кристина теперь получает " + Math.round(kristina*1.1) + " рублей. Годовой доход вырос на " + Math.round(kristina*1.2) + " рублей");
    }


}