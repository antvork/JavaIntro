package HomeWork.HW02;

import java.io.IOException;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) throws IOException {

        Integer[] myArray = { 8, 4, 9, 6, 8, 5, 3, 13, 1, 2, 4, 3 };

        Integer[] sortedArray = SortBubble(myArray);

        for (Integer integer : sortedArray) {
            System.out.print(integer + " ");
        }

    }

    // 2) Реализуйте алгоритм сортировки пузырьком числового массива,
    // результат после каждой итерации запишите в лог-файл.

    static Integer[] SortBubble(Integer[] array) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("logHW02Task02.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                logger.log(Level.INFO, "Итерация сортировки пройдена");
            }
        }
        return array;
    }

}
