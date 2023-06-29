package HomeWork.HW01;

import java.util.Scanner;

import Lesson.lesson2.string;

public class task3 {

    // 3) Реализовать простой калькулятор
    public static void main(String[] args) {
        while(true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            Draving();
            int userChoise = GetNumber("Input a number from 1 to 4: ");
            int a = GetNumber("Enter number A: ");
            int b = GetNumber("Enter number B: ");

            if (userChoise == 1){
                System.out.println(Summ(a, b));
                return;
            }
            else if  (userChoise == 2){
                System.out.println(Substraction(a, b));
                return;
            }
            else if(userChoise == 3){
                System.out.println(Multiplication(a, b));
                return;
            }
            else if(userChoise == 4){
                System.out.println(Division(a, b));
                return;
            }
            else return;

        }

        
    }


      public static int GetNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // scanner.close();
        return num;
    }

    public static int Summ(int a, int b){
        return a + b;
    }

    public static int Substraction(int a, int b) {
        return a - b;
    }
    public static int Multiplication(int a, int b) {
        return a * b;
    }
    public static Double Division(int a, int b) {
        double res = (double)a / (double)b;
        return res;
    }

    public static void Draving(){
        System.out.println("1 - Sum");
        System.out.println("2 - Substraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
    }

    
}
