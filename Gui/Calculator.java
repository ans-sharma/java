import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
    JFrame frame;
    JButton btnPlus, btnMinus, btnDiv, btnMul, btnMod, btnCls;
    JTextField txtNo1, txtNo2;
    JLabel lResult, lNo1, lNo2, lNoResult;
    Calculator(){
        //frame
        frame = new JFrame("Swing Arithmetics");
        //buttons
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnDiv = new JButton("/");
        btnMul = new JButton("*");
        btnMod = new JButton("%");
        btnCls = new JButton("CLEAR");
        //textfields
        txtNo1 = new JTextField();
        txtNo2 = new JTextField();
        //labels
        lResult = new JLabel("Result");
        lNo1 = new JLabel("First No.");
        lNo2 = new JLabel("Second No.");
        lNoResult = new JLabel("");

        //set labels
        lNo1.setBounds(20, 20, 90, 20);
        lNo2.setBounds(20, 45, 90, 20);
        lResult.setBounds(20, 70, 90, 20);
        lNoResult.setBounds(100, 70, 160, 20);

        //set textfields
        txtNo1.setBounds(100, 20, 160, 20);
        txtNo2.setBounds(100, 45, 160, 20);
        
        //set alignment
        txtNo1.setHorizontalAlignment(4);  //SwingConstants.RIGHT returns (int)4
        txtNo2.setHorizontalAlignment(4);
        lNoResult.setHorizontalAlignment(4);

        //set btn
        btnPlus.setBounds(20, 100, 120, 30);
        btnMinus.setBounds(140, 100, 120, 30);
        btnMul.setBounds(20, 132, 120, 30);
        btnDiv.setBounds(140, 132, 120, 30);
        btnMod.setBounds(20, 164, 120, 30);
        btnCls.setBounds(140, 164, 120, 30);

        //add ActionListsener
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMod.addActionListener(this);
        btnCls.addActionListener(this);


        //frame setting
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //add button
        frame.add(btnPlus);
        frame.add(btnMinus);
        frame.add(btnDiv);
        frame.add(btnMul);
        frame.add(btnMod);
        frame.add(btnCls);
        //add textfield
        frame.add(txtNo1);
        frame.add(txtNo2);
        //add labels
        frame.add(lNo1);
        frame.add(lNo2);
        frame.add(lResult);
        frame.add(lNoResult);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnCls){
            txtNo1.setText("");
            txtNo2.setText("");
            lNoResult.setText("");
        }
        else{
            if(e.getSource()==btnPlus){
                if (numcheck(txtNo1.getText()) && numcheck(txtNo2.getText())){
                    double temp = Double.parseDouble(txtNo1.getText()) + Double.parseDouble(txtNo2.getText());
                    lNoResult.setText(Double.toString(temp));
                }
                else
                    lNoResult.setText("Value Error!");
            }
            if(e.getSource()==btnMinus){
                if (numcheck(txtNo1.getText()) && numcheck(txtNo2.getText())){
                    double temp = Double.parseDouble(txtNo1.getText()) - Double.parseDouble(txtNo2.getText());
                    lNoResult.setText(Double.toString(temp));
                }
                else
                    lNoResult.setText("Value Error!");
            }
            if(e.getSource()==btnDiv){
                if (numcheck(txtNo1.getText()) && numcheck(txtNo2.getText())){
                    double temp = Double.parseDouble(txtNo1.getText()) / Double.parseDouble(txtNo2.getText());
                    lNoResult.setText(Double.toString(temp));
                }
                else
                    lNoResult.setText("Value Error!");
            }
            if(e.getSource()==btnMul){
                if (numcheck(txtNo1.getText()) && numcheck(txtNo2.getText())){
                    double temp = Double.parseDouble(txtNo1.getText()) * Double.parseDouble(txtNo2.getText());
                    lNoResult.setText(Double.toString(temp));
                }
                else
                    lNoResult.setText("Value Error!");
            }
            if(e.getSource()==btnMod){
                if (numcheck(txtNo1.getText()) && numcheck(txtNo2.getText())){
                    double temp = Double.parseDouble(txtNo1.getText()) % Double.parseDouble(txtNo2.getText());
                    lNoResult.setText(Double.toString(temp));
                }
                else
                    lNoResult.setText("Value Error!");
            }
        }
    }
    public static boolean numcheck(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    //driver
    public static void main(String[] args) {
        Calculator cal = new Calculator();
    }

}
