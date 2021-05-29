package util.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CsvUtilImpl implements CsvUtil {
    private static final String COMMA_DELIMITER = ",";

    @Override
    public String writeHeader(Object src) {
        return writeHeader(src.getClass());
    }

    private String writeHeader(Class<?> typeOfSrc) {
        List<Field> fieldList = new ArrayList<>();
        getAllFields(fieldList, typeOfSrc);
        return fieldList.stream()
                        .map(Field::getName)
                        .collect(Collectors.joining(COMMA_DELIMITER));
    }

    @Override
    public String toCsv(Object src) {
        if (src == null) {
            return null;
        }
        return toCsv(src, src.getClass());
    }

    private String toCsv(Object src, Class<?> typeOfSrc) {
        List<Field> fieldList = new ArrayList<>();
        getAllFields(fieldList, typeOfSrc);
        List<String> listValueOfFields = new ArrayList<>();
        try {
            for (Field declaredField : fieldList) {
                declaredField.setAccessible(true);
                Object o = declaredField.get(src);
                listValueOfFields.add(fieldList.indexOf(declaredField), o.toString());
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return String.join(COMMA_DELIMITER, listValueOfFields);
    }


    @Override
    public <T> T fromCsv(String json, Class<T> classOfT) {
        return null;
    }

    public static void getAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));

        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }
    }
}
