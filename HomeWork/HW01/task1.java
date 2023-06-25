package HomeWork.HW01;

import java.util.Scanner;
//  1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task1 {
    
    public static void main(String[] args) {
        Integer trnum = GetNumber("Enter number: ");
        System.out.printf("Triangle nummber = "+TriangleNumber(trnum));
        




    }

    public static int GetNumber(String text) { 
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }
    
    public static int TriangleNumber(Integer a) {
        int res = (a*(a+1))/2;
        return res;
    }

}
