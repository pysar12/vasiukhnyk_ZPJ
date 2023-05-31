public class IntSequenceClass implements IntSequence{
    private int[] Array;
    private int currentElement;

    private IntSequenceClass(int[] sequence) {
        this.Array = sequence;
        this.currentElement = 0;
    }
    public static IntSequenceClass of(int... values){
        return new IntSequenceClass(values);
    }
    @Override
    public int next(){
            if (currentElement < Array.length) {
            return Array[currentElement++];
         } else {
            System.out.println("No more elements in the sequence.");
        }
            return 0;
    }
    public static IntSequence constant(int arguments){
        return new IntSequence(){
            @Override
            public boolean hasNext(){
                return true;
            }
            @Override
            public int next(){
                return arguments;
            }
        };

    }

}
