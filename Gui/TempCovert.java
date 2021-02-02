import java.awt.event.*;
import javax.swing.*;

public class TempCovert extends JFrame implements ActionListener{
    JFrame frame;
    JTextField tempCel;
    JLabel lCel, lFer, lFerResult;
    JButton btnConvert;
    TempCovert(){
        frame = new JFrame();
        tempCel = new JTextField();
        lCel = new JLabel("Temperature in C:");
        lFer = new JLabel("Temperature in F:");
        lFerResult = new JLabel("");
        btnConvert = new JButton("CONVERT");
    }
    public void actionPerformed(ActionEvent e){
        ;
    }

}
