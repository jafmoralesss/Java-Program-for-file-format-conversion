package org.example;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *  This class converts JSON files into CSV files.
 *  This version doesn't support nested objects in other objects.
 *  Version established as:
 * @version 1.0.0
 * @author Jafet Morales NAO ID: 3357
 */
public class MainConverter {

    /**
     * This method manages the user interaction by using Scanner to generate the file conversion by
     * calling ReadJson and WriteCsv.
     *
     * @param args Not used in this version.
     */
    public static void main(String[] args) {
        System.out.println("===WELCOME TO THE JSON-TO-CSV CONVERTER===");
        Scanner scannedFilePath = new Scanner(System.in);
        System.out.println("Insert your JSON file's FilePath: ");
        String inputFilePath = scannedFilePath.nextLine();
        System.out.println("Insert the FilePath for your CSV file: ");
        String outputFilePath = scannedFilePath.nextLine();

        ReadJson startReadJson = new ReadJson();
        List<Map<String, Object>> parsedData = startReadJson.parseJsonFile(inputFilePath);

        JsonFlattener startJsonFlattener = new JsonFlattener();
        List<Map<String, Object>> flattennedData = startJsonFlattener.flattenJson(parsedData);

        if (flattennedData!=null) {
            WriteCsv csvWriter = new WriteCsv();
            csvWriter.writeCsvFile(flattennedData, outputFilePath);
            System.out.println("SUCCESFUL CONVERSION: Check your output filepath!");
        } else {
            System.out.println("ERROR: File couldn't be processed or it's empty");
        }
    }
}