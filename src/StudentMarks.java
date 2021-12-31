import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMarks {
    private JTextField StudentName;
    private JTextField Marks1Field;
    private JTextField Marks2Field;
    private JTextField Marks3Field;
    private JTextField Marks4Field;
    private JButton Calculation;
    private JTextField TotalMarksField;
    private JTextField AverageMarksField;
    private JTextField CalculatedField;
    private JTextField GradeField;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentMarks");
        frame.setContentPane(new StudentMarks().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentMarks() {
        Calculation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1, m2, m3, m4, total;
                double avg;

                m1 = Integer.parseInt(Marks1Field.getText());
                m2 = Integer.parseInt(Marks2Field.getText());
                m3 = Integer.parseInt(Marks3Field.getText());
                m4 = Integer.parseInt(Marks4Field.getText());

                total = m1 + m2 + m3 + m4;

                TotalMarksField.setText(String.valueOf(total));

                avg = total/4;
                AverageMarksField.setText(String.valueOf(avg));

                if (avg >= 50) {
                    GradeField.setBackground(Color.green);
                    GradeField.setText("Pass");
                }
                else{
                    GradeField.setBackground(Color.red);
                    GradeField.setText("Failed");
                }

            }
        });
    }
}
