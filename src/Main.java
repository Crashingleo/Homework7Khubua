import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }
    public static void task1()
    {
        System.out.println("Task1");
        int start = 0;
        int Add = 15000;
        int month = 0;
        while( start <= 2_459_000)
        {
            start = start + 15000;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + start + " рублей");
        }

    }
    public static void task2()
    {
        System.out.println("Task2");
        int number = 1;
        while(number <= 10)
        {
                System.out.print(number + " ");
                number++;
            }
        System.out.println("");
        for(number = 10;number > 0; number--)
        {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
    public static void task3()
    {
        System.out.println("Task3");
        int total = 12_000_000;
        int plus = 17 * 12_000_000 / 1000;
        int minus = 8 * 12_000_000 / 1000;
        for (int year = 1; year < 11; year++)
        {
            total = total + plus - minus;
            System.out.println("Год " + year + " численность населения составляет " + total);
        }


    }
    public static void task4()
    {
        System.out.println("Task4");
        int percent = 7;
        int vklad =  15000;
        int total = 0;
        for (int month = 1; total <12_000_000; month++)
        {

            total = total + vklad;
            total = total + total*percent/100;
            if (month%6 == 0) {
                System.out.println("Месяц " + month + " сумма вклада " + total);
            }

        }

    }
    public static void task5()
    {
        System.out.println("Task5");
        int percent = 7;
        int vklad = 15000;
        int total = 0;
        for (int month = 1; total < 12_000_000; month++)
        {

            total = total + vklad;
            total = total + total * percent / 100;
            if (month % 6 == 0)
            {
                System.out.println("Месяц " + month + " сумма вклада " + total);
            }


        }
    }
    public static void task6()
    {
        System.out.println("Task 6");
        int percent = 7;
        int vklad = 15000;
        int total = 0;
        for (int month = 1; month < 108; month++)
        {

            total = total + vklad;
            total = total + total * percent / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма вклада " + total);
            }


        }
    }
    public static void task7()
    {
        System.out.println("Task 7");
        int Day = 1;
        int Friday = 5;
        while (Day < 31)
        {
            if (Day == Friday)
            {
                System.out.println("Сегодня - пятница, " + Day + "-е число");
                Friday = Friday + 7;
            }else Day++;
        }
    }
    public static void task8()
    {
        System.out.println("Task 8 :)");
        int PastYear = 1823;
        int FutureYear = 2123;
        for (int Start = 0; Start < FutureYear; Start += 79)
        {
            if (Start > PastYear)
                System.out.println(Start);

        }

    }

}