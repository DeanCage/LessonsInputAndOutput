package org.example;

import java.io.*;
import java.util.Scanner;


// Чтение и запись данных из консоли:
//
//Напишите программу, которая запрашивает у пользователя ввод с консоли и записывает этот ввод в текстовый файл.
//Реализуйте программу, которая читает данные из файла и выводит их в консоль.

public class ScanAndReaderDataConsole {
    public static void main(String[] args) throws IOException {
        String fileName = "text_console_save.txt";
        FileWriter fileWriter = new FileWriter(fileName);
        System.out.println("Введите текст который надо записать и сохранить: ");
        System.out.println("После ENTER файл будет записан");
        Scanner scanner = new Scanner(System.in);
        fileWriter.write(scanner.nextLine());
        fileWriter.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        System.out.println("Содержимое файла: ");
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
