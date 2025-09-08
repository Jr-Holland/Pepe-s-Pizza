import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PizzaOrderFrame extends JFrame{
    private CardLayout pizzaApp;
    private JPanel pizzaPanel;
    private Pizza pizza;
    private Order order = new Order();
    private Intro introPanel;
    private CustomerInfo customerPanel;
    private PizzaCustomizerInfo customizerPanel;
    private SizeInfo sizePanel;
    private StyleInfo stylePanel;
    private TotalInfo totalPanel;

    public PizzaOrderFrame() {
        setTitle("Pizza Order App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1150, 750);
        pizzaApp = new CardLayout();
        pizzaPanel = new JPanel(pizzaApp);
        introPanel = new Intro();
        customerPanel = new CustomerInfo();
        sizePanel = new SizeInfo();
        stylePanel = new StyleInfo();
        customizerPanel = new PizzaCustomizerInfo();
        totalPanel = new TotalInfo();

        pizzaPanel.add(introPanel.getIntroScreen(), "Intro");
        pizzaPanel.add(customerPanel.getCustomerInfo(), "Customer");
        pizzaPanel.add(sizePanel.getSizeSelection(), "Size");
        pizzaPanel.add(stylePanel.getStyleInfo(), "Style");
        pizzaPanel.add(customizerPanel.getPizzaCustomizer(), "Customizer");
        pizzaPanel.add(totalPanel.getTotalInfo(), "Total");

        setUpNavigation();
        add(pizzaPanel);
        pizzaApp.show(pizzaPanel, "Intro");
    }

    private void setUpNavigation() {
        introPanel.getPlaceOrderButton().addActionListener(e ->
                pizzaApp.show(pizzaPanel, "Customer")
        );

        customerPanel.getSubmitButton().addActionListener(e -> {
            order.setName(customerPanel.getCustomerNameText().getText());
            order.setAddress(customerPanel.getCustomerAddressText().getText());
            order.setPhone(customerPanel.getCustomerPhoneNumberText().getText());
            pizza = new Pizza();
            pizzaApp.show(pizzaPanel, "Size");
        });

        sizePanel.getSmallPizzaButton().addActionListener(e -> {
            pizza.setSize("Small");
        });
        sizePanel.getMediumPizzaButton().addActionListener(e -> {
            pizza.setSize("Medium");
        });
        sizePanel.getLargePizzaButton().addActionListener(e -> {
            pizza.setSize("Large");
        });
        sizePanel.getXlargePizzaButton().addActionListener(e -> {
            pizza.setSize("X-Large");
        });
        sizePanel.getMoveToStyleButton().addActionListener(e -> {
            pizzaApp.show(pizzaPanel, "Style");
        });
        sizePanel.getGoBackToCustomerButton().addActionListener(e -> {
            pizzaApp.show(pizzaPanel, "Customer");
        });

        stylePanel.getBrooklynPizzaButton().addActionListener(e -> {
            pizza.setStyle("Brooklyn");
        });
        stylePanel.getDeepDishPizzaButton().addActionListener(e -> {
            pizza.setStyle("Deep Dish");
        });
        stylePanel.getPersonalPanPizzaButton().addActionListener(e -> {
            pizza.setStyle("Personal Pan");
        });
        stylePanel.getHandTossedPizzaButton().addActionListener(e -> {
            pizza.setStyle("Hand Tossed");
        });
        stylePanel.getMoveOnToCustomizerButton().addActionListener(e -> {
            pizzaApp.show(pizzaPanel, "Customizer");
        });
        stylePanel.getReturnToSizeInfoButton().addActionListener(e -> {
            pizzaApp.show(pizzaPanel, "Size");
        });

        customizerPanel.getMoveOnToTotalButton().addActionListener(e -> {
            pizza.setSauce(customizerPanel.getSelectedSauce());
            pizza.setSize(sizePanel.getSelectedSize());
            pizza.setStyle(stylePanel.getStyleSelection());
            pizza.setToppings(customizerPanel.getSelectedToppings());
            order.addPizza(pizza);
            totalPanel.displayTotal(order);
            pizzaApp.show(pizzaPanel, "Total");
        });

        customizerPanel.getGoBackToStyleButton().addActionListener(e -> {
            pizzaApp.show(pizzaPanel, "Style");
        });

        customizerPanel.getResetCustomizerButton().addActionListener(e -> {
            customizerPanel.resetSelections();
            pizza.setSauce("");
            pizza.setToppings(new ArrayList<>());
            JOptionPane.showMessageDialog(this, "Selections have been reset.");
        });

        totalPanel.getAnotherOrderButton().addActionListener(e -> {
            pizza = new Pizza();
            pizzaApp.show(pizzaPanel, "Size");
        });

        totalPanel.getConfirmButton().addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Order Confirmed! Thank you for you purchase. It will be delivered in 40 minutes.");
        });
        totalPanel.getDenyButton().addActionListener(e -> {
            pizzaApp.show(pizzaPanel, "Intro");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PizzaOrderFrame().setVisible(true);
        });
    }
}


