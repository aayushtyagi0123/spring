package com.ctrl;

import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Dao.ToDoDao;
import com.entities.Todo;



@Controller
public class HomeCtrl {

	@Autowired
     ToDoDao todoDao;
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		String str="home";
		m.addAttribute("page", str);
		   List<Todo> list=this.todoDao.getAll();
		   m.addAttribute("Todos",list );
		return "home";
		
	}
	
	@RequestMapping("/add")
	public String addToDo(Model m)
	{
	   Todo t=new Todo();
		String str="add";
		m.addAttribute("page",str);
		m.addAttribute("todo",t);
		return "home";
	}
	
	@RequestMapping(value="/saveTodo",method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo t,Model m)
	{
		System.out.println(t);
	
		
		    this.todoDao.save(t);
		 
		    m.addAttribute("msg","succesfully added...");
		return "home";
		
	}
	
	
	
	/*@RequestMapping(value="/updateTodo",method=RequestMethod.POST)
	public String deleteTodo(@ModelAttribute("todo") Todo t,Model m)
	{
		System.out.println(t);
	
		
		   this.todoDao.Update(t);
		 
		    m.addAttribute("msg","succesfully deleted...");
		return "home";
		
	}*/

	
      @RequestMapping("/delete")
	public String delete(Model m)
	{
    	String str="delete";
    	m.addAttribute("page", str);
		
		 
		   
		return "home";
		
	}
      
  	@RequestMapping(path="/deleteTodo",method=RequestMethod.POST)
  	public String deleteTodo(@RequestParam("id") int id,Model m)
  	{
  		System.out.println(id);
  	
  		
  		    this.todoDao.Delete(id);
  		 
  		    m.addAttribute("msg","succesfully deleted...");
  		return "home";
  		
  	}
}
 