package org.ahocorasick;

import org.ahocorasick.keyword.RegionalKeyword;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CsvToEntity{

    private List<RegionalKeyword> regionalKeywords;

    public CsvToEntity(List<RegionalKeyword> regionalKeywords) {
        this.regionalKeywords = regionalKeywords;
    }

    public void fillRegionalKeywords(String csvPath) {

        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {

            // read header line
            line = br.readLine();
            String[] headers = line.split(cvsSplitBy);

            // read records
            List<String[]> records = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(cvsSplitBy);
                records.add(fields);
            }

            // create and populate entities
            for (String[] record : records) {
                RegionalKeyword entity = new RegionalKeyword();
                for (int i = 0; i < record.length; i++) {
                    String fieldName = headers[i];
                    String fieldValue = record[i];
                    Field field = entity.getClass().getDeclaredField(fieldName);

                    if (field == null || fieldValue == null || fieldName == null || fieldValue.isEmpty()){
                        continue;
                    }
                    field.setAccessible(true);
                    if (field.getType() == int.class) {
                        field.setInt(entity, Integer.parseInt(fieldValue));
                    } else if (field.getType() == double.class) {
                        field.setDouble(entity, Double.parseDouble(fieldValue));
                    } else if (field.getType() == boolean.class) {
                        field.setBoolean(entity, Boolean.parseBoolean(fieldValue));
                    } else {
                        field.set(entity, fieldValue);
                    }
                }
                regionalKeywords.add(entity);
            }

        } catch (Exception e) {
        }
    }

    public List<RegionalKeyword> getRegionalKeywords() {
        return regionalKeywords;
    }

    public void setRegionalKeywords(List<RegionalKeyword> regionalKeywords) {
        this.regionalKeywords = regionalKeywords;
    }
}
