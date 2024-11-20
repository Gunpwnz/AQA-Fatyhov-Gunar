public class Main {
    public static void main(String[] args) {

        String[][] matrix = {
                { "1", "2", "23", "54" },
                { "51", "62", "75", "68" },
                { "92", "10", "11", "12" },
                { "13", "14", "15", "16" },
                // { "13", "14", "15", "16" }
        };

        try {
            // new MyException =
            MyException.sumArray(matrix);
        } catch (MyArraySizeException | MyArrayDataException error) {
            System.out.println(error.getMessage());
        }
    }
}
// int c = Integer.parseInt("42");
