import java.awt.event.*;
import javax.swing.*;

class SimpleJavaForm extends JFrame implements ActionListener{
    JFrame frame;
    JButton btnReset, btnSubmit;
    JTextField txtName, txtRoll, txtMsg;
    JLabel lName, lRoll, lResult;
    SimpleJavaForm(){
        frame = new JFrame("SimpleJavaForm");
        btnReset = new JButton("Reset");
        btnSubmit = new JButton("Submit");
        txtName = new JTextField();
        txtRoll = new JTextField();
        txtMsg = new JTextField();
        lName = new JLabel("Name:");
        lRoll = new JLabel("Roll:");
        lResult = new JLabel("Result:");

        lName.setBounds(60,50,90,20);
        txtName.setBounds(100,50,150,20);
        lRoll.setBounds(70,80,90,20);
        txtRoll.setBounds(100,80,150,20);
        lResult.setBounds(55,140,90,20);
        lResult.setVisible(false);
        txtMsg.setBounds(100,140,150,20);
        txtMsg.setVisible(false);

        btnReset.setBounds(100,110,73,20);
        btnSubmit.setBounds(177,110,73,20);
        btnReset.addActionListener(this);
        btnSubmit.addActionListener(this);

        frame.setSize(400,400);
        frame.add(txtName);
        frame.add(txtRoll);
        frame.add(btnReset);
        frame.add(btnSubmit);
        frame.add(txtMsg);

        frame.add(lName);
        frame.add(lRoll);
        frame.add(lResult);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnReset){
            txtName.setText("");
            txtRoll.setText("");
            txtMsg.setVisible(false);
            lResult.setVisible(false);
        }
        if(e.getSource()==btnSubmit){
            System.out.println(txtName.getText());
            if(txtName.getText() == "" || txtRoll.getText() == ""){
                System.out.println("True");
            }
            else{
                txtMsg.setVisible(true);
                lResult.setVisible(true);
                txtMsg.setText(txtRoll.getText() + "," + txtName.getText());
            }
        }
    }

    public static void main(String[] args) {
        SimpleJavaForm form = new SimpleJavaForm();
    }
}
