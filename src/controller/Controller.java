package controller;
import java.util.ArrayList;
import java.util.Date;
import model.*;

public class Controller
{
	ArrayList<Task> savedTasks;
	ArrayList<Project> savedProjects;
	
	public Controller()
	{
		savedTasks = new ArrayList<Task>();
		savedProjects = new ArrayList<Project>();
	}
	
	public ArrayList<Task> getAllTasks()
	{
		return savedTasks;
	}
	
	public ArrayList<Project> getAllProjects()
	{
		return savedProjects;
	}
	
	public ArrayList getTasksFromProject(String title)
	{
		for(Project project: savedProjects)
		{
			if (project.getTitle().toLowerCase().compareTo(title.toLowerCase()) == 0)
			{
				return project.getProjectTasks();
			}
		}
		
		return null;
	}
	
	public void addNewTask(String taskTitle, Date date, String projectTitle)
	{
		if(taskTitle != null && date != null && projectTitle != null)
		{
			Task task = new Task(taskTitle, date, projectTitle);
			addTaskToProject(task, projectTitle);
			
		}
		else if(taskTitle ==null && date !=null && projectTitle != null)
		{
			Task task = new Task (date, projectTitle);
			addTaskToProject(task, projectTitle);
		}
		
	}
	
	public void addTaskToProject(Task task, String project)
	{
		ArrayList temp = getTasksFromProject(project);
		if(temp != null)
		{
			temp.add(task);
			savedTasks.add(task);
		}
		else
		{
			Project newProject = new Project(project);
			newProject.addTask(task);
			savedProjects.add(newProject);
			savedTasks.add(task);
		}
	}
}
