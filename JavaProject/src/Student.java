import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JPanel panel1;
    private JTextField txtStname;
    private JButton calButton;
    private JTextField txtMark1;
    private JTextField txtMark2;
    private JTextField txtMark3;
    private JTextField txtTotal;
    private JTextField txtAvarage;
    private JTextField txtGrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int m1,m2,m3,tot;
                 double avg;

                 m1=Integer.parseInt(txtMark1.getText());
                 m2=Integer.parseInt(txtMark2.getText());
                 m3=Integer.parseInt(txtMark3.getText());

                 tot=m1+m2+m3;

                 txtTotal.setText(String.valueOf(tot));

                 avg=tot/3;
                 txtAvarage.setText(String.valueOf(avg));

                 if (avg>=50){
                  txtGrade.setText("Pass");
                 }
                 else
                 {
                     txtGrade.setText("Fail");
                 }
                 }
        });
    }
}
