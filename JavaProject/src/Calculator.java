import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel panel1;
    private JTextField txtFnum;
    private JTextField txtSnum;
    private JTextField txtOperator;
    private JTextField txtAnswer;
    private JButton calButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public Calculator() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1, num2, Ans = 0;
                String op;

                num1 = Double.parseDouble(txtFnum.getText());
                num2 = Double.parseDouble(txtSnum.getText());
                op = String.valueOf(txtOperator.getText());

                switch (op) {
                    case "+":
                        Ans = num1 + num2;
                        break;
                    case "-":
                        Ans = num1 - num2;
                        break;
                    case "*":
                        Ans = num1 * num2;
                        break;
                    case "/":
                        Ans = num1 / num2;
                        break;
                }
                txtAnswer.setText(String.valueOf(Ans));
            }
        });
    }
}


