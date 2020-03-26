package ru.geekbrains.java_one.lesson_04;

import java.io.*;
import java.util.Scanner;

public class Lesson_6 {

    private static void fileCreate(String fileName, String fileText) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream(fileName));
        ps.println(fileText);
        ps.flush();
        ps.close();
    }

    private static void fileInToFile(String inToFileName, String fromFileName, boolean append) throws IOException {
        PrintStream inToFile = new PrintStream(new FileOutputStream(inToFileName, append));
        InputStreamReader fromFile = new InputStreamReader(new BufferedInputStream(new FileInputStream(fromFileName)),"UTF-8");
        int b;
        while ((b = fromFile.read()) != -1) inToFile.print((char) b);
        inToFile.flush();
        inToFile.close();
        fromFile.close();
    }

    public static long findInFile(String fileName, String word) throws IOException {

        Scanner sc = new Scanner(new InputStreamReader(new BufferedInputStream(new FileInputStream(fileName)),"UTF-8"));
        sc.toString().toLowerCase();
        sc.toString().replace('.',' ');
        sc.toString().replace(',',' ');
        word=word.toLowerCase();
        return sc.findAll(word).count();
    }


    public static void main(String[] args) {

        String fileText_1 = "Белая береза\nПод моим окном\nПринакрылась снегом,\nТочно серебром.\n\n" +
                            "На пушистых ветках\nСнежною каймой\nРаспустились кисти\nБелой бахромой.\n";
        String fileText_2 = "И стоит береза\nВ сонной тишине,\nИ горят снежинки\nВ золотом огне.\n\n" +
                            "А заря, лениво\nОбходя кругом,\nОбсыпает ветки\nНовым серебром.";
        String word = "серЕбром";

        try {
            //1.Создаем 2 текстовых файла
            fileCreate("lesson_6_file_1.txt",fileText_1);
            fileCreate("lesson_6_file_2.txt",fileText_2);
            //2.Склеиваем текстовые файлы
            fileInToFile("lesson_6_file_3.txt","lesson_6_file_1.txt", false);
            fileInToFile("lesson_6_file_3.txt","lesson_6_file_2.txt", true);
            //3.Проверяем присутствует ли слово в файле
            System.out.println("Указанное слово встречается " + findInFile("lesson_6_file_3.txt",word)+" раз в указанном файле");

            //4.Проверяем присутствует ли слово в папке
            String[] fileList = new File("C:\\java\\java_one").list();
            int a = 0;
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].contains(".txt")) a+=findInFile(fileList[i],word);
            }
            System.out.println("Указанное слово встречается " + a+" раз в указанной директории");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
