package GUI;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MessageBox {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter username: ");
    String username = sc.nextLine();
    System.out.print("Enter password: ");
    String pw = sc.next();
    
    if(username.equals("Admin")&& pw.equals("123!@#"))
    	JOptionPane.showMessageDialog(null, "Login Successfully");
    
    else {
    JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "Invalid Login", "Login Error", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Invalid Login");
	}
	int option = JOptionPane.showConfirmDialog(null, "Do another yes / no?");
	if(option == 0)
		JOptionPane.showConfirmDialog(null, "Do you remove item?", "Delete title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
	else if (option == 1)
		JOptionPane.showMessageDialog(null, "NO");
	else if (option == 2)
		JOptionPane.showMessageDialog(null, "Cancel");
	int yes = JOptionPane.YES_OPTION;
	int no = JOptionPane.NO_OPTION;
	int cancel = JOptionPane.CANCEL_OPTION;
	JOptionPane.showMessageDialog(null, yes + " " + no + " " + cancel);
	
	String name = JOptionPane.showInputDialog(null, "Enter your name");
	
	String age = JOptionPane.showInputDialog(null, "Enter your age", "Age Title", JOptionPane.INFORMATION_MESSAGE);
	
	if( name.equals("Admin") && age.equals("34"))
		JOptionPane.showMessageDialog(null, "Login successfully");
	}

}
