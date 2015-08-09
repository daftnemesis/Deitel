//Program that shows the sum of two integers using JOptionPane class
import javax.swing.*;

public class Addition_GUI {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a second integer: "));

        int sum = num1 + num2;

        String message = String.format("The sum of the two numbers is %d", sum);

        JOptionPane.showMessageDialog(null, message);



    }
}
