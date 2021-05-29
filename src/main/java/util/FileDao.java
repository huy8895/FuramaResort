package util;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileDao<T> implements AbstractDao<T> {
    private final String filePath;
    private final Gson gson;
    private final Class<T> tClass;

    public FileDao(String filePath, Class<T> tClass) {
        this.filePath = filePath;
        this.tClass = tClass;
        this.gson = new Gson();
    }

    @Override
    public T save(T t) {
        try (FileWriter writer = new FileWriter(filePath, true);
             PrintWriter printWriter = new PrintWriter(new BufferedWriter(writer))) {
            printWriter.println(gson.toJson(t));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
                           .map(s -> gson.fromJson(s, tClass))
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
