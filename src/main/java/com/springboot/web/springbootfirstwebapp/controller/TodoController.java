package com.springboot.web.springbootfirstwebapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.springbootfirstwebapp.model.Todo;
import com.springboot.web.springbootfirstwebapp.service.TodoService;


@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder ){
		//Date fromat - dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	public String showTodosList( ModelMap model){
		String name = (String) model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
	@RequestMapping(value="/todo", method=RequestMethod.GET)
	public String showFormForAdding( ModelMap model){
		model.addAttribute("todo", new Todo(0, (String) model.get("name"), "Description default", new Date(), false));
		return "todo";
	}
	@RequestMapping(value="/todo", method=RequestMethod.POST)
	public String addTodo( ModelMap model, @Valid Todo todo, BindingResult bindingResult){
		
		if(bindingResult.hasErrors())
			return "todo";
		
			service.addTodo((String) model.get("name"), todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:/list-todos";
		
	}
	
	@RequestMapping(value="/delete-todo", method=RequestMethod.GET)
	public String deleteTodo( @RequestParam int id){
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}
	@RequestMapping(value="/update-todo", method=RequestMethod.GET)
	public String showUpdateTodo(@RequestParam int id, ModelMap model){
		model.addAttribute("todo",service.retrieveTodo(id));
		return "todo";
	}
	@RequestMapping(value="/update-todo", method=RequestMethod.POST)
	public String updateTodo( ModelMap model, @Valid Todo todo, BindingResult bindingResult){
		
		todo.setUser((String) model.get("name"));
		if(bindingResult.hasErrors())
			return "todo";
		service.updateTodo(todo);
		return "redirect:/list-todos";
	}
	
	
	
}
