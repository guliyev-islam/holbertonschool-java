public class PositiveInteger {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue (int value) throws IllegalArgumentException {    
        if (value < 0) throw new IllegalArgumentException("Value is not a positive integer");
        this.value = value;
    }

    public void setValor (int value) throws IllegalArgumentException {    
        if (value < 0) throw new IllegalArgumentException("Value is not a positive integer");
        this.value = value;
    }

    public PositiveInteger(int value) throws IllegalArgumentException {
        setValue(Integer.valueOf(value));
    }

    public PositiveInteger(String value) throws IllegalArgumentException{
        setValue(Integer.valueOf(value));
    }

    public boolean isPrime() {
            if (getValue() <= 1) return false;

            for (int i = 2; i <= Math.sqrt(value); i++) {
                if (getValue() % i == 0) return false;
            }

            return true;
    }
}