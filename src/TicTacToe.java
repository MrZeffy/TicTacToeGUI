import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame{
    private JPanel TicTacToe;
    private JPanel secondPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button6;
    private JButton button5;
    private JButton button4;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton RESETButton;
    private JButton QUITButton;
    private JLabel jblPlayerX;
    private JLabel jblPlayerO;


    TicTacToe(){
        add(TicTacToe);
        setSize(1200,600);
        setLocationRelativeTo(null);

        QUITButton.addActionListener(e -> setQUITButton());
        button1.addActionListener(e -> setButton1());
        button2.addActionListener(e -> setButton2());
        button3.addActionListener(e -> setButton3());
        button4.addActionListener(e -> setButton4());
        button5.addActionListener(e -> setButton5());
        button6.addActionListener(e -> setButton6());
        button7.addActionListener(e -> setButton7());
        button8.addActionListener(e -> setButton8());
        button9.addActionListener(e -> setButton9());
        RESETButton.addActionListener(e -> setRESETButton());
    }

    //variables for game
    private String valueToEnter = "X";
    private int xCount=0;
    private int oCount=0;

    // for printing score
    private void gameScore(){
        jblPlayerX.setText(String.valueOf(xCount));
        jblPlayerO.setText(String.valueOf(oCount));
    }

    //RESET SCORES:
    private void setRESETButton(){
        xCount=0;
        oCount=0;
        gameScore();
        buttonsReset();
    }


    //Buttons reset:
    private void buttonsReset(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }


    //Check if winning:
    private void winningGame(){
        String input1 = button1.getText();
        String input2 = button2.getText();
        String input3 = button3.getText();

        String input4 = button4.getText();
        String input5 = button5.getText();
        String input6 = button6.getText();

        String input7 = button7.getText();
        String input8 = button8.getText();
        String input9 = button9.getText();

        //ROW X 1:
        if (input1.equals("X") && input2.equals("X") && input3.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount+=1;
            buttonsReset();
        }

        //ROW O 1:
        if (input1.equals("O") && input2.equals("O") && input3.equals("O")){
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount+=1;
            buttonsReset();
        }

        //ROW X 2:
        if (input4.equals("X") && input5.equals("X") && input6.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount+=1;
            buttonsReset();
        }

        //ROW O 2:
        if (input4.equals("O") && input5.equals("O") && input6.equals("O")){
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount+=1;
            buttonsReset();
        }

        //ROW X 3:
        if (input7.equals("X") && input8.equals("X") && input9.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount+=1;
            buttonsReset();
        }

        //ROW O 3:
        if (input7.equals("O") && input8.equals("O") && input9.equals("O")){
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount+=1;
            buttonsReset();
        }

        //ALL rows done

        //COL start

        //COL O 3:
        if (input3.equals("O") && input6.equals("O") && input9.equals("O")){
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount+=1;
            buttonsReset();
        }

        //COL X 3:
        if (input3.equals("X") && input6.equals("X") && input9.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount+=1;
            buttonsReset();
        }

        //COL O 2:
        if (input2.equals("O") && input5.equals("O") && input8.equals("O")){
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount+=1;
            buttonsReset();
        }

        //COL X 2:
        if (input2.equals("X") && input5.equals("X") && input8.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount+=1;
            buttonsReset();
        }

        //COL O 1:
        if (input1.equals("O") && input4.equals("O") && input7.equals("O")){
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount+=1;
            buttonsReset();
        }

        //COL X 1:
        if (input1.equals("X") && input4.equals("X") && input7.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount+=1;
            buttonsReset();
        }

        //DIAGONAL PRIMARY X
        if (input1.equals("X") && input5.equals("X") && input9.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount+=1;
            buttonsReset();
        }

        //DIAGONAL PRIMARY O
        if (input1.equals("O") && input5.equals("O") && input9.equals("O")){
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount+=1;
            buttonsReset();
        }

        //DIAGONAL SECONDARY X
        if (input3.equals("X") && input5.equals("X") && input7.equals("X")){
            JOptionPane.showMessageDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount+=1;
            buttonsReset();
        }

        //DIAGONAL SECONDARY O
        if (input3.equals("O") && input5.equals("O") && input7.equals("O")){
            JOptionPane.showMessageDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount+=1;
            buttonsReset();
        }

        gameScore();
        if (!input1.isEmpty()  && !input2.isEmpty()  && !input3.isEmpty()  && !input4.isEmpty()  && !input5.isEmpty()  && !input6.isEmpty()  && !input7.isEmpty()  && !input8.isEmpty()  && !input9.isEmpty()){
            buttonsReset();
        }
    }



    //button 1 action
    private void setButton1(){

        button1.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button1.setForeground(Color.GREEN);
        }else {
            button1.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();
    }

    //button 2 action
    private void setButton2(){
        button2.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button2.setForeground(Color.GREEN);
        }else {
            button2.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();

    }

    //button 3 action
    private void setButton3(){
        button3.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button3.setForeground(Color.GREEN);
        }else {
            button3.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();
    }

    // button 4 action
    private void setButton4(){
        button4.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button4.setForeground(Color.GREEN);
        }else {
            button4.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();
    }

    // button 5 action
    private void setButton5(){
        button5.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button5.setForeground(Color.GREEN);
        }else {
            button5.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();
    }

    // button 6 action
    private void setButton6(){
        button6.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button6.setForeground(Color.GREEN);
        }else {
            button6.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();
    }

    // button 7 action
    private void setButton7(){
        button7.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button7.setForeground(Color.GREEN);
        }else {
            button7.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();
    }

    // button 8 action
    private void setButton8(){
        button8.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button8.setForeground(Color.GREEN);
        }else {
            button8.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();
    }

    // button 9 action
    private void setButton9(){
        button9.setText(valueToEnter);
        if (valueToEnter.equalsIgnoreCase("X")){
            button9.setForeground(Color.GREEN);
        }else {
            button9.setForeground(Color.BLUE);
        }
        winningGame();
        changePlayer();
    }

    //Switching players
    private void changePlayer(){
        if (valueToEnter.equalsIgnoreCase("X")){
            valueToEnter = "O";
        }else {
            valueToEnter = "X";
        }
    }



    //Exit button
    private void setQUITButton(){
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit?","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }

}
