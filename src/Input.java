import javax.swing.*;
import java.awt.*;
public class Input
{
	public static void main (String[] args) 
		{
			String name;
			String old;
			name=JOptionPane.showInputDialog("What is your name?");
			old=JOptionPane.showInputDialog("How old are you?");
			int age=Integer.parseInt(old);
			System.out.println ("Name"+name);
			System.out.println ("Age"+old);
			System.out.println ("Hello!"+name+" you will be "+(age+1)+" Next year");
			System.exit(0);
		}
	
}