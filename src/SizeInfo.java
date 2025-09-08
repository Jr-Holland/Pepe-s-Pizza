import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

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
    private JButton sizeSelectedButton;

    public SizeInfo() {
        ActionListener sizeListener = e -> {
            JButton clicked = (JButton) e.getSource();
            if (sizeSelectedButton != null) {
                sizeSelectedButton.setBackground(null);
            }
            clicked.setBackground(Color.GREEN);
            sizeSelectedButton = clicked;
        };

        smallPizzaButton.addActionListener(sizeListener);
        mediumPizzaButton.addActionListener(sizeListener);
        largePizzaButton.addActionListener(sizeListener);
        xlargePizzaButton.addActionListener(sizeListener);
    }

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

    public String getSelectedSize() {
        if (sizeSelectedButton == null) {
            return null;
        }
        return sizeSelectedButton.getText();
    }
}
