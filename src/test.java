import objects.MyNumber;
import loops.ArrayFactory;

public class test {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(4);
        ArrayFactory arrayFactory = new ArrayFactory(5);
        arrayFactory.twoDimension();
        System.out.println();

        System.out.println(myNumber.isEven());
        System.out.println(myNumber.pow(myNumber));
        System.out.println(myNumber.add(myNumber));
    }
}
