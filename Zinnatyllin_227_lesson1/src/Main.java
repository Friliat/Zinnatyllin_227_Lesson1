public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        double rubles = 30002.7;
        double rateUSD = 78.5;
        double dollars = rubles / rateUSD;
        System.out.println("У вас на счету " + rubles + " рублей. В долларах это " + dollars + " долларов. Так держать!");
        System.out.println("Задание 2");
        task2();
        System.out.println("Задание 3");
        task3();

    }

    static void task2() {
        String weather = "Дождь";
        if (weather == "Солнце") {
            System.out.println("Беру с собой зонт");
        } else {
            System.out.println("Иду налегке");
        }
        System.out.println("Люблю гулять!");
    }

    static void task3() {
        int eggs = 1;
        if (eggs > 3) {
            System.out.println("Рекомендую приготовить омлет.");
        } else {
            System.out.println("Рекомендую позавтракать бутербродами.");
        }
        System.out.println("Приятного аппетита!");
    }
}
