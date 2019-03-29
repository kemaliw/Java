package Methods;

public class BasicMethods {
    public static void main(String[] args) {
        System.out.println(getMyAge());
        System.out.println(getMyName());
        displayMathOperations(2, 3);
        System.out.println(isEven(4));
        System.out.println(countDivisionBy3And5(14));
        System.out.println(thirdPow(4));
        System.out.println(sqrt(5));
        System.out.println(canBuildTriangle(3,3,3));
    }

    private static String getMyAge() {
        return "My age is 30";
    }

    private static String getMyName() {
        return "My name is Mike";
    }

    private static void displayMathOperations(double arg1, double arg2) {
        System.out.println("Addition: " + (arg1 + arg2));
        System.out.println("Subtraction: " + (arg1 - arg2));
        System.out.println("Multiplication: " + (arg1 * arg2));
    }

    private static boolean isEven(double number) {
        return number % 2 == 0;
    }

    private static boolean countDivisionBy3And5(double number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    private static double thirdPow(double number) {
        return Math.pow(number, 3);
    }

    private static double sqrt(double number) {
        return Math.sqrt(number);
    }

    private static boolean canBuildTriangle(double number1, double number2, double number3){
        double longest = number1;
        double side1 = number2;
        double side2 = number3;

        if (number2 > number1 && number2>number3){
            longest = number2;
            side1 = number1;
            side2=number3;
        }
        if (number3 > number1 && number3 > number2) {
            longest=number3;
            side1=number1;
            side2=number2;
        }

        return side1*side1 + side2*side2 == longest*longest;
    }
}
