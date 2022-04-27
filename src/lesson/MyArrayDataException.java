package lesson;

public class MyArrayDataException  extends RuntimeException {
    private int line;

    public MyArrayDataException(int line) {
        this.line = line;
    }
}
