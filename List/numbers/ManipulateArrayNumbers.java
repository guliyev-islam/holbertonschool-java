import java.util.List;

public class ManipulateArrayNumbers {
    static public int findNumberPositio(List<Integer> numbers, Integer number) {
        return numbers.indexOf(number);
    }

    static public void addNumber(List<Integer> numbers, Integer number) throws Exception {
        if (findNumberPositio(numbers, number) != -1) {
            throw new Exception("Number already in the list");
        }

        numbers.add(number);
    }

    static public void removeNumber(java.util.List<Integer> numbers, Integer number) throws Exception {
        if (findNumberPositio(numbers, number) == -1) {
            throw new Exception("Number not found in the list");
        }

        numbers.remove(number);
    }

    static public void replaceNumber(java.util.List<Integer> numbers, Integer numberToReplace, Integer replacementNumber) {
        if (!numbers.contains(numberToReplace)) {
            numbers.add(replacementNumber);
            return;
        }

        numbers.set(numbers.indexOf(numberToReplace), replacementNumber);
    }
}