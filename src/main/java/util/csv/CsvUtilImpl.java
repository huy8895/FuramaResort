package util.csv;

import models.rent.House;
import util.csv.impl.HouseCsvImpl;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CsvUtilImpl<T> implements CsvUtil<T> {
    private static final String COMMA_DELIMITER = ",";
    public static final int INITIAL_VALUE = 0;

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

    protected List<String> getAllField(Class<?> typeOfSrc) {
        List<Field> fieldList = new ArrayList<>();
        getAllFields(fieldList, typeOfSrc);
        return fieldList.stream()
                        .map(field -> field.getName())
                        .collect(Collectors.toList());
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
    @SuppressWarnings("unchecked")
    public T fromCsv(String csvLine, Class<T> classOfT) {
        if (House.class.equals(classOfT)) {
            return (T) new HouseCsvImpl().fromCsv(csvLine);
        }
        return null;
    }

    private static void getAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));
        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }
    }

    protected Map<String, String> getMapFieldNameAndValue(String csvLine, Class<T> classOfT) {
        List<String> allField = getAllField(classOfT);
        String[] values = csvLine.split(COMMA_DELIMITER);
        Map<String, String> map = new HashMap<>();
        AtomicInteger atomicInteger = new AtomicInteger(INITIAL_VALUE);
        Arrays.stream(values)
              .forEach(value ->
                      map.put(allField.get(atomicInteger.getAndIncrement()), value)
              );
        return map;
    }
}
