import java.awt.event.*;
import javax.swing.*;

public class TempCovert extends JFrame implements ActionListener{
    JFrame frame;
    JTextField tempCel;
    JLabel lCel, lFer, lFerResult, lCelDeg;
    JButton btnConvert;
    TempCovert(){
        frame = new JFrame("TempConvert");
        tempCel = new JTextField();
        lCel = new JLabel("Temperature in C:");
        lFer = new JLabel("Temperature in F:");
        lFerResult = new JLabel("");
        lCelDeg = new JLabel(" degC");
        btnConvert = new JButton("CONVERT");

        //set label
        lCel.setBounds(10, 20, 150, 20);
        lCelDeg.setBounds(200, 20, 50, 20);
        lFer.setBounds(10, 50, 150, 20);
        lFerResult.setBounds(150, 50, 80, 20);

        //set textfield
        tempCel.setBounds(150, 20, 50, 20);

        //set button
        btnConvert.setBounds(100, 80, 100, 30);
        // add listener
        btnConvert.addActionListener(this);

        //main
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add label
        frame.add(lCel);
        frame.add(lFer);
        frame.add(tempCel);
        frame.add(lFerResult);
        frame.add(lFerResult);
        frame.add(btnConvert);
        frame.add(lCelDeg);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnConvert){
            if(numcheck(tempCel.getText())){
                double temp = ((9*Double.parseDouble(tempCel.getText()))/5) + 32; //formula
                lFerResult.setText(Double.toString(temp) + " degF");
            }
            else
                lFerResult.setText("Value Error!");
        }
    }

    public static boolean numcheck(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TempCovert t = new TempCovert();
    }

}
