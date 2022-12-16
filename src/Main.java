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
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
    }

    private static void task19() {

    }

    private static void task1() {
        System.out.println("задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(+i);
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(+i);
        }

    }

    private static void task3() {
        System.out.println("задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(+i);
        }

    }

    private static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(+i);
        }

    }

    private static void task5() {
        System.out.println("задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(+i + " год является високосным");
        }
    }

    private static void task6() {
        System.out.println("задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(+i);
        }

    }

    private static void task7() {
        System.out.println("задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(+i);
        }

    }


    private static void task8() {
        System.out.println("задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + salary;
        }
        System.out.println("Месяц" + 12 + ", сумма накоплений равна" + total + " рублей");
    }

    private static void task9() {
        System.out.println(" задача 9");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total / 1;
            total = total + salary;
            System.out.println("Месяц" + i + ", сумма накоплений равна" + total + " рублей");
        }
    }

    private static void task10() {
        System.out.println(" задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + 2 * i);
        }
    }

    private static void task11() {
        System.out.println("задача 11");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц" + i + " сумма накоплений равна" + total + "рублей");
        }
    }

    private static void task12() {
        System.out.println("задача12");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i);
        }
        System.out.println("" +
                "");
        for (int l = 10; l >= 1; l = l - 1) {
            System.out.print(" " + l);
        }
    }


    private static void task13() {
        System.out.println(" задача 13");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int year = 1;
        while (year <= 10) {
            int year1 = population / 1000;
            int deathPer = death * year1;
            int bornPer = born * year1;
            population = (population + bornPer) - deathPer;
            System.out.println("год" + year + " число " + population);
            year++;
        }
    }

    private static void task14() {
        System.out.println(" задача 14");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 12_000_000) {
            total = total + total / 100*7;
            total = total + salary;
            i = i + 1;
            System.out.println("месяц" + i + "накопил " + total);
        }
    }

    private static void task15() {
        System.out.println("задача 15");
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.print(" " + i);
            }
        }
    }

    private static void task16() {
        System.out.println("задача 16");
        int salary = 15000;
        for (int i = 1; i <= 180; i++) {
            salary += salary  *7/100;
            if (i % 6==0)
                    System.out.println("за месяц"+i+" накопил" + salary);
                }


            }

    private static void task17() {
        System.out.println(" задача 17");
        int i = 7;
        for (; i <= 31; i++) {
            if (i % 7 == 0)
                System.out.println("Сегодня пятница" + i + "-е число. Необходимо подготовить отчет ");
        }
    }

    private static void task18() {
        System.out.println("задача 18");
        for (int i=1822; i<2122 ; i++){
            if (i% 79==0)
                System.out.println(" "+ i);
        }


    }
}





