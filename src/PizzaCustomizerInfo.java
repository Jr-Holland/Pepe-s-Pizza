import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PizzaCustomizerInfo extends JPanel {
    private JPanel PizzaCustomizer;
    private JPanel sauceSelectionTextPanel;
    private JLabel sauceSelectionLabel;
    private JButton redSauceButton;
    private JButton whiteSauceButton;
    private JButton bbqSauceButton;
    private JPanel toppingSelectionTextPanel;
    private JLabel toppingSelectionLabel;
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
    private JPanel pepperoniSelectionPanel;
    private JPanel baconSelectionPanel;
    private JPanel sausageSelectionPanel;
    private JPanel mushroomSelectionPanel;
    private JPanel hamSelectionPanel;
    private JPanel pineappleSelectionPanel;
    private JPanel blackolivesSelectionPanel;
    private JPanel greenpeppersSelectionPanel;
    private JPanel yellowpeppersSelectionPanel;
    private JPanel anchoviesSelectionPanel;
    private JLabel pepperoniSelectionLabel;
    private JLabel baconSelectionLabel;
    private JLabel sausageSelectionLabel;
    private JLabel mushroomSelectionLabel;
    private JLabel hamSelectionLabel;
    private JLabel pineappleSelectionLabel;
    private JLabel blackolivesSelectionLabel;
    private JLabel greenpeppersSelectionLabel;
    private JLabel yellowpeppersSelectionLabel;
    private JLabel anchoviesSelectionLabel;

    private JButton pepperoniNoneButton;
    private JButton pepperoniLightButton;
    private JButton pepperoniNormalButton;
    private JButton pepperoniExtraButton;

    private JButton baconNoneButton;
    private JButton baconLightButton;
    private JButton baconNormalButton;
    private JButton baconExtraButton;

    private JButton sausageNoneButton;
    private JButton sausageLightButton;
    private JButton sausageNormalButton;
    private JButton sausageExtraButton;

    private JButton mushroomNoneButton;
    private JButton mushroomLightButton;
    private JButton mushroomNormalButton;
    private JButton mushroomExtraButton;

    private JButton hamNoneButton;
    private JButton hamLightButton;
    private JButton hamNormalButton;
    private JButton hamExtraButton;

    private JButton pineappleNoneButton;
    private JButton pineappleLightButton;
    private JButton pineappleNormalButton;
    private JButton pineappleExtraButton;

    private JButton blackolivesNoneButton;
    private JButton blackolivesLightButton;
    private JButton blackolivesNormalButton;
    private JButton blackolivesExtraButton;

    private JButton greenpeppersNoneButton;
    private JButton greenpeppersLightButton;
    private JButton greenpeppersNormalButton;
    private JButton greenpeppersExtraButton;

    private JButton yellowpeppersNoneButton;
    private JButton yellowpeppersLightButton;
    private JButton yellowpeppersNormalButton;
    private JButton yellowpeppersExtraButton;

    private JButton anchoviesNoneButton;
    private JButton anchoviesLightButton;
    private JButton anchoviesNormalButton;
    private JButton anchoviesExtraButton;

    private String selectedSauce;
    private JButton selectedSauceButton;
    private Map<String, JButton> toppingSelections = new HashMap<>();

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

    public JButton getGoBackToStyleButton() {
        return goBackToStyleButton;
    }

    public JButton getResetCustomizerButton() {
        return resetCustomizerButton;
    }

    public JButton getMoveOnToTotalButton() {
        return moveOnToTotalButton;
    }

    private void setupSauceButton(JButton button, String sauce) {
        if (button == null) return;
        button.addActionListener(e -> {
            if (selectedSauceButton != null) {
                selectedSauceButton.setBackground(null);
            }
            button.setBackground(Color.GREEN);
            selectedSauce = sauce;
            selectedSauceButton = button;
        });
    }

    public void resetSelections() {
        if (selectedSauceButton != null) {
            selectedSauceButton.setBackground(null);
        }
        selectedSauce = null;
        selectedSauceButton = null;

        for (Map.Entry<String, JButton> entry : toppingSelections.entrySet()) {
            JButton selected = entry.getValue();
            selected.setBackground(null);
        }
        toppingSelections.clear();
    }

    public PizzaCustomizerInfo() {
        setupSauceButton(redSauceButton, "Red");
        setupSauceButton(whiteSauceButton, "White");
        setupSauceButton(bbqSauceButton, "BBQ");

        selectedSauce = "Red";
        if (redSauceButton != null) {
            redSauceButton.setBackground(Color.GREEN);
            selectedSauceButton = redSauceButton;
        }

        setupToppingGroup("Pepperoni", pepperoniNoneButton, pepperoniLightButton, pepperoniNormalButton, pepperoniExtraButton);
        setupToppingGroup("Sausage", sausageNoneButton, sausageLightButton, sausageNormalButton, sausageExtraButton);
        setupToppingGroup("Bacon", baconNoneButton, baconLightButton, baconNormalButton, baconExtraButton);
        setupToppingGroup("Ham", hamNoneButton, hamLightButton, hamNormalButton, hamExtraButton);
        setupToppingGroup("Pineapple", pineappleNoneButton, pineappleLightButton, pineappleNormalButton, pineappleExtraButton);
        setupToppingGroup("Black Olives", blackolivesNoneButton, blackolivesLightButton, blackolivesNormalButton, blackolivesExtraButton);
        setupToppingGroup("Green Peppers", greenpeppersNoneButton, greenpeppersLightButton, greenpeppersNormalButton, greenpeppersExtraButton);
        setupToppingGroup("Yellow Peppers", yellowpeppersNoneButton, yellowpeppersLightButton, yellowpeppersNormalButton, yellowpeppersExtraButton);
        setupToppingGroup("Mushrooms", mushroomNoneButton, mushroomLightButton, mushroomNormalButton, mushroomExtraButton);
        setupToppingGroup("Anchovies", anchoviesNoneButton, anchoviesLightButton, anchoviesNormalButton, anchoviesExtraButton);
    }

    private void selectSauce(String sauce, JButton button) {
        selectedSauce = sauce;

        redSauceButton.setBackground(null);
        whiteSauceButton.setBackground(null);
        bbqSauceButton.setBackground(null);

        button.setBackground(Color.GREEN);
    }

    public String getSelectedSauce() {
        return selectedSauce;
    }

    private void setupToppingGroup(String toppingName, JButton none, JButton light, JButton normal, JButton extra) {
        if (none == null || light == null || normal == null || extra == null) return;

        JButton[] group = {none, light, normal, extra};

        for (JButton btn : group) {
            btn.addActionListener(e -> {
                for (JButton b : group) {
                    b.setBackground(null);
                }
                btn.setBackground(Color.ORANGE);
                toppingSelections.put(toppingName, btn);
            });
        }

        none.setBackground(Color.ORANGE);
        toppingSelections.put(toppingName, none);
    }

    public List<String> getSelectedToppings() {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, JButton> entry : toppingSelections.entrySet()) {
            String topping = entry.getKey();
            String choice = entry.getValue().getText();

            if (!choice.equalsIgnoreCase("None")) {
                result.add(topping + ": " + choice);
            }
        }
        return result;
    }
}
