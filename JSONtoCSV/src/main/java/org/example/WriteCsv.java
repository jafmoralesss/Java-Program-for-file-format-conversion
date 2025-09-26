package org.example;

import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;



public class WriteCsv {
    /**
     *
     * @param flattenedData Contents data from the parsed JSON file.
     * @param outputFilePath Shows where the CSV file will be written.
     */
    public void writeCsvFile(List<Map<String, Object>> flattenedData, String outputFilePath){
        try {
            CsvMapper csvMapper = new CsvMapper();
            CsvSchema.Builder schemaBuilder = CsvSchema.builder();
            for (String key : flattenedData.get(0).keySet()) {
                schemaBuilder.addColumn(key);
            }
            CsvSchema csvSchema = schemaBuilder.build().withHeader();

            csvMapper.writer(csvSchema).writeValue(new File(outputFilePath), flattenedData);

        } catch (IOException E) {
            E.printStackTrace();
            System.err.println("ERROR: Data could not be found or file could not be written.");
        }
    }
}
