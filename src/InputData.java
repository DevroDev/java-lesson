import javax.swing.*;
import java.awt.*;
public class InputData
{
	public static void main (String[] args) 
		{
			String name;
			String old;
			
			name =JOptionPane.showInputDialog("What is your name");
			old=JOptionPane.showInputDialog("How old are you");
			
			int age = Integer.parseInt(old);
			System.out.println("name:"+ name);
			System.out.println ("Age:"+ age +"years" );
			System.out.println ("hello!" + name +"\nNext year, you'll be" + (age+1)+"years");
			System.exit(0);
			
		}
}