package util;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReaderUtil<T> {
    private final Gson gson = new Gson();

    public static List<String> read(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<String> listLine = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            listLine.add(line);
        }
        br.close();
        fr.close();
        return listLine.stream()
                       .distinct()
                       .collect(Collectors.toList());
    }

    public List<T> getList(String filePath, Class<T> clazz) {
        try {
            return read(filePath).stream()
                                 .map(s -> gson.fromJson(s, clazz))
                                 .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}