package lession5;

public class Homework {

    public static final String PATH = "src/main/java/lession5/app.csv";
    public static void main(String[] args) {
        String[] headers = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                { 100, 200, 123},
                { 300, 400, 500}
        };
        AppData appData = new AppData(headers, data);

        appData.writeFile(PATH);
        AppData receivedAppData = AppData.readFile(PATH);
        System.out.println(receivedAppData);
    }
}
