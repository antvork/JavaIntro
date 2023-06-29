package Lesson.lesson2;

import java.io.File;

public class program {
    public static void main(String[] args) {

        // Создать строку из 1 млн +
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("+");
        }

        System.out.println(System.currentTimeMillis());

        // StringBuilder
    // concat(): объединение строк
    // valueOf(): преобразует Object в строковое представление (завязан на toString())
    // join(): объединяет набор строк в одну с учетом разделителя
    // charAt(): получение символа по индексу
    // indexOf(): первый индекс вхождения подстроки
    // lastIndexOf(): последний индекс вхождения подстроки
    // startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
    // replace(): замена одной подстроки на другую

    // trim(): удаляет начальные и конечные пробелы
    // substring(): возвращает подстроку, см.аргументы
    // toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
    // сompareTo(): сравнивает две строки
    // equals(): сравнивает строки с учетом регистра
    // equalsIgnoreCase(): сравнивает строки без учета регистра
    // regionMatches(): сравнивает подстроки в строках
        
        // Работа с файловой системой. Файлы
    // File <имя> = new File(<полный путь к файлу>);
    // File f1 = new File("file.txt");
    // File f2 = new File("/Users/sk/vscode/java_projects/file.txt");


    // ПУТИ

    //  String pathProject = System.getProperty("user.dir");
    //  String pathFile = pathProject.concat("/file.txt");
    //  File f3 = new File(pathFile);
    //  System.out.println(f3.getAbsolutePath ());
    //  // /Users/sk/vscode/java_projects/file.txt
    //  // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

    //  try {
    //  Код, в котором может появиться ошибка
    // } catch (Exception e) {
    //  Обработка, если ошибка случилась
    // }
    // finally {
    //  Код, который выполнится в любом случае
    // }

    // Бинарные файлы
    



    }
    
}
