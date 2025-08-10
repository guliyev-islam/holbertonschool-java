public class Square extends Rectangle {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws IllegalArgumentException {
        if (side < 0) {
            throw new IllegalArgumentException("Side must be greater than or equal to 0");
        }
        this.side = side;
        setHeight(side);
        setWidth(side);
    }
    
    
    @Override
    public String toString() {
        
        return String.format("[Square] %.2f", getSide());
    }
}
