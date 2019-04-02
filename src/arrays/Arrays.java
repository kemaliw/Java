package arrays;

public class Arrays {
    public static void main(String[] args) {
        get5AlphabetLetters();
        displayLetters();
        revertTable(new double[]{1, 2, 3});
        displayRevertedTable(new double[]{1, 2, 3});

    }

    private static String[] get5AlphabetLetters() {
        return new String[]{"a", "b", "c", "d", "e"};
    }

    private static void displayLetters() {
        for (int i = 0; i < get5AlphabetLetters().length; i++) {
            System.out.print(get5AlphabetLetters()[i]);
            if (i < get5AlphabetLetters().length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    private static double[] revertTable(double[] array) {
        return new double[]{array[2], array[1], array[0]};
    }

    private static void displayRevertedTable(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
