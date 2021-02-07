//Student Name: Jake Coombes
//Class:		CIS180-01
//Assignment:	Lab 4 Part 2
//Due Date:		10/2/18
//Description:
//	This code should ask the user what ASCII art they want printed 
//	from 5 choices (J,#,0,>,7) the menu should use "switch" statements
//	and "print" statements to print the art 

import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ASCIIArt {
	
	public static void PrintJ()
	{	//Print "J" in ASCII Art
		System.out.println("**************");
		System.out.println("**************");
		System.out.println("      **");
		System.out.println("      **");
		System.out.println("      **");
		System.out.println("      **");
		System.out.println("  **  **");
		System.out.println("  *** **");
		System.out.println("   ****");

		
	}
	public static void Print2()
	{	//Print "#" in ASCII Art
		System.out.println("     **    **		");
		System.out.println("     **    **		");
		System.out.println("     **    **		");
		System.out.println(" ****************	");
		System.out.println("     **    **		");
		System.out.println("     **    **		");
		System.out.println(" ****************	");
		System.out.println("     **    **		");
		System.out.println("     **    **		");
		System.out.println("     **    **		");
		
	}
	public static void Print0()
	{	//Print "0" in ASCII Art
		System.out.println("     ********	");
		System.out.println("   ***      ***	");
		System.out.println("   ***     ****	");
		System.out.println("   ***    * ***	");
		System.out.println("   ***   *  ***	");
		System.out.println("   ***  *   ***	");
		System.out.println("   *** *    ***	");
		System.out.println("   ****     ***	");
		System.out.println("   ***      ***	");
		System.out.println("     ********	");
		
	}
	public static void Print4()
	{	//Print ">" in ASCII Art
		System.out.println("	***						");
		System.out.println("	    ***					");
		System.out.println("	        ***				");
		System.out.println("	            ***			");
		System.out.println("	                ***		");
		System.out.println("	                    **	");
		System.out.println("	                ***		");
		System.out.println("	            ***			");
		System.out.println("	        ***				");
		System.out.println("	    ***					");
		System.out.println("	***						");
		
	}
	public static void Print7()
	{	//Print "7" in ASCII Art
		System.out.println("***************		");
		System.out.println("            **		");
		System.out.println("           **		");
		System.out.println("          **		");
		System.out.println("         **			");
		System.out.println("        **			");
		System.out.println("       **			");
		System.out.println("      **			");
		System.out.println("     **				");
		System.out.println("    **				");
		
	}
	

	public static void main(String[] args) 
	{	// TODO Auto-generated method stub

		//create an instance of the scanner class
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int choice;
		
		String name;
		
		name = JOptionPane.showInputDialog("enter your name");
		
		JOptionPane.showMessageDialog(null, name);
		
		do 
		{
			//print out menu
			System.out.println("1) \"J\" ");
			System.out.println("2) \"#\" ");
			System.out.println("3) \"0\" ");
			System.out.println("4) \">\" ");
			System.out.println("5) \"7\" ");
			
			//get user input
			System.out.println("\t Which character would you like to see as ASCII Art? ");
			choice = input.nextInt();
			
			//print the users choice
			switch(choice) 
			{
				case 1:
					PrintJ();
					break;
				case 2:
					Print2();
					break;
				case 3: 
					Print0();
					break;
				case 4: 
					Print4();
					break;
				case 5: 
					Print7();
					break;
				default:
					
					JOptionPane.showMessageDialog(null, "Invalid Answer! Please enter the numbers 1-5\n\ntest");
					//System.out.println("Invalid Answer! Please enter the numbers 1-5\n"); 
			}
			
			//see if the user wants to see more art
				System.out.println("Would you like to look at another piece of art? (1=yes 0=no)");
				choice = input.nextInt();
		}while(choice==1);
	}

}
