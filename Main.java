class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class Main {
    public static void sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("У массива не 4 элемента");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("В строке " + i + " не 4 элемента");
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        System.out.println("Сумма элементов массива: " + sum); // Вывод суммы
    }

    public static void main(String[] args) {
        String[][] matrix = {
                { "1", "2", "s", "54" },
                { "51", "62", "75", "68" },
                { "92", "10", "11", "12" },
                { "13", "14", "15", "16" },
                // { "13", "14", "15", "16" }
        };

        try {
            sumArray(matrix);
        } catch (MyArraySizeException | MyArrayDataException error) {
            System.out.println(error.getMessage());
        }
    }
}
// int c = Integer.parseInt("42");
