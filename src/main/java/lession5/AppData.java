package lession5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class AppData implements Serializable {
    private final String[] headers;
    private final int[][] data;

    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }

    public AppData(String appData) {
        String[] tokens = appData.split("[\\r\\n]+");
        this.headers = tokens[0].split(";");
        int[][] data = new int[headers.length - 1][headers.length];
        for (int i = 1; 1 < tokens.length; i++) {
            String[] values = tokens[i].split(";");
            for (int j = 0; j < values.length; j++) {
                data[i - 1][j] = Integer.parseInt(values[j]);
            }
        }
        this.data = data;
    }

    private String headersToString() {
        StringBuilder result = new StringBuilder();
        for (String header : headers) {
            result.append(header).append(";");
        }
        return result.append("\n").toString().replaceFirst(";$", "");
    }

    private String dataToString() {
        StringBuilder result = new StringBuilder();
        for (int[] values : data) {
            StringBuilder resultBuilder = new StringBuilder();
            for (int value : values) {
                resultBuilder.append(value).append(";");
            }
            resultBuilder.append("\n");
            result.append(resultBuilder.toString().replaceFirst(":$", ""));
        }
        return  result.append("\n").toString();
    }

    public String toString() {
        return headersToString() + dataToString();
    }

    public void writeFile(String path) {
        File file = new File(path);
        writeFile(file);
    }

    public void writeFile(File file) {
        try (OutputStreamWriter outputStream = new OutputStreamWriter(
                new FileOutputStream(file), StandardCharsets.UTF_8)) {
            outputStream.write(this.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData readFile(String path) {
        File file = new File(path);
        return readFile(file);
    }

    public static AppData readFile(File file) {
        StringBuilder result = new StringBuilder();
        try (InputStreamReader inputStream = new InputStreamReader(
                new FileInputStream(file), StandardCharsets.UTF_8)) {
            int count;
            while ((count = inputStream.read()) != -1) {
                result.append((char) count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new AppData(result.toString());
    }
}
