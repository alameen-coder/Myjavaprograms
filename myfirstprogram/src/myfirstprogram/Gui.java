package myfirstprogram;
import javax.swing.JOptionPane;

public class Gui {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
	
        int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age?")); 
        JOptionPane.showMessageDialog(null, "You're  " + age + " years old.");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("What's your height?")); 
        JOptionPane.showMessageDialog(null, "You're  " + height + "cm tall.");		
	}
}
