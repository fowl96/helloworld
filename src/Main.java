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
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);// Пишем код для задачи 1
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog+4);
        System.out.println(cat+4);
        System.out.println(paper+4);// Пишем код для задачи 2
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog-3.5);
        System.out.println(cat-1.6);
        System.out.println(paper-7639);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var weihgtFirst = 78.2;
        var weihgtSecond = 82.7;
        System.out.println("Общий вес двух бойцов " + (weihgtFirst + weihgtSecond) + "кг.");
        System.out.println("Разница между весами бойцов " + (weihgtSecond - weihgtFirst) + "кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var weihgtFirst = 78.2;
        var weihgtSecond = 82.7;
        System.out.println("Разница между весами бойцов " + (weihgtSecond - weihgtFirst) + "кг.");
        System.out.println("Разница между весами бойцов " + (weihgtSecond % weihgtFirst) + "кг.");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var workHours = 640;
        var worker = workHours / 8;
        System.out.println("Всего работников в компании — " + worker + " человек ");
        worker = worker + 94;
        workHours = worker * 8;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");
    }
}