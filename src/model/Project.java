package model;
import java.util.ArrayList;

public class Project
{
	ArrayList<Task> tasks;
	String title;
	
	public Project(String title)
	{
		tasks = new ArrayList<Task>();
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void addTask(Task task)
	{
		tasks.add(task);
	}
	
	public ArrayList<Task> getProjectTasks()
	{
		return tasks;
	}
}
