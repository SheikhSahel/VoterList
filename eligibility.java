package voterList;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eligibility extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textName;
    private JLabel lblInfo;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    eligibility frame = new eligibility();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public eligibility() {
        setBackground(new Color(44, 255, 62));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(9, 19, 7));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textName = new JTextField();
        textName.setBounds(179, 38, 130, 26);
        contentPane.add(textName);
        textName.setColumns(10);

        textField = new JTextField();
        textField.setBounds(179, 86, 130, 26);
        contentPane.add(textField);
        textField.setColumns(10);

        JTextPane txtpnName = new JTextPane();
        txtpnName.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        txtpnName.setText("Enter Your Name");
        txtpnName.setBounds(20, 38, 139, 16);
        contentPane.add(txtpnName);

        JTextPane txtpnAge = new JTextPane();
        txtpnAge.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        txtpnAge.setText("Enter Your Age");
        txtpnAge.setBounds(20, 96, 113, 16);
        contentPane.add(txtpnAge);

        lblInfo = new JLabel("");
        lblInfo.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        lblInfo.setForeground(Color.WHITE);
        lblInfo.setBounds(44, 215, 300, 20);
        contentPane.add(lblInfo);

        JButton btnOk = new JButton("Ok");
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                String ageText = textField.getText();
                
                try {
                    int age = Integer.parseInt(ageText);
                    if (age >= 18) {
                        lblInfo.setText("Hello " + name + ", You are eligible to vote.");
                    } else {
                        lblInfo.setText("Sorry " + name + ", You are not eligible to vote.");
                    }
                } catch (NumberFormatException ex) {
                    lblInfo.setText("Please enter a valid age.");
                }
            }
        });

        btnOk.setForeground(new Color(252, 7, 0));
        btnOk.setBounds(29, 157, 117, 29);
        contentPane.add(btnOk);

        // Reset button to clear fields
        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textName.setText("");
                textField.setText("");
                lblInfo.setText("");
            }
        });

        btnReset.setForeground(new Color(252, 7, 0));
        btnReset.setBounds(192, 157, 117, 29);
        contentPane.add(btnReset);
    }
}
