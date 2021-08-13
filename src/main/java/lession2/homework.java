package lession2;

public class homework {


    public static void main(String[] args) {
        String[][] massive = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };


            try {
                System.out.printf("Summ = %s\n", sumArray(massive));
            } catch (MyArraySizeException e) {
            } catch (MyArrayDataException e) {
            }
        }

    public static int sumArray(final String[][] input) throws MyArrayDataException, MyArraySizeException {
        int summ = 0;
        if (input.length != 4) {
            throw new MyArraySizeException("массив должен быть 4х4");
        }
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                try {
                    summ += Integer.parseInt(input[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, "элементы должны быть цифрами");
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new MyArraySizeException("массив должен быть 4х4");
                }
            }
        }
        return summ;
    }
}
