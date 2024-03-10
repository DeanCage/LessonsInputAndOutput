package org.example;

import java.io.*;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static java.nio.file.Files.readString;

// Напишите программу, которая считывает содержимое текстового файла и выводит его на консоль.
//Создайте программу, которая принимает ввод пользователя с консоли и записывает его в текстовый файл.
public class ReadingAndWritingToFiles {
    public static void main(String[] args) throws IOException {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите путь к файлу: ");
        String filePath = reader.readLine();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))){
            String line;
            System.out.println("Содержимое файла: ");
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath, true))){
            System.out.println("Введите текст для записи в файл: ");
            String textToWrite = reader.readLine();
            fileWriter.write(textToWrite);
            System.out.println("Текст успешно записан в файл.");
        }catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

    }
}
