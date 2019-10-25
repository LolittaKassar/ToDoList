package view;
import controller.Controller;
import model.*;
import java.util.*;
import java.text.*;

public class View 
{
	Scanner in = new Scanner(System.in);
	Controller controller;
	
	public View()
	{
		controller = new Controller();
		mainMenu();
	}
	
	public void mainMenu()
	{
		System.out.println("Hello. This is #TODO LIST#");///To be continued
		int temp;
		loop : while(true)
		{
			System.out.println("Please choose an option below");
			System.out.println("1 - Show saved tasks");
			System.out.println("2 - Add new task");
			System.out.println("3 - Edit an existing task");
			System.out.println("4 - Save and Quit");
			try
			{
				temp = in.nextInt();
				switch(temp)
				{
				case 1 :
					printTasks();
					break;
				case 2 :
					addTask();
					break;
				case 4 :
					System.out.println("saved");
					break loop;
				default :
					System.out.println("NOT AVAILABLE. Select from the list");
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("You have selected an invalid option. Please select an option from the list.");
			}
		}
	}
	
	public void printTasks()
	{
		controller.getAllTasks(); //To be continued...
	}
	
	public void addTask()
	{
		String taskTitle=null;
		Date date = null;
		String projectTitle=null;
		String input;
		
		System.out.println("You have chosen to add new taks");
		System.out.println("Title of the task?");
		in.nextLine();
		input = in.nextLine();
		if(!input.isEmpty())
		{
			taskTitle = input;
		}
		System.out.println("Due date? dd-mm-yyyy");
		input = in.nextLine();
		if(!input.isEmpty())
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			try
			{
				date = sdf.parse(input);
			}
			catch (ParseException e)
			{
				System.out.println("Wrong format. you can edit later");
			}
		}
		System.out.println("add this task to project? if no press enter");
		input = in.nextLine();
		if(!input.isEmpty())
		{
			projectTitle = input;
		}
		if((projectTitle != null && date != null) || (taskTitle != null && projectTitle != null)
				|| (taskTitle != null && date!= null))
		{
			controller.addNewTask(taskTitle, date, projectTitle);
		}
		else if (date == null && taskTitle == null)
			System.out.println("Task is not saved due to many empty fields");
		//System.out.println(taskTitle + date + projectTitle);
	}
	
}
