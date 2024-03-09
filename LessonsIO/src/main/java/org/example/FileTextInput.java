package org.example;

// Чтение и запись текстовых файлов:
//
//Напишите программу, которая читает содержимое текстового файла и выводит его в консоль.
//Создайте новый текстовый файл и запишите в него несколько строк текста с помощью программы.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTextInput {
    public static void main(String[] args) throws IOException {
        String fileName = "text.txt";
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write("Hello world ");
        fileWriter.write("Second and minute ");
        fileWriter.close();
        System.out.println("Записано");

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        System.out.println("Содержимое файла: ");
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
        System.out.println("Чтение файла завершено");
    }
}
