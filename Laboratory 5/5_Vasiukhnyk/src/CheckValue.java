//Excercise 6
public class CheckValue {
    public static void main(String[] args) {
        CheckValue task = new CheckValue();
        System.out.println(task.isWord("Check_World"));
        System.out.println(task.isValidJavaIdentifier("Check_World"));
    }
       public boolean isValidJavaIdentifier(String Value) {
        if (Value == null || Value.isEmpty()) {
            return false;
        }

        int Value1 = Value.codePointAt(0);
        if (!Character.isJavaIdentifierStart(Value1)) {
            return false;
        }

        return Value.codePoints().skip(1).allMatch(Character::isJavaIdentifierPart);
    }
    public boolean isWord(String input) {
        return input.codePoints().allMatch(Character::isAlphabetic);
    }

}