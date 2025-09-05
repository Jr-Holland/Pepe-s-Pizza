import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private String name;
    private String address;
    private String phone;
    private String size;
    private String style;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getStyle() {
        return style;
    }

    public String getSize() {
        return size;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
