package org.example;

// Копирование файлов:
//
//Напишите программу для копирования содержимого одного текстового файла в другой.
//Реализуйте копирование с использованием различных методов, таких как копирование по одному байту или по блокам.

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        String fileName = "text.txt";
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write("Hello world\n");
        fileWriter.write("Im name Nedzyko\n");
        fileWriter.write("I love sky blue and green apple\n");
        fileWriter.close();

        String fileNameCopy = "textCopy.txt";
        FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(fileNameCopy), true);

        while (inputStream.available() > 0){
            int data = inputStream.read();
            fileOutputStream.write(data);
        }

        inputStream.close();
        fileOutputStream.close();


        FileReader fileReader = new FileReader(fileNameCopy);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        System.out.println("Содержимое файла textCopy.txt: ");
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();


    }

}
