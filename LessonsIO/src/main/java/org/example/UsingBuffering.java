package org.example;

import java.io.*;
import java.util.Scanner;

// Использование буферизации:
//
//Изучите, как использовать буферизованные потоки для улучшения производительности операций ввода/вывода.
//Реализуйте чтение и запись файлов с использованием буферизованных потоков.
public class UsingBuffering  {
    public static void main(String[] args) throws IOException {

        File file = new File("input.txt");
        FileWriter fileWriter = new FileWriter(file);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для записи в файл:");
        fileWriter.write(scanner.nextLine());
        fileWriter.close();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Добавление новой строки
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
