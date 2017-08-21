package com.springboot.web.springbootfirstwebapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.web.springbootfirstwebapp.model.Todo;

@Service

public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "Leszek", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "Leszek", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "Leszek", "Learn Hibernate", new Date(),
                false));
    }
    
    public List<Todo> retrieveTodos(String user) {
    	
    	List<Todo> tempList = new ArrayList<>();
    	for (Todo todo : todos) {
    		if(todo.getUser().equals(user))
    			tempList.add(todo);
		}
    	return tempList;
    }
    public void addTodo(String name, String description, Date targetDate,boolean isDone){
    	todos.add(new Todo(todoCount++,name,description,targetDate,isDone));
    }
    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }
}
