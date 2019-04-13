package loops;

public class ArrayFactory {
    private final int size;

    public ArrayFactory(int size) {
        this.size = size;
    }

    public int[] oneDimension(){
        return new int[size];
    }
    public int[][] twoDimension(){
        return new int[size][size];
    }

}
