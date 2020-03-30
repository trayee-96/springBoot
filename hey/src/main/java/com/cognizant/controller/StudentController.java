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
@RequestMapping(value="insert",method=RequestMethod.POST)
public ModelAndView insert(@ModelAttribute("Student")Student s) {
	System.out.println("Model Attribute:"+s);
	ModelAndView mv = new ModelAndView("insert");
	//Student st=new Student(s.getId(),s.getName(),s.getCourse());
	int res=studentService.create(s);
	if(res==1)
	mv.addObject("msg", "Record Inserted");
	else
		mv.addObject("msg", "Record not Inserted");
	return mv;
}

@RequestMapping(value="update", method=RequestMethod.GET)
public ModelAndView updatePage()
{
	ModelAndView mv = new ModelAndView("update");
	Student student=new Student();
	mv.addObject("Student",student);
	
	return mv;
}
@RequestMapping(value="update", method=RequestMethod.POST)
public ModelAndView update(@ModelAttribute("Student") Student s)
{
	 System.out.println("Model Attribute:" + s);
     ModelAndView mv = new ModelAndView("update");
	//Student su=new Student(s.getId(),s.getName(),s.getCourse());
	int r=studentService.update(s);
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
	mv.addObject("Student",student);
	return mv;
}
@RequestMapping(value="delete",method=RequestMethod.POST)
public ModelAndView delete(@ModelAttribute("Student")Student s) {
	//ModelAndView mv = new ModelAndView("delete");
	//Integer intObj=new Integer(id);
	int res=studentService.delete(s.getId());
	ModelAndView mv = new ModelAndView("display");

	List<Student> list = studentService.findAll();

	mv.addObject("list", list);

	
	if(res==1) {
		mv.addObject("msg","record deleted");
	}
	else {
		mv.addObject("msg","record deletion failed");
	}
		
	return mv;
}
@RequestMapping(value="findName",method=RequestMethod.GET)
public ModelAndView findByNamePage() {
	ModelAndView mv=new ModelAndView("findName");
	Student student=new Student();
	mv.addObject("Student",student);
	return mv;
	
}
@RequestMapping(value="findName",method=RequestMethod.POST)
public ModelAndView findByNamePage(@RequestParam(value="name")String name) {
	ModelAndView mv=new ModelAndView("display");
	//Student student=new Student();
	List<Student> list=studentService.findByName(name);
	mv.addObject("list",list);
	return mv;
}
@RequestMapping(value="countStudent",method=RequestMethod.GET)
public ModelAndView countpage() {
	 ModelAndView mv=new ModelAndView("countStudent");
	 int result=studentService.countStudent();
	 mv.addObject("msg",result);
	 return mv;
}
}
