package Seminars;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class seminar2 {
    public static void main(String[] args) throws SecurityException, IOException {

        // // System.out.println(longStringBuilding(10, 'a', 'b'));
        // System.out.println(stringCompress("aaaabbbcdd"));

        // Scanner in = new Scanner(System.in);
        // String string = in.next();
        // System.out.println(isPalindrom(string));
        // in.close();

        String pathProject = System.getProperty("user.dir"); // Получаем в строку дирректорию "D:\learning\GB_devops\JavaIntro"
        String pathFile1 = pathProject.concat("\\Seminar2-1.txt"); // Соединение строки с "\Seminar2-1.txt"
        String pathFile2 = pathProject.concat("\\Seminar2-2.txt");
        addingToFile(pathFile1, longStringCreator("Hello!", 5));
        // addListToFile(pathFile2, showCurrentFiles(pathProject));
        // System.out.println(pathFile1);


    }



    static String longStringBuilding(int n, char c1, char c2) {
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая состоит из
        // чередующихся символов c1 и c2,
        // начиная с c1.
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            newStr.append(c1);
            newStr.append(c2);
        }
        return newStr.toString();
    }

    static String stringCompress(String str) {
        // Напишите метод, который сжимает строку.
        // Пример: вход aaaabbbcdd. Результат - a4b3cd2 для примера.
        StringBuilder newStr = new StringBuilder();
        char symbol = str.charAt(0);
        newStr.append(symbol);
        int count = 0;

        for (char letter : str.toCharArray()) {
            if (letter == symbol)
                count++;
            else {
                if (count != 1)
                    newStr.append(count);
                newStr.append(letter);
                symbol = letter;
                count = 1;
            }
        }
        if (count != 1)
            newStr.append(count);

        return newStr.toString();
    }

    static boolean isPalindrom(String str){
        //Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение).
        StringBuilder res = new StringBuilder("");

        for (int i = str.length() - 1; i >= 0; i--)
            res.append(str.charAt(i));

        return str.equals(res.toString());
    }

    static boolean isPalindrom1(String string){
        return string.equals((new StringBuilder(string)).reverse().toString()); // метод разворота
    }

    // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
    // который запишет эту строку в простой текстовый файл, обработайте исключения.
    static String longStringCreator(String word, int iters){
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < iters; i++) {
            newStr.append(word);
        }

        return newStr.toString() + "\n";
    }

    static void addingToFile(String filePath, String text){
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile, true); // если нет append true то будет перезвпись файла

            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
    // Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
    // Обработайте ошибки с помощью try-catch конструкции. 
    // В случае возникновения исключения, оно должно записаться в лог-файл.

    static String[] showCurrentFiles(String dirPath){
        File currentDir = new File(dirPath);
        return currentDir.list();
    }

    static void addListToFile(String filePath, String[] list) throws SecurityException, IOException{
        Logger logger = Logger.getLogger(seminar2.class.getName());
        FileHandler fh = new FileHandler("Seminar2-3(log).txt");

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);

        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile);

            for (String str : list) 
                writer.write(str + "\n");

            writer.close();
            
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
    }

    

        
}
