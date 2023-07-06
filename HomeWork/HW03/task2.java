package HomeWork.HW03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {

        List<String> listPlanet = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune",
                "Pluto", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune",
                "Pluto");

        List<String> newList = removingDuplicate(listPlanet);

        for (String string : newList) {
            System.out.print(string + " ");
        }

    }

    static List<String> removingDuplicate(List<String> myList) {
        Set set = new HashSet(myList);
        List<String> result = new ArrayList<String>(set);
        return result;
    }

}
