import javax.swing.*;

public class CustomerInfo {
    private JPanel customerInfo;
    private JPanel customerInfoPanel;
    private JLabel customerNameLabel;
    private JLabel customerAddressLabel;
    private JTextField customerAddressText;
    private JTextField customerNameText;
    private JLabel customerPhoneNumberLabel;
    private JTextField customerPhoneNumberText;
    private JButton submitButton;
    private JPanel submitButtonPanel;

    public JTextField getCustomerNameText() {
        return customerNameText;
    }

    public JTextField getCustomerAddressText() {
        return customerAddressText;
    }

    public JTextField getCustomerPhoneNumberText() {
        return customerPhoneNumberText;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JPanel getCustomerInfo() {
        return customerInfo;
    }
}
