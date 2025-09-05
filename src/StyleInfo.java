import javax.swing.*;

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
}
