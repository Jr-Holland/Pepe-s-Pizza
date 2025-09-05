import javax.swing.*;

public class TotalInfo {
    private JPanel totalInfo;
    private JTextArea receiptArea;
    private JPanel receiptPanel;
    private JPanel confirmDenyTextPanel;
    private JLabel isThisCorrectLabel;
    private JPanel confirmDenyButtonPanel;
    private JButton denyButton;
    private JButton confirmButton;

    public JPanel getTotalInfo() {
        return totalInfo;
    }

    public JButton getDenyButton() {
        return denyButton;
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }

    public void displayTotal(PizzaOrder order) {
        StringBuilder sb = new StringBuilder();

        sb.append("Customer Info:\n");
        sb.append("Name: ").append(order.getName()).append("\n");
        sb.append("Address: ").append(order.getAddress()).append("\n");
        sb.append("Phone: ").append(order.getPhone()).append("\n\n");

        sb.append("Pizza Order:\n");
        sb.append("Size: ").append(order.getSize()).append("\n");
        sb.append("Style: ").append(order.getStyle()).append("\n");
        sb.append("Sauce: ").append(order.getSauce()).append("\n");

        if (order.getToppings() != null && !order.getToppings().isEmpty()) {
            sb.append("Toppings: ").append(String.join(", ", order.getToppings())).append("\n");
        } else {
            sb.append("Toppings: None\n");
        }

        receiptArea.setText(sb.toString());
    }
}
