package Seminars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class seminar6 {
    public static void main(String[] args) {
        
        ArrayList<Integer> myList = createArray(10, 10);

        // System.out.println(myList);
        procent(myList);
    }

    static ArrayList<Integer> createArray(int n, int maxValue) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++)
            list.add(random.nextInt(maxValue));
        return list;
    }

    static void procent(ArrayList<Integer> myArray){
        double sizeArray = myArray.size();
        Set set = new HashSet(myArray);
        double sizeSet = set.size();
        double res = sizeSet / sizeArray * 100;
        System.out.println(myArray);
        System.out.println(set);
        System.out.printf("%s - процент от массива", res);
    }
    
}
