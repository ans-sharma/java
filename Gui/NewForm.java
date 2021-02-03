import java.awt.event.*;
import javax.swing.*;

public class NewForm extends JFrame implements ActionListener{
    JFrame frame;
    JLabel lName, lAdd, lGender, lQuali;
    JTextField txtName, txtAdd;
    JTextArea txtAResult;
    JRadioButton rbGenderM, rbGenderF;
    JComboBox comboQuali;
    JButton btnSubmit;

    NewForm(){
        frame = new JFrame("NewForm");
        lName = new JLabel("Name:");
        lAdd = new JLabel("Address:");
        lGender = new JLabel("Gender:");
        lQuali = new JLabel("Qualification:");
        txtName = new JTextField();
        txtAdd = new JTextField();
        txtAResult = new JTextArea();
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(this);


        String qualiList[] = {"BSc", "BCA", "MCS", "MSc"};
        comboQuali = new JComboBox(qualiList);

        rbGenderM = new JRadioButton("Male");
        rbGenderF = new JRadioButton("Female");


        //set location 
        lName.setBounds(20, 20, 100, 20);
        txtName.setBounds(100, 20, 150, 20);
        lAdd.setBounds(20, 50, 100, 20);
        txtAdd.setBounds(100, 50, 150, 20);
        lGender.setBounds(20, 80, 100, 20);
        rbGenderM.setBounds(20, 100, 80, 20);
        rbGenderF.setBounds(20, 120, 80, 20);
        lQuali.setBounds(20, 150, 100, 20);
        comboQuali.setBounds(20,170,100,20);
        btnSubmit.setBounds(150, 170, 100, 20);
        txtAResult.setBounds(100, 80, 150, 70);

        //btn list
        btnSubmit.addActionListener(this);

        //visibility
        txtAResult.setVisible(false);

        //frame settings
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add
        frame.add(lName);
        frame.add(txtName);
        frame.add(lAdd);
        frame.add(txtAdd);
        frame.add(lGender);
        frame.add(rbGenderM);
        frame.add(rbGenderF);
        frame.add(lQuali);
        frame.add(comboQuali);
        frame.add(btnSubmit);
        frame.add(txtAResult);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnSubmit){
            String temp = "";
            if(txtName.getText().length() != 0)
                temp = temp + txtName.getText() + "\n";
            if(txtAdd.getText().length() != 0)
                temp = temp + txtAdd.getText() + "\n";
            if(rbGenderM.isSelected() && rbGenderF.isSelected())
                ;
            else if(rbGenderM.isSelected())
                temp = temp + rbGenderM.getText() + "\n";
            else if(rbGenderF.isSelected())
                temp = temp + rbGenderF.getText() + "\n";
            temp += comboQuali.getSelectedItem().toString() + "\n";
            txtAResult.setText(temp);
            txtAResult.setVisible(true);
        }
    }
    public static void main(String[] args) {
        NewForm n = new NewForm();
    }
}
