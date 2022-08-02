public class Main {
    public static void main(String[] args) {
       // Задача 1
        byte a = 10;
        short b = 100;
        int c = 1000;
        long d = 100000L;
        float e = 1.256f;
        double f = 2.4785965;
        boolean g = a < 5;
        char i = 64;

        // Задача 2
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;

        float totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров = " + totalWeight + " кг");

        float weightDifference = Math.abs((boxer1Weight - boxer2Weight) % totalWeight);
        System.out.println("Разница между весами = " + weightDifference + " кг");

        //Задача 3
        int bananasWeight = 80;
        bananasWeight *= 5;
        int milkWeight = 105;
        milkWeight *= 2;
        int iceCreamWeight = 100;
        iceCreamWeight *= 2;
        int eggsWeight = 70;
        eggsWeight *= 4;

        float shakeTotalWeightKg = (bananasWeight + milkWeight + iceCreamWeight + eggsWeight) / 1000f;
        System.out.println("Общий вес спорт-завтрака = " + shakeTotalWeightKg + " кг");

        //Задача 4
        int needToLose = 7;
        needToLose *= 1000;
        int way1ToLose = 250;
        int way2ToLose = 500;

        int way1Days = needToLose / way1ToLose;
        System.out.println("Кол-во дней при 1м способе похудения = " + way1Days + " дней");

        int way2Days = needToLose / way2ToLose;
        System.out.println("Кол-во дней при 2м способе похудения = " + way2Days + " дней");

        float middleValue = needToLose / (float)((way1ToLose + way2ToLose) / 2);
        System.out.println("Среднее количество дней для похудения = " + middleValue + " дней");

        //Задача 5
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;
        int salaryIncreasingPercent = 10;

        float salaryIncreaseMasha = salaryMasha * (100 + salaryIncreasingPercent)/100f;
        float salaryIncreaseDenis = salaryDenis * (100 + salaryIncreasingPercent)/100f;
        float salaryIncreaseKristina = salaryKristina * (100 + salaryIncreasingPercent)/100f;

        float annualSalaryDifferenceMasha = (salaryIncreaseMasha - salaryMasha) * 12;
        float annualSalaryDifferenceDenis = (salaryIncreaseDenis - salaryDenis) * 12;
        float annualSalaryDifferenceKristina = (salaryIncreaseKristina - salaryKristina) * 12;

        System.out.println("Увеличенная зарплата Маши составляет " + salaryIncreaseMasha + " руб. " + "Годовой доход вырос на " + annualSalaryDifferenceMasha + " руб.");
        System.out.println("Увеличенная зарплата Дениса составляет " + salaryIncreaseDenis + " руб. " + "Годовой доход вырос на " + annualSalaryDifferenceDenis + " руб.");
        System.out.println("Увеличенная зарплата Кристины составляет " + salaryIncreaseKristina + " руб. " + "Годовой доход вырос на " + annualSalaryDifferenceKristina + " руб.");

    }
}