import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StyleInfo {
    private JPanel styleInfo;
    private JPanel styleSelectionTextPanel;
    private JLabel selectStyleLabel;
    private JPanel styleSelectionButtonPanel;
    private JButton personalPanPizzaButton;
    private JButton handTossedPizzaButton;
    private JButton deepDishPizzaButton;
    private JButton brooklynPizzaButton;
    private JPanel pizzaBuilderButtonPanel;
    private JButton returnToSizeInfoButton;
    private JButton moveOnToCustomizerButton;
    private JButton styleSelectedButton;

    public StyleInfo() {
        ActionListener styleListener = e -> {
            JButton clicked = (JButton) e.getSource();
            if (styleSelectedButton != null) {
                styleSelectedButton.setBackground(null);
            }
            clicked.setBackground(Color.GREEN);
            styleSelectedButton = clicked;
        };

        personalPanPizzaButton.addActionListener(styleListener);
        handTossedPizzaButton.addActionListener(styleListener);
        deepDishPizzaButton.addActionListener(styleListener);
        brooklynPizzaButton.addActionListener(styleListener);
    }

    public JPanel getStyleInfo() {
        return styleInfo;
    }

    public JButton getPersonalPanPizzaButton() {
        return personalPanPizzaButton;
    }

    public JButton getHandTossedPizzaButton() {
        return handTossedPizzaButton;
    }

    public JButton getDeepDishPizzaButton() {
        return deepDishPizzaButton;
    }

    public JButton getBrooklynPizzaButton() {
        return brooklynPizzaButton;
    }

    public JButton getReturnToSizeInfoButton() {
        return returnToSizeInfoButton;
    }

    public JButton getMoveOnToCustomizerButton() {
        return moveOnToCustomizerButton;
    }

    public String getStyleSelection() {
        if (styleSelectedButton == null) {
            return null;
        }
        return styleSelectedButton.getText();
    }
}
