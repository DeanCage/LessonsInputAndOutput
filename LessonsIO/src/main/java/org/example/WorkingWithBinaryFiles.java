package org.example;

// Работа с бинарными файлами:
//
//Создайте программу для чтения и записи бинарного файла, например, изображения.
//Попробуйте считать содержимое бинарного файла и вывести его в шестнадцатеричном формате.

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class WorkingWithBinaryFiles {

    public static void main(String[] args)  throws IOException {
        String fileName = "C:\\Users\\exfai\\Desktop\\1.jpg";
        System.out.println("Путь к файлу: " + fileName);
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Файл не существует!");
            return;
        }

        // Чтение файла в массив байтов
        byte[] fileBytes = readBytesFromFile(file);

        // Вывод содержимого массива байтов в шестнадцатеричном формате
        printHexadecimal(fileBytes);
    }

    // Метод для чтения файла в массив байтов
    private static byte[] readBytesFromFile(File file) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(file);
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            return outputStream.toByteArray();
        }
    }

    // Метод для вывода массива байтов в шестнадцатеричном формате
    private static void printHexadecimal(byte[] bytes) {
        for (byte b : bytes) {
            System.out.printf("%02X ", b);
        }
    }

    }
