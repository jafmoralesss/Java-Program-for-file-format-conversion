package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class ReadJson {

    /**
     * Reads a JSON file and parses its content into a list of maps.
     *
     * @param filePath The path for the JSON file to be read.
     * @return A list that represents the parsed JSON data.
     */
    public List<Map<String, Object>> parseJsonFile(String filePath) {
        List<Map<String, Object>> data = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            data = objectMapper.readValue(new File(filePath), List.class);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("ERROR: File not found or could not be read");
        }
        return data;
    }
}