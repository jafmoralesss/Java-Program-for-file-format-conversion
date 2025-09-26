package org.example;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JsonFlattener {
    public List<Map<String, Object>> flattenJson(List<Map<String, Object>> originalList){
        List<Map<String, Object>> flattenedList = new ArrayList<>();

        for (Map<String, Object> map : originalList){
            Map<String, Object> flattenedMap = new LinkedHashMap<>();
            flattenMap(map, flattenedMap, "");
            flattenedList.add(flattenedMap);
        }

        return flattenedList;
    }

    private void flattenMap (Map<String, Object> originalMap, Map<String, Object> flattenedMap, String prefix){

        for (Map.Entry<String, Object> entry : originalMap.entrySet()){
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value instanceof Map){
                flattenMap((Map<String, Object>) value, flattenedMap, prefix + key + "_");
            } else {
                flattenedMap.put(prefix + key, value);
            }
        }
    }
}
