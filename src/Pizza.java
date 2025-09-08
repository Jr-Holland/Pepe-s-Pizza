import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String style;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

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

    @Override
    public String toString() {
        return size + " " + style + " with " + sauce + ", " + String.join(", ", toppings);
    }

    public String formatForReceipt() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append(" ").append(style).append(" Pizza\n");
        sb.append("Sauce: ").append(sauce).append("\n");
        if (toppings.isEmpty()) {
            sb.append("Toppings: None\n");
        } else {
            sb.append("Toppings:\n");
            for (String t : toppings) {
                sb.append("   - ").append(t).append("\n");
            }
        }
        return sb.toString();
    }
}
