public class DigitSequence implements Iterator <Integer> {
    //Exercise 7
    private int number;
    public DigitSequence(int n) {
        number = n;
    }
    public boolean hasNext() {
        return number != 0;
    }

    public Integer next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rest() {
        return number;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

    public static void main(String[] args) {
        DigitSequence numbers = new DigitSequence(25);
        while (numbers.hasNext()) {
            System.out.println(numbers.next());
        }
    }
}