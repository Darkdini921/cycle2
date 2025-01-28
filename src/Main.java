public class Main {
    public static void main(String[] args) {

        // Задача 1

        System.out.println("");
        System.out.println("Задача 1");

        int total = 0;
        int income = 15000;
        int month = 0;

        while (total <= 2459000) {
            total = total + income;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей.");
        }

        // Задача 2

        System.out.println("");
        System.out.println("Задача 2");

        int a = 1;
        int b = 10;
        do {
            System.out.print(a + " ");
            a++;
        }
        while (a <= 10);

        System.out.println("");

        do {
            System.out.print(b + " ");
            b--;
        }
        while (b >= 1);

        // Задача 3

        System.out.println("");
        System.out.println("Задача 3");

        int Y = 12000000;
        int year = 0;
        int income2 = 17;
        int death = 8;

        do {

            int count = Y / 1000;
            Y = Y + ((income2 * count) - (death * count));

            year++;
            System.out.println("Год - " + year + ", численность населения составляет - " + Y);
        }
        while (year < 10);

        // Задача 4

        System.out.println("");
        System.out.println("Задача 4");

        int total2 = 15000;
        double percent = 7.0 / 100.0;
        int month2 = 0;

        for (; total2 <= 12000000; month2++) {
            total2 = (int) (total2 + (total2 * percent));
            System.out.println("В " + month2 + " месяце, сумма накоплений равна - " + total2);
        }

        // Задача 5

        System.out.println("");
        System.out.println("Задача 5");

        int total3 = 15000;
        double percent2 = 7.0 / 100.0;
        int month3 = 0;

        do {
            total3 = (int) (total3 + (total3 * percent2));
            month3++;
            if (month3 % 6 == 0)
                System.out.println("В " + month3 + " месяце, сумма накоплений равна - " + total3);
        } while (total3 <= 12000000);

        // Задача 6

        System.out.println("");
        System.out.println("Задача 6");

        int total4 = 15000;
        double percent3 = 7.0 / 100.0;
        int month4 = 0;

        do {
            total4 = (int) (total4 + (total4 * percent3));
            month4++;
            if (month4 % 6 == 0)
                System.out.println("В " + month4 + " месяце, сумма накоплений равна - " + total4);
        } while (month4 <= 108);

        // Задача 7

        System.out.println("");
        System.out.println("Задача 7");

        int day = 1;
        int i = 1;
        do {
            if (i == 5)
                System.out.println("Сегодня пятница, "+ day + "-е число. Необходимо подготовить отчет");
            if (i == 7){
                i = 0;}
            i++;
            day++;
        } while (day <= 31);

        //Задача 8

        System.out.println("");
        System.out.println("Задача 8");

        int year2 = 0;

        do {
            year2 = year2 + 79;
            if (year2 > 1825 && year2 < 2125)
                System.out.println(year2);
        } while (year2 < 3000);





















    }
}