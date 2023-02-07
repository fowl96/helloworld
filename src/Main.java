public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte age = 20;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte temperature = 7;
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else if (temperature > 5){
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, решайте сами");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte speed = 70;
        if (speed <= 60){
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
    }

        // оператор или  " || "

    public static void task4 () {
        System.out.println("Задача 4");
        byte age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад ");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу ");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет ");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу ");
        } else if (age == 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему никуда не нужно ходить ");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte age = 13;
        boolean hasParents = true;
        if ( age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if ( age > 5 && age < 14 && hasParents) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        } else if (age >= 5 && age < 14 && !hasParents) {
            System.out.println("Ребенок не может кататься на аттракционе без родителей.");
        } else if ( age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

    }

    public static void task6 () {
        System.out.println("Задача 6");
        short placeInQueue = 102;
        if (placeInQueue <=60) {
            System.out.println("Если вы " + placeInQueue + " в очереди, то для вас остались сидячие места");
        } else if (placeInQueue > 60 && placeInQueue <= 102) {
            System.out.println("Если вы " + placeInQueue + " в очереди, то для вас остались стоячие места");
        } else {
            System.out.println("Если вы " + placeInQueue + " в очереди, то для вас не осталось мест");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 9;
        int two = 4;
        int three = 7;
        if (one > two && one > three) {
            System.out.println(one + " большее число");
        } else if (two > one && two > three) {
            System.out.println(two + " большее число");
        } else {
            System.out.println(three + " большее число");
        }

    }
}