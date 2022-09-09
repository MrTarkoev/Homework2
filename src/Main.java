public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        // Задача 3
        System.out.println("Задача 3");
        var dog1 = 12.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        // Задача 4
        System.out.println("Задача 4");
        var friend  = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача 6
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println(" Общий вес двух бойцов " + totalWeight + " кг. ");
        var differenceBetweenWeights = weightBoxer2 - weightBoxer1;
        System.out.println(" Разница весов двух бойцов " + differenceBetweenWeights + " кг. ");
        // Задача 7
        System.out.println("Задача 7");
        var differenceBetweenWeights2 = weightBoxer2 - weightBoxer1;
        System.out.println(" Разница весов двух бойцов ( 1 способ) " + differenceBetweenWeights2 + " кг. ");
        var differenceBetweenWeights3 = weightBoxer2 % weightBoxer1;
        System.out.println(" Разница весов двух бойцов ( 2 способ) " + differenceBetweenWeights3 + " кг. ");
        // Задача 8
        System.out.println("Задача 8");
        var totalHours = 640;
        var timePerEmployee = 8;
        var totalEmployees = totalHours / timePerEmployee;
        System.out.println(" Всего работников в компании – " + totalEmployees + " человек.");

        var increaseInEmployees = totalEmployees + 94;
        var hoursOfWorkPerEmployee = timePerEmployee *  increaseInEmployees;
        System.out.println(" Если в компании работает " + increaseInEmployees + " человек, то всего " + hoursOfWorkPerEmployee + " часов работы может быть поделено между сотрудниками.");
    }
}