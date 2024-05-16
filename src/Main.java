

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание3");
        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        System.out.println("Задание4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание5");
        var frog = 3.5;
        frog = frog * 10;
        frog = frog / 3.5;
        frog = frog + 4;
        System.out.println("frog = " + frog);

        System.out.println("Задание6");
        var firstBoxer = 78.2;
        System.out.println(firstBoxer);
        var secondBoxer = 82.7;
        System.out.println(secondBoxer);

        var sumWeight = firstBoxer + secondBoxer;
        System.out.println("Общая масса бойцов =" + sumWeight);

        var massDifference = secondBoxer - firstBoxer;
        System.out.println("Разница массы бойцов ="+ massDifference);

        System.out.println("Задание7");
        var rimmed = secondBoxer % firstBoxer;
        System.out.println("Остаток от деления между двумя весами =" + rimmed);

        System.out.println("Задание8");
        var allTimeAmount = 640;
        var oneWorkerTime = 8;

        var allWorkers = allTimeAmount / oneWorkerTime;
        System.out.println("«Всего работников в компании — " + allWorkers + " человек»");

        var newWorker = allWorkers + 94;
        var newTime = allTimeAmount / newWorker;
        System.out.println("«Если в компании работает "+ newWorker +" человек, то всего "+ newTime +" " +
                "часа работы может быть поделено между сотрудниками»");
















    }
}