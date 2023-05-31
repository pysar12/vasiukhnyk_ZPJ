import java.math.BigInteger;

public class SquereSequence implements Sequence<BigInteger> {

    private BigInteger current = BigInteger.ZERO;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        current = current.add(BigInteger.ONE);
        return current.multiply(current);
    }
}
