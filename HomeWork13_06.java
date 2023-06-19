package homeWork;

import java.util.Scanner;

// 1 уровень сложности: напишите алгоритм, который принимал
// бы значение месяца (через сканнер) и, используя условных оператор,
// выводил бы в консоль в какое
// время года этот месяц попадает (зима, весна, лето, осень)
public class HomeWork13_06 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ввидите месяц от [1;12]:");
        int month = sc.nextInt();
        sc.close();

        switch (month)  {
            case 12,1,2 -> System.out.println("winter");
            case 3,4,5 -> System.out.println("spring");
            case 6,7,8 -> System.out.println("summer");
            case 9,10,11-> System.out.println("autumn");
            default -> System.out.println("error");

        }


    }
}
