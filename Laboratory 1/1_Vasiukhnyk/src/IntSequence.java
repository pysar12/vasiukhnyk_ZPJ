public interface IntSequence {
    int VariableConstant = 0;

    default boolean hasNext() {
        return true;
    }
    int next();

    static IntSequence of(int... values) {
        return new IntSequence() {
            private int[] sequence = values;
            private int currentElements = 0;
            public boolean hasNext() {
                return currentElements < values.length;
            }

            @Override
            public int next() {
                if (currentElements < sequence.length) {
                    return sequence[currentElements++];
                } else {
                    System.out.println("No more elements in the sequence.");
                    return 0;
                }
            }
        };
    }
}