package util;

import util.csv.CsvUtil;
import util.csv.CsvUtilImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileCSVDao<T> implements AbstractDao<T> {
    public static final int SKIP_LINE_HEADER = 1;
    private final String filePath;
    private final CsvUtil<T> csvUtil;
    private final Class<T> tClass;

    public FileCSVDao(String filePath, Class<T> tClass) {
        this.filePath = filePath;
        this.tClass = tClass;
        this.csvUtil = new CsvUtilImpl();
    }

    @Override
    public T save(T t) {
        try (FileWriter writer = new FileWriter(filePath, true);
             PrintWriter printWriter = new PrintWriter(new BufferedWriter(writer))) {
            if (!isHeaderExist(t)){
                printWriter.println(csvUtil.writeHeader(t));
            }
            printWriter.println(csvUtil.toCsv(t));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean isHeaderExist(T t) {
        try (
                FileReader fr = new FileReader(filePath);
        ) {
            if (fr.read() == -1){
                return false;
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    @Override
    public T getDetail(String id) {
        return null;
    }

    @Override
    public List<T> showList() {
        try (
                FileReader fr = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            ArrayList<String> listLine = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                listLine.add(line);
            }
            br.close();
            fr.close();
            return listLine.stream()
                           .skip(SKIP_LINE_HEADER)
                           .map(s -> csvUtil.fromCsv(s, tClass))
                           .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
