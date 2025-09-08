import javax.swing.*;
import java.util.List;

public class TotalInfo {
    private JPanel totalInfo;
    private JTextArea receiptArea;
    private JPanel receiptPanel;
    private JPanel confirmDenyTextPanel;
    private JLabel isThisCorrectLabel;
    private JPanel confirmDenyButtonPanel;
    private JButton denyButton;
    private JButton confirmButton;
    private JButton anotherOrderButton;

    public JPanel getTotalInfo() {
        return totalInfo;
    }

    public JButton getDenyButton() {
        return denyButton;
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }

    public JButton getAnotherOrderButton() {
        return anotherOrderButton;
    }

    public void displayTotal(Order order) {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(order.getName()).append("\n");
        sb.append("Address: ").append(order.getAddress()).append("\n");
        sb.append("Phone: ").append(order.getPhone()).append("\n\n");

        int count = 1;
        for (Pizza pizza : order.getPizzas()) {
            sb.append("Pizza ").append(count++).append(": ")
                    .append(pizza.toString()).append("\n");
        }

        receiptArea.setText(sb.toString());
    }

    public void updateReceipt(String name, String phone, List<Pizza> pizzas) {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(name).append("\n");
        sb.append("Phone: ").append(phone).append("\n\n");

        int count = 1;
        for (Pizza pizza : pizzas) {
            sb.append("Pizza #").append(count++).append(":\n");
            sb.append(pizza.formatForReceipt()).append("\n");
        }

        sb.append("Total Pizzas: ").append(pizzas.size()).append("\n");
        receiptArea.setText(sb.toString());
    }
}
