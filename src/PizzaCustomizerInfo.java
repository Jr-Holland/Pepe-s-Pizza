import javax.swing.*;

public class PizzaCustomizerInfo extends JPanel {
    private JPanel PizzaCustomizer;
    private JPanel sauceSelectionTextPanel;
    private JLabel sauceSelectionLabel;
    private JButton redSauceButton;
    private JButton whiteSauceButton;
    private JButton bbqSauceButton;
    private JPanel toppingSelectionTextPanel;
    private JLabel toppingSelectionLabel;
    private JPanel toppingSelectionCheckPanel;
    private JPanel sauceSelectionButtonPanel;
    private JCheckBox pepperoniBox;
    private JCheckBox sausageBox;
    private JCheckBox baconBox;
    private JCheckBox blackOlivesButton;
    private JCheckBox greenPeppersBox;
    private JCheckBox hamBox;
    private JCheckBox pineappleBox;
    private JPanel moveToTotalPanel;
    private JButton goBackToStyleButton;
    private JButton resetCustomizerButton;
    private JButton moveOnToTotalButton;
    private String selectedSauce;

    public JPanel getPizzaCustomizer() {
        return PizzaCustomizer;
    }

    public JButton getRedSauceButton() {
        return redSauceButton;
    }

    public JButton getWhiteSauceButton() {
        return whiteSauceButton;
    }

    public JButton getBbqSauceButton() {
        return bbqSauceButton;
    }

    public JCheckBox getPepperoniBox() {
        return pepperoniBox;
    }

    public JCheckBox getSausageBox() {
        return sausageBox;
    }

    public JCheckBox getBaconBox() {
        return baconBox;
    }

    public JCheckBox getBlackOlivesButton() {
        return blackOlivesButton;
    }

    public JCheckBox getGreenPeppersBox() {
        return greenPeppersBox;
    }

    public JCheckBox getHamBox() {
        return hamBox;
    }

    public JCheckBox getPineappleBox() {
        return pineappleBox;
    }

    public JButton getGoBackToStyleButton() {
        return goBackToStyleButton;
    }

    public JButton getResetCustomizerButton() {
        return resetCustomizerButton;
    }

    public JButton getMoveOnToTotalButton() {
        return moveOnToTotalButton;
    }

    public void resetSelections() {
        redSauceButton.setSelected(false);
        whiteSauceButton.setSelected(false);
        bbqSauceButton.setSelected(false);

        pepperoniBox.setSelected(false);
        sausageBox.setSelected(false);
        baconBox.setSelected(false);
        blackOlivesButton.setSelected(false);
        greenPeppersBox.setSelected(false);
        hamBox.setSelected(false);
        pineappleBox.setSelected(false);
    }

    public java.util.List<String> getSelectedToppings() {
        java.util.List<String> toppings = new java.util.ArrayList<>();

        if (pepperoniBox.isSelected()) toppings.add("Pepperoni");
        if (sausageBox.isSelected()) toppings.add("Sausage");
        if (baconBox.isSelected()) toppings.add("Bacon");
        if (blackOlivesButton.isSelected()) toppings.add("Black Olives");
        if (greenPeppersBox.isSelected()) toppings.add("Green Peppers");
        if (hamBox.isSelected()) toppings.add("Ham");
        if (pineappleBox.isSelected()) toppings.add("Pineapple");

        return toppings;
    }

    public PizzaCustomizerInfo() {
        redSauceButton.addActionListener(e -> selectedSauce = "Red");
        whiteSauceButton.addActionListener(e -> selectedSauce = "White");
        bbqSauceButton.addActionListener(e -> selectedSauce = "BBQ");
    }

    public String getSelectedSauce() {
        return selectedSauce;
    }
}
