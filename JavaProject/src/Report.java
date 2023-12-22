import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Report {
    private JPanel panel1;
    private JTextField txtFname;
    private JTextField txtSname;
    private JTextField txtFaculty;
    private JTextField txtDepartment;
    private JTextField txtSub1;
    private JTextField txtMarks1;
    private JTextField txtCredit1;
    private JTextField txtSub2;
    private JTextField txtCredit2;
    private JTextField txtMarks2;
    private JTextField txtSub3;
    private JTextField txtMarks3;
    private JTextField txtCredit3;
    private JButton genarateButton;
    private JTextField txtDpt;
    private JTextField txtFac;
    private JTextField txtName;
    private JTextField txtSubj2;
    private JTextField txtSubj1;
    private JTextField txtGPA;
    private JTextField txtSubj3;
    private JTextField txtClass;
    private JPanel Main;
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        JFrame frame = new JFrame("Report");
        frame.setContentPane(new Report().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Report() {
        genarateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   double m1,m2,m3,GPV1=0,GPV2=0,GPV3=0,GPA;
                   int C1,C2,C3;
                   String Fname,Sname,Faculty,Department,Sub1,Sub2,Sub3,Dpt,Fac,Name,Subj1,Subj2,Subj3,Class;

                   //Getting Informaions
                   Fname=String.valueOf(txtFname.getText());
                   Sname=String.valueOf(txtSname.getText());
                   Department=String.valueOf(txtDepartment.getText());
                   Faculty=String.valueOf(txtFaculty.getText());

                   Sub1=String.valueOf(txtSub1.getText());
                   Sub2=String.valueOf(txtSub2.getText());
                   Sub2=String.valueOf(txtSub3.getText());

                   C1=Integer.parseInt(txtCredit1.getText());
                   C2=Integer.parseInt(txtCredit2.getText());
                   C3=Integer.parseInt(txtCredit3.getText());


                   m1=Double.parseDouble(txtMarks1.getText());
                   m2=Double.parseDouble(txtMarks2.getText());
                   m3=Double.parseDouble(txtMarks3.getText());

                   txtName.setText(String.valueOf(Fname+Sname));
                   txtDpt.setText(String.valueOf(Department));
                   txtFac.setText(String.valueOf(Faculty));

                 //Subject1 grade
                   if (m1<=100 && m1>=91){
                       txtSubj1.setText("A+");
                       GPV1=4*C1;
                   }
                   else if (m1<=90 && m1>=85){
                       txtSubj1.setText("A");
                       GPV1=4*C1;
                   }
                   else if (m1<=84 && m1>=80){
                       txtSubj1.setText("A-");
                       GPV1=3.7*C1;
                   }
                   else if (m1<=79 && m1>=75){
                       txtSubj1.setText("B+");
                       GPV1=3.3*C1;
                   }
                   else if (m1<=74 && m1>=70){
                       txtSubj1.setText("B");
                       GPV1=3*C1;
                   }
                   else if (m1<=69 && m1>=65){
                       txtSubj1.setText("B-");
                       GPV1=2.7*C1;
                   }
                   else if (m1<=64 && m1>=60){
                       txtSubj1.setText("C+");
                       GPV1=2.3*C1;
                   }
                   else if (m1<=59 && m1>=55){
                       txtSubj1.setText("C");
                       GPV1=2*C1;
                   }
                   else if (m1<=54 && m1>=50){
                       txtSubj1.setText("C-");
                       GPV1=1.7*C1;
                   }
                   else if (m1<=49 && m1>=45){
                       txtSubj1.setText("D+");
                       GPV1=1.3*C1;
                   }
                   else if (m1<=44 && m1>=40){
                       txtSubj1.setText("D");
                       GPV1=1*C1;
                   }
                   else{
                       txtSubj1.setText("E");
                   }

                   //Subject2 grade

                if (m2<=100 && m2>=91){
                    txtSubj2.setText("A+");
                    GPV2=4*C1;
                }
                else if (m2<=90 && m2>=85){
                    txtSubj2.setText("A");
                    GPV2=4*C1;
                }
                else if (m2<=84 && m2>=80){
                    txtSubj2.setText("A-");
                    GPV2=3.7*C1;
                }
                else if (m2<=79 && m2>=75){
                    txtSubj2.setText("B+");
                    GPV2=3.3*C1;
                }
                else if (m2<=74 && m2>=70){
                    txtSubj2.setText("B");
                    GPV2=3*C1;
                }
                else if (m2<=69 && m2>=65){
                    txtSubj2.setText("B-");
                    GPV2=2.7*C1;
                }
                else if (m2<=64 && m2>=60){
                    txtSubj2.setText("C+");
                    GPV2=2.3*C1;
                }
                else if (m2<=59 && m2>=55){
                    txtSubj2.setText("C");
                    GPV2=2*C1;
                }
                else if (m2<=54 && m2>=50){
                    txtSubj2.setText("C-");
                    GPV2=1.7*C1;
                }
                else if (m2<=49 && m2>=45){
                    txtSubj2.setText("D+");
                    GPV2=1.3*C1;
                }
                else if (m2<=44 && m2>=40){
                    txtSubj2.setText("D");
                    GPV2=1*C1;
                }
                else{
                    txtSubj2.setText("E");
                }

                //Subject3 grade
                if (m3<=100 && m3>=91){
                    txtSubj3.setText("A+");
                    GPV3=4*C1;
                }
                else if (m3<=90 && m3>=85){
                    txtSubj3.setText("A");
                    GPV3=4*C1;
                }
                else if (m3<=84 && m3>=80){
                    txtSubj3.setText("A-");
                    GPV3=3.7*C1;
                }
                else if (m3<=79 && m3>=75){
                    txtSubj3.setText("B+");
                    GPV3=3.3*C1;
                }
                else if (m3<=74 && m3>=70){
                    txtSubj3.setText("B");
                    GPV3=3*C1;
                }
                else if (m3<=69 && m3>=65){
                    txtSubj3.setText("B-");
                    GPV3=2.7*C1;
                }
                else if (m3<=64 && m3>=60){
                    txtSubj3.setText("C+");
                    GPV3=2.3*C1;
                }
                else if (m3<=59 && m3>=55){
                    txtSubj3.setText("C");
                    GPV3=2*C1;
                }
                else if (m3<=54 && m3>=50){
                    txtSubj3.setText("C-");
                    GPV3=1.7*C1;
                }
                else if (m3<=49 && m3>=45){
                    txtSubj3.setText("D+");
                    GPV3=1.3*C1;
                }
                else if (m3<=44 && m3>=40){
                    txtSubj3.setText("D");
                    GPV3=1*C1;
                }
                else{
                    txtSubj3.setText("E");
                }

                //GPA Calculation
               GPA=(GPV1+GPV2+GPV3)/(C1+C2+C3);
                txtGPA.setText(df.format(GPA));


                //Current Class
                if (GPA>=3.70){
                    txtClass.setText("First Class");
                }
                else if (GPA>=3.30 && GPA<3.70){
                    txtClass.setText("Second Class Upper Division");
                }
                else if (GPA>=3.00 && GPA<=3.30){
                    txtClass.setText("Second Class Lower Division");
                }
                else if (GPA>2.00 && GPA<3.00){
                    txtClass.setText("Pass");
                }
                else {
                    txtClass.setText("Fail");
                }

            }
        });
    }
}
