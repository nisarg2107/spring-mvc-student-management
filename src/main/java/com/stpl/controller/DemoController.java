package com.stpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stpl.service.IStudentService;
import com.stpl.vo.Student;

@Controller
public class DemoController {

	@Autowired
	private IStudentService iStudentService;
	
	@RequestMapping(value = "load.html" , method = RequestMethod.GET)
	public ModelAndView load(){
		return new ModelAndView("Registration","Student",new Student());
	}
	
	@RequestMapping(value = "insert.html" , method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute Student student){
		this.iStudentService.insert(student);
		return new ModelAndView("redirect:/search.html");
	}
	
	@RequestMapping(value = "search.html" , method = RequestMethod.GET)
	public ModelAndView search(){
		List<Student> ls = this.iStudentService.search();
		return new ModelAndView("Search","data",ls);
	}
	
	@RequestMapping(value = "searchName.html" , method = RequestMethod.POST)
	public ModelAndView searchName(@RequestParam String name){
		List<Student> ls = this.iStudentService.searchByName(name);
		return new ModelAndView("Search","data",ls);
	}
	
	@RequestMapping(value = "delete.html" , method = RequestMethod.GET)
	public ModelAndView delete(@ModelAttribute Student student,@RequestParam int id){
		student.setId(id);
		this.iStudentService.delete(student);
		return new ModelAndView("redirect:/search.html");
	}
	
	@RequestMapping(value = "edit.html" , method = RequestMethod.GET)
	public ModelAndView edit(@RequestParam int id){
		List<Student> ls = this.iStudentService.findById(id);
		return new ModelAndView("Registration","Student",ls.get(0));
	}
}
