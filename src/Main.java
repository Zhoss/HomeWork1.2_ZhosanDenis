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

    public static void task1() {
        byte a = 10;
        short b = 100;
        int c = 1000;
        long d = 100000L;
        float e = 1.256f;
        double f = 2.4785965;
        boolean g = a < 5;
        char i = 64;
    }

    public static void task2() {
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;

        float totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров = " + totalWeight + " кг");

        float weightDifference = Math.abs(boxer1Weight - boxer2Weight);
        System.out.println("Разница между весами = " + weightDifference + " кг");
    }

    public static void task3() {
        int bananasWeight = 80;
        int bananasQuantity = 5;

        int milkWeight = 105;
        int milkQuantity = 200 / 100;

        int iceCreamWeight = 100;
        int iceCreamQuantity = 2;

        int eggsWeight = 70;
        int eggsQuantity = 4;

        int shakeTotalWeight = (bananasWeight * bananasQuantity + milkWeight * milkQuantity + iceCreamWeight * iceCreamQuantity + eggsWeight * eggsQuantity);
        float shakeTotalWeightKg = shakeTotalWeight / 1000f;
        System.out.println("Общий вес спорт-завтрака = " + shakeTotalWeightKg + " кг");
    }

    public static void task4() {
        int needToLoseKg = 7;
        int needToLoseGr = needToLoseKg * 1000;

        int way1ToLoseGr = 250;
        int way2ToLoseGr = 500;

        int way1Days = needToLoseGr / way1ToLoseGr;
        System.out.println("Кол-во дней при 1м способе похудения = " + way1Days + " дней");

        int way2Days = needToLoseGr / way2ToLoseGr;
        System.out.println("Кол-во дней при 2м способе похудения = " + way2Days + " дней");

        float middleValue = (float) ((way1Days + way2Days) / 2);
        System.out.println("Среднее количество дней для похудения = " + middleValue + " дней");
    }

    public static void task5() {
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        int increasingPercent = 10;
        float increaseMultiplier = 1 + (increasingPercent / 100f);

        float mashaSalaryIncrease = mashaSalary * increaseMultiplier;
        float denisSalaryIncrease = denisSalary * increaseMultiplier;
        float kristinaSalaryIncrease = kristinaSalary * increaseMultiplier;

        float annualSalaryDifferenceMasha = (mashaSalaryIncrease - mashaSalary) * 12;
        float annualSalaryDifferenceDenis = (denisSalaryIncrease - denisSalary) * 12;
        float annualSalaryDifferenceKristina = (kristinaSalaryIncrease - kristinaSalary) * 12;

        System.out.println("Увеличенная зарплата Маши составляет " + mashaSalaryIncrease + " руб. " + "Годовой доход вырос на " + annualSalaryDifferenceMasha + " руб.");
        System.out.println("Увеличенная зарплата Дениса составляет " + denisSalaryIncrease + " руб. " + "Годовой доход вырос на " + annualSalaryDifferenceDenis + " руб.");
        System.out.println("Увеличенная зарплата Кристины составляет " + kristinaSalaryIncrease + " руб. " + "Годовой доход вырос на " + annualSalaryDifferenceKristina + " руб.");
    }

    public static void task6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println("Результат равен " + result + ". Противоположное значение равно " + (-result));
    }

    public static void task7() {
        int a = 5;
        int b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        //Также сработает
        //a = a * b;
        //b = a / b;
        //a = a / b;

        //a = a - b;
        //b = a + b;
        //a = -a + b;
        System.out.println("a равно " + a + " b равно " + b);
    }

    private static void task8() {
        int a = 379;
        int b = (a % 100) / 10;
        System.out.println("Если a равно " + a + ", то b равно " + b);
    }
}