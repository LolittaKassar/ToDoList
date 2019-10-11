package model;
import java.util.*;

public class Task
{
	String title;
	Date date;
	String status = "T.B.D.";
	String project;
	
	public Task(String title) {
		this.title = title;
	}
	
	public Task(Date date) {
		this.date = date;
	}
	
	public Task(String title, String project) {
		this.title = title;
		this.project = project;
	}
	
	public Task(String title, Date date, String status, String project)
	{
		this.title = title;
		this.date = date;
		this.status = status;
		this.project = project;
	}
	
	public void name(String name) {
		this.title = name;
	}
	
	public String getTitle() {
		if(title != null)
			return this.title;
		return "Untitled";
	}
	
	public void dueDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void updateStatus(String newStatus) {
		this.status = newStatus;
	}
	
	public String getSatus() {
		return status;
	}
	
	public String getProjectName() {
		if (project != null)
			return project;
		else
			return "No related project";
	}
	
}
