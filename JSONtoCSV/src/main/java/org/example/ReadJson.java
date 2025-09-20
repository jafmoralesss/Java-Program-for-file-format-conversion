package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ReadJson {

    public List<Map<String, Object>> readJsonFile(String filePath) {
        List<Map<String, Object>> data = null;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            data = objectMapper.readValue(new File(filePath), List.class);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("ERROR: File not found or could not be read");
        }

        return data;
    }


}
