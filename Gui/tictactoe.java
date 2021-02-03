import java.awt.event.*;
import javax.swing.*;

public class tictactoe extends JFrame implements ActionListener {
    JFrame frame;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnReset;
    JLabel lResult;
    int moveCount = 0;

    tictactoe() {
        frame = new JFrame();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btnReset = new JButton("RESET");

        lResult = new JLabel();

        btn1.setBounds(0, 0, 50, 50);
        btn2.setBounds(50, 0, 50, 50);
        btn3.setBounds(100, 0, 50, 50);
        btn4.setBounds(0, 50, 50, 50);
        btn5.setBounds(50, 50, 50, 50);
        btn6.setBounds(100, 50, 50, 50);
        btn7.setBounds(0, 100, 50, 50);
        btn8.setBounds(50, 100, 50, 50);
        btn9.setBounds(100, 100, 50, 50);
        btnReset.setBounds(170, 50, 90, 50);

        lResult.setBounds(55, 150, 100, 50);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnReset.addActionListener(this);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btnReset);
        frame.add(lResult);
    }

    public void actionPerformed(ActionEvent e) {
        ++moveCount;
        if (e.getSource() == btnReset) {
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");

            // enable
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);

            lResult.setText("");
            moveCount = 0;
        }
        if (moveCount % 2 == 0) {
            if (e.getSource() == btn1)
                if (btn1.getText() != "X" && btn1.getText() != "O")
                    btn1.setText("O");
                else
                    --moveCount;
            else if (e.getSource() == btn2)
                if (btn2.getText() != "X" && btn2.getText() != "O")
                    btn2.setText("O");
                else
                    --moveCount;
            else if (e.getSource() == btn3)
                if (btn3.getText() != "X" && btn3.getText() != "O")
                    btn3.setText("O");
                else
                    --moveCount;
            else if (e.getSource() == btn4)
                if (btn4.getText() != "X" && btn4.getText() != "O")
                    btn4.setText("O");
                else
                    --moveCount;
            else if (e.getSource() == btn5)
                if (btn5.getText() != "X" && btn5.getText() != "O")
                    btn5.setText("O");
                else
                    --moveCount;
            else if (e.getSource() == btn6)
                if (btn6.getText() != "X" && btn6.getText() != "O")
                    btn6.setText("O");
                else
                    --moveCount;
            else if (e.getSource() == btn7)
                if (btn7.getText() != "X" && btn7.getText() != "O")
                    btn7.setText("O");
                else
                    --moveCount;
            else if (e.getSource() == btn8)
                if (btn8.getText() != "X" && btn8.getText() != "O")
                    btn8.setText("O");
                else
                    --moveCount;
            else if (e.getSource() == btn9)
                if (btn9.getText() != "X" && btn9.getText() != "O")
                    btn9.setText("O");
                else
                    --moveCount;
        } else {
            if (e.getSource() == btn1)
                if (btn1.getText() != "X" && btn1.getText() != "O")
                    btn1.setText("X");
                else
                    --moveCount;
            else if (e.getSource() == btn2)
                if (btn2.getText() != "X" && btn2.getText() != "O")
                    btn2.setText("X");
                else
                    --moveCount;
            else if (e.getSource() == btn3)
                if (btn3.getText() != "X" && btn3.getText() != "O")
                    btn3.setText("X");
                else
                    --moveCount;
            else if (e.getSource() == btn4)
                if (btn4.getText() != "X" && btn4.getText() != "O")
                    btn4.setText("X");
                else
                    --moveCount;
            else if (e.getSource() == btn5)
                if (btn5.getText() != "X" && btn5.getText() != "O")
                    btn5.setText("X");
                else
                    --moveCount;
            else if (e.getSource() == btn6)
                if (btn6.getText() != "X" && btn6.getText() != "O")
                    btn6.setText("X");
                else
                    --moveCount;
            else if (e.getSource() == btn7)
                if (btn7.getText() != "X" && btn7.getText() != "O")
                    btn7.setText("X");
                else
                    --moveCount;
            else if (e.getSource() == btn8)
                if (btn8.getText() != "X" && btn8.getText() != "O")
                    btn8.setText("X");
                else
                    --moveCount;
            else if (e.getSource() == btn9)
                if (btn9.getText() != "X" && btn9.getText() != "O")
                    btn9.setText("X");
                else
                    --moveCount;
        }
        if (moveCount == 9) {
            disableAllBtn();
            lResult.setText("Draw");
        }
        winnerCheck();
    }

    void winnerCheck() {
        for (int i = 1; i <= 8; i++) {
            String connect = "";
            switch (i) {
                case 1:
                    connect = btn1.getText() + btn2.getText() + btn3.getText();
                    break;
                case 2:
                    connect = btn4.getText() + btn5.getText() + btn6.getText();
                    break;
                case 3:
                    connect = btn7.getText() + btn8.getText() + btn9.getText();
                    break;
                case 4:
                    connect = btn1.getText() + btn4.getText() + btn7.getText();
                    break;
                case 5:
                    connect = btn2.getText() + btn5.getText() + btn8.getText();
                    break;
                case 6:
                    connect = btn3.getText() + btn6.getText() + btn9.getText();
                    break;
                case 7:
                    connect = btn1.getText() + btn5.getText() + btn9.getText();
                    break;
                case 8:
                    connect = btn3.getText() + btn5.getText() + btn7.getText();
                    break;
            }
            if (connect.equals("XXX")) {
                lResult.setText("X Wins");
                disableAllBtn();
            } else if (connect.equals("OOO")) {
                lResult.setText("O Wins");
                disableAllBtn();
            }
        }
    }

    void disableAllBtn() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }

    public static void main(String[] args) {
        tictactoe ttt = new tictactoe();
    }
}
