package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainConverter {
    public static void main(String[] args) {

        Scanner scannedFilePath = new Scanner(System.in);
        System.out.println("Insert your JSON FilePath: ");
        String inputFilePath = scannedFilePath.nextLine();
        System.out.println("Insert your CSV output FilePath: ");
        String outputFilePath = scannedFilePath.nextLine();

        ReadJson startReadJson = new ReadJson();
        List<Map<String, Object>> parsedData = startReadJson.parseJsonFile(inputFilePath);

        WriteCsv csvWriter = new WriteCsv();
        csvWriter.writeCsvFile(parsedData, outputFilePath);

    }
}