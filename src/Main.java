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
        int total = 0;
        System.out.println("Первоначально вы имеете " + total + " рублей");
        int salary = 15_000;
        int allowancePercentage = 1;
        System.out.println("Вкладывая каждый месяц " + salary + " рублей под " + allowancePercentage
        + "% ежемесячно:");
        int i = 0;
        while (total <= 2_459_000) {
            total += salary;
            total = total + total * allowancePercentage / 100;
            i++;
            System.out.println("Через " + i + " мес., сумма накоплений будет равна " + total + " рублей");
        }
        System.out.println("Чтобы накопить 2 459 000 рублей, потребуется " + i + " мес.");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        for (int i = 1; i <= 10; i++) {
            totalPopulation += totalPopulation * dif / 1000;
            System.out.println("Через " + i + " г., численность населения составляет " + totalPopulation);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int total = 15_000;
        int month = 0;
        int allowancePercentage = 7;
        while (total <= 12_000_000) {
            month++;
            total += total * allowancePercentage / 100;
            System.out.println("Месяц " + month + ", сумма равна " + total);
        }
        total = 12_000_000;
        System.out.println("Чтобы собрать " + total + " рублей при процентной ставке "
                + allowancePercentage + "% в месяц, Василию нужно будет копить " + month + " месяцев");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int total = 15_000;
        int month = 0;
        int allowancePercentage = 7;
        while (total <= 12_000_000) {
            month++;
            total += total * allowancePercentage / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма равна " + total);
            }
        }
        total = 12_000_000;
        System.out.println("Чтобы собрать " + total + " рублей при процентной ставке "
                + allowancePercentage + "% в месяц, Василию нужно будет копить " + month + " месяцев");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int total = 15_000;
        int allowancePercentageMonth = 7;
        int years = 9;
        int month = 0;
        while (month <= years * 12) {
            month++;
            total += total * allowancePercentageMonth / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 5;
        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int nowYear = 2023;
        int in100Years = nowYear + 100;
        int ago200Years = nowYear - 200;
        int year = 0;
        while (year < in100Years) {
            year += 79;
            if (year >= ago200Years && year <= in100Years) {
                System.out.println(year);
            }
        }
    }
}