public class Main {
    public static void main(String[] args) {
        //Переменные. ч.1
        System.out.println("Переменные. ч.1");
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

        //Переменные. ч.2
        System.out.println("Переменные.ч.2");
        //Переменные. ч.2 Задача 1.
        System.out.println("Переменные. ч.2 Задача 1.");
        int a = 1;
        System.out.println( "Значение переменной a с типом int равно " + a);
        byte b = 2;
        System.out.println( "Значение переменной b с типом int равно " + b);
        short c = 3;
        System.out.println( "Значение переменной c с типом int равно " + c);
        long d = 444_444_444_444L;
        System.out.println( "Значение переменной d с типом int равно " + d);
        float f = 0.77f;
        System.out.println( "Значение переменной f с типом int равно " + f);
        double g = 6.6666666666;
        System.out.println( "Значение переменной g с типом int равно " + g);


        // Переменные. ч.2 Задача 2.
        System.out.println("Переменные.ч.2 Задача 2.");
        float a1 = 27.12f;
        long b1 = 987_678_965_549L;
        boolean c1 =  false;
        char d1 = 569 ;
        short e1 = -159;
        int f1 = 7897;
        byte g1 = 67;
        double h1 = 2.786;

        // Переменные. ч.2 Задача 3.
        System.out.println("Переменные.ч.2 Задача 3.");
        int pupilsInFirstClass  = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int sheetsOfPaper = 480;
        int sheetsForEachPupil = sheetsOfPaper / (pupilsInFirstClass + pupilsInSecondClass +pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + sheetsForEachPupil + " листов бумаги ");

        // Переменные. ч.2 Задача 4.
        System.out.println("Переменные.ч.2 Задача 4.");
        byte bottlesMade = 16;
        byte bottleMakingTime = 2;
        byte bottleMakingTime1 = 20;
        short bottleMakingTimeDay = 24 * 60;
        short bottleMakingTime3Day = 72 * 60;
        int bottleMakingTimeMonth = (31 * 24) * 60;
        int timeToMakeOneBottle = bottlesMade / bottleMakingTime;
        System.out.println(" На изготовление одной бутылки затрачивается " + timeToMakeOneBottle + " минут");
        int inTwentyMinutes = bottleMakingTime1 * timeToMakeOneBottle;
        System.out.println(" За " + bottleMakingTime1 + " минут машина произвела бутылок " + inTwentyMinutes + " штук. ");
        int perDay = bottleMakingTimeDay * timeToMakeOneBottle;
        System.out.println(" За сутки машина произвела бутылок " + perDay + " штук. ");
        int time3Day = timeToMakeOneBottle * bottleMakingTime3Day;
        System.out.println(" За 3 дня машина произвела бутылок " + time3Day + " штук. ");
        int TimeMonth = timeToMakeOneBottle * bottleMakingTimeMonth;
        System.out.println(" За месяц машина произвела бутылок " + TimeMonth + " штук. ");

        // Переменные. ч.2 Задача 5.
        System.out.println(" Переменные.ч.2 Задача 5.");
        byte totalPaintPot = 120;
        byte whitePaintPot = 2;
        byte brownPaintPot = 4;
        int totalClasses = totalPaintPot / (whitePaintPot + brownPaintPot);
        int wasBoughtWhitePaintPot = totalClasses * whitePaintPot;
        int wasBoughtBrownPaintPot = totalClasses * brownPaintPot;
        System.out.println(" В школе, где " +  totalClasses + " классов, нужно " + wasBoughtWhitePaintPot + " банок белой краски и " + wasBoughtBrownPaintPot + " банок коричневой краски");

        // Переменные. ч.2 Задача 6.
        System.out.println(" Переменные. ч.2 Задача 6 ");
        byte banana = 5;
        byte weightOneBanana = 80;
        short milk = 200;
        short weightMilk100mm = 105;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        byte egg = 4;
        byte  weighOneEgg = 70;
        int totalWeightBreakfast = ( (banana * weightOneBanana) + (milk * weightMilk100mm) + (iceCream * weightOneIceCream + (egg * weighOneEgg)));
        int grPerKg = 1000;
        int totalWeightBreakfastKG = totalWeightBreakfast / grPerKg;
        System.out.println(" Вес спорт-завтрака составляет " + totalWeightBreakfastKG + " кг");

        // Переменные. ч.2 Задача 7.
        System.out.println(" Переменные. ч.2 Задача 7. ");
        short needToLoseKg = 7;
        short lossesPerDay = 250;
        short lossesPerDay2 = 500;
        int PerKg = 1000;
        int needToLoseGR = needToLoseKg * PerKg;
        int daysToLoseWeight250 = needToLoseGR / lossesPerDay;
        int daysToLoseWeight500 = needToLoseGR / lossesPerDay2;
        int  differenceDays = daysToLoseWeight500 % daysToLoseWeight250;
        System.out.println(" На похудение, если спортсмен будет терять каждый день по 250 грамм уйдет " + daysToLoseWeight250 + " дней ");
        System.out.println(" На похудение, если спортсмен будет терять каждый день по 500 грамм уйдет " + daysToLoseWeight500 + " дней ");
        System.out.println(differenceDays + " дней может потребоваться дней в среднем, чтобы добиться результата похудения");

        // Переменные. ч.2 Задача 8.
        System.out.println(" Переменные. ч.2 Задача 8. ");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int percentageOfSalaryMasha = salaryMasha * 10 / 100;
        int percentageOfSalaryDenis = salaryDenis * 10 / 100;
        int percentageOfSalaryKristina = salaryKristina * 10 / 100;
        int increasedSalaryMasha = salaryMasha + percentageOfSalaryMasha;
        int increasedSalaryDenis = salaryDenis + percentageOfSalaryDenis;
        int increasedSalaryKristina = salaryKristina + percentageOfSalaryKristina;
        int annualDifferenceMasha = (increasedSalaryMasha * 12) - (salaryMasha * 12);
        int annualDifferenceDenis = (increasedSalaryDenis * 12) - (salaryDenis * 12);
        int annualDifferenceKristina = (increasedSalaryKristina * 12) - (salaryKristina *12);
        System.out.println(" Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + annualDifferenceMasha + " рублей");
        System.out.println(" Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + annualDifferenceDenis + " рублей");
        System.out.println(" Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + annualDifferenceKristina + " рублей");
     }
}