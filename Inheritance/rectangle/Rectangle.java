public class Rectangle extends GeometricShape {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) throws IllegalArgumentException {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than or equal to 0");
        }

        this.width = width;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (width < 0) {
            throw new IllegalArgumentException("Height must be greater than or equal to 0");
        }
        
        this.height = height;
    }
    
    
}
