import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String name;
    private String address;
    private String phone;
    private List<Pizza> pizzas = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }
    public List<Pizza> getPizzas() {
        return pizzas;
    }
}
