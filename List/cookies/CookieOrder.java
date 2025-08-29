public class CookieOrder {

    String flavor;
    int boxQuantity;

    public CookieOrder(String flavor, int boxQuantity) {
        setFlavor(flavor);
        setBoxQuantity(boxQuantity);
    }    

    public String getFlavor() {
        return flavor;
    }

    public int getBoxQuantity() {
        return boxQuantity;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setBoxQuantity(int boxQuantity) {
        this.boxQuantity = boxQuantity;
    }

}