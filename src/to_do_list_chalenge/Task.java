package to_do_list_chalenge;

import java.time.LocalDate;

public class Task {
	
	private int id;
	private String name;
	private String descricao;
	private LocalDate start_date;
	private LocalDate end_date;
	
	
	public Task(String name, String descricao, LocalDate start_date, LocalDate end_date) {
		this.name = name;
		this.descricao = descricao;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	
	
	public void createTask(Task task ) {
		
	}
	
	public void updateTask(Task task) {
		
	}
	
	public void deleteTask() {
		
	}
		
	public void getById(int id) {
		
	}
	
	public void getAll() {
		
	}
}
