package loops;

public class Loops {
    public static void main(String[] args) {
//        displayFrom0ToN(5);
//        displayFrom0ToNWhile(7);
//        printCharPerLine(1234);
//        System.out.println(reverseString("pies22"));
//        printBinary(321);
//        System.out.println(isPalindrome("kotek"));
//        arrayOfIntegers(new int[]{1, 2, 3});
//        bubbleSort(new int[]{10, 5, 4, 7, 2, 1, 6, 3});
//        identityMatrix(5);

        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        System.out.println(isIdentity(matrix));

    }

    private static void displayFrom0ToN(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    private static void displayFrom0ToNWhile(int n) {
        int index = 0;
        while (index <= n) {
            System.out.print(index++);
        }
        System.out.println();
    }

    private static void printCharPerLine(int number) {
        while (number > 0) {
            int help = number % 10;
            number /= 10;
            System.out.println(help);
        }
    }

    private static String reverseString(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }

    public static void printBinary(int number) {
        String binaryNumber = "";
        String result = "";
        while (number > 0) {
            binaryNumber += number % 2;
            number /= 2;
        }
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            result += binaryNumber.charAt(i);
        }
        System.out.println(result);

    }

    private static boolean isPalindrome(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return text.equals(result);
    }

    public static void arrayOfIntegers(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void identityMatrix(int value) {
        int row, col;
        for (row = 0; row < value; row++) {
            for (col = 0; col < value; col++) {
                if (row == col) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isIdentity(int[][] array) {
        boolean flag = true;
        int row, col;
        for (row = 0; row < array.length; row++) {
            for (col = 0; col < array[row].length; col++) {
                if(row==col && array[row][col]!=1){
                    flag=false;
                    break;
                }
                if (row!=col && array[row][col]!=0){
                    flag=false;
                    break;
                }
            }
        }
       return flag;
    }
}
