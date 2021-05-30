package util.csv;

public interface CsvUtil<T> {
    String writeHeader(Object src);
    String toCsv(Object src);
    T fromCsv(String csvLine, Class<T> classOfT) ;
}
