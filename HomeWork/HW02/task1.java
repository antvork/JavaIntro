package HomeWork.HW02;

import java.io.File;

public class task1 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir"); //Получаем путь к директории
        String[] currentDir = showCurrentFiles(pathProject); // Получаем массив строк из файлов в директории
        showFileExtension(currentDir);

    }

    // 1) Напишите метод, который определит тип (расширение) файлов из текущей папки
    // и выведет в консоль результат вида
    // 1 Расширение файла: txt
    // 2 Расширение файла: pdf
    // 3 Расширение файла:
    // 4 Расширение файла: jpg

    static String[] showCurrentFiles(String dirPath) { //Метод который помещает в массив строк названия всех файлов
        File currentDir = new File(dirPath);
        return currentDir.list();

        
    }

    static void showFileExtension(String[]folderFileName){
        for (String fileName : folderFileName) {
            if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0){ //1 если точка есть, и её индекс не 0
                System.out.printf("File '%s' have an extension '%s'", fileName.substring(0, fileName.indexOf(".")),fileName.substring(fileName.lastIndexOf(".")+1));
                System.out.println();
            }
        }


    }


    
}
