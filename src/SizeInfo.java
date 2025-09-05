import javax.swing.*;

public class SizeInfo {
    private JPanel sizeSelection;
    private JPanel selectSizeTextPanel;
    private JLabel selectPizzaSizeLabel;
    private JPanel selectSizeButtonPanel;
    private JButton smallPizzaButton;
    private JButton xlargePizzaButton;
    private JButton mediumPizzaButton;
    private JButton largePizzaButton;
    private JPanel forwardBackwardPanel;
    private JButton moveToStyleButton;
    private JButton goBackToCustomerButton;

    public JPanel getSizeSelection() {
        return sizeSelection;
    }

    public JButton getSmallPizzaButton() {
        return smallPizzaButton;
    }

    public JButton getXlargePizzaButton() {
        return xlargePizzaButton;
    }

    public JButton getMediumPizzaButton() {
        return mediumPizzaButton;
    }

    public JButton getLargePizzaButton() {
        return largePizzaButton;
    }

    public JButton getGoBackToCustomerButton() {
        return goBackToCustomerButton;
    }

    public JButton getMoveToStyleButton() {
        return moveToStyleButton;
    }
}
