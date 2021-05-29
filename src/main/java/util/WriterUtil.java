package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WriterUtil {
    public static void writeList(List<String> lines, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true);
             PrintWriter printWriter = new PrintWriter(new BufferedWriter(writer))) {
            lines.forEach(line -> printWriter.println(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("writeAppend Success...");
        System.out.println("Success...");
    }

    public static void writeAppend(String line, String filePath) {

        try (FileWriter writer = new FileWriter(filePath, true);
             PrintWriter printWriter = new PrintWriter(new BufferedWriter(writer))) {
            printWriter.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("writeAppend Success...");
    }
}
