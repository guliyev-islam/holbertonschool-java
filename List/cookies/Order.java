import java.util.ArrayList;

public class Order {

    ArrayList<CookieOrder> cookies;

    public Order() {
        setCookies(new ArrayList<CookieOrder>());
    }

    public ArrayList<CookieOrder> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<CookieOrder> cookies) {
        this.cookies = cookies;
    }

    public void addCookieOrder(CookieOrder cookieOrder) {
        getCookies().add(cookieOrder);
    }

    public int getTotalBoxes() {
        int totalBoxes = 0;
        for (CookieOrder cookie: getCookies()) {
            totalBoxes += cookie.getBoxQuantity();
        }
        return totalBoxes;
    }

    public int removeFlavor(String flavor) {
        int totalBoxes = getTotalBoxes();
        getCookies().removeIf(cookie -> cookie.getFlavor().equals(flavor));
        
        return totalBoxes - getTotalBoxes();
    }
}