package util.csv;

public interface CsvUtil {
    String writeHeader(Object src);
    String toCsv(Object src);
    <T> T fromCsv(String json, Class<T> classOfT) ;
}
