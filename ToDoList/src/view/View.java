package view;
import controller.Controller;
import model.*;
import java.util.*;

public class View 
{
	Scanner in = new Scanner(System.in);
	
	public View()
	{
		Controller controller = new Controller();
		//printIntro();
		Task task = new Task("MYTask");
		//task.name("new");
		System.out.println(task.getDate());
	}
	
	public void printIntro()
	{
		System.out.println("Hello. This is #TODO LIST#");///To be continued
		Scanner temp;
		while(true)
		{
			System.out.println("Please choose an option below");
			System.out.println("1 - Show saved tasks");
			System.out.println("2 - Add new task");
			System.out.println("3 - Edit an existing task");
			System.out.println("4 - Save and Quit");
			try {
				temp = new Scanner(in.next());
				int choice = temp.nextInt();
				
			}
			catch(Exception e)
			{
				System.out.println("You have entered an invalid option, please select one of the options below");
			}
			
		}
	}
}
