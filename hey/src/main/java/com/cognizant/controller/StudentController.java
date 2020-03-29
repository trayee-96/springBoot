package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;
import com.cognizant.service.StudentServiceImpl;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
@RequestMapping(value="findAll",method=RequestMethod.GET)
public ModelAndView findAll(){
	ModelAndView mv = new ModelAndView("display");

	List<Student> list = studentService.findAll();

	mv.addObject("list", list);

	return mv;

	
}
@RequestMapping(value="insert",method=RequestMethod.GET)
public ModelAndView pageCreate(){
	 ModelAndView mv = new ModelAndView("insert");
	 Student student=new Student();
	 mv.addObject("Student", student);
	
	 return mv;
}
/*@RequestMapping(value="insert",method=RequestMethod.POST)
public ModelAndView insert(@ModelAttribute(Student)Student s) {
	System.out.println("Model Attribute:"+s);
	ModelAndView mv = new ModelAndView("insert");
	Student st=new Student(s.getId(),s.getName(),s.getCourse());
	int res=studentService.create(st);
	if(res==1)
	mv.addObject("msg", "Record Inserted");
	else
		mv.addObject("msg", "Record not Inserted");
	return mv;
}*/

@RequestMapping(value="update", method=RequestMethod.GET)
public ModelAndView updatePage(@RequestParam(value="id",required = false) String id)
{
	ModelAndView mv = new ModelAndView("update");
	mv.addObject("id",id);
	
	return mv;
}
@RequestMapping(value="update", method=RequestMethod.POST)
public ModelAndView update(@ModelAttribute("student") Student s)
{
	ModelAndView mv = new ModelAndView("update");
	Student su=new Student(s.getId(),s.getName(),s.getCourse());
	int r=studentService.update(su);
	if(r==1)
	mv.addObject("msg", "Record Updated");
	else
		mv.addObject("msg", "Record Updation failed");
	
	return mv;
}
@RequestMapping(value="delete",method=RequestMethod.GET)
public ModelAndView deletePage()
{
	ModelAndView mv=new ModelAndView("delete");
	Student student=new Student();
	mv.addObject("student",student);
	return mv;
}
@RequestMapping(value="delete",method=RequestMethod.POST)
public ModelAndView delete(@RequestParam(value="id")int id) {
	ModelAndView mv = new ModelAndView("delete");
	Integer intObj=new Integer(id);
	int res=studentService.delete(intObj.intValue());
	if(res==1) {
		mv.addObject("msg","record deleted");
	}
	else {
		mv.addObject("msg","record deletion failed");
	}
		
	return findAll();
	
}
}
