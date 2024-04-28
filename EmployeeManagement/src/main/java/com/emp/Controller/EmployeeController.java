package com.emp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.emp.DAO.EmployeeDao;
import com.emp.DTO.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", new Employee());
		modelAndView.setViewName("employeeform.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute Employee employee) {
		dao.save(employee);
		return "employee saved";
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", new Employee());
		modelAndView.setViewName("employeedelete.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/de")
	public ModelAndView deleteEmp(@ModelAttribute Employee employee) {
		ModelAndView modelAndView=new ModelAndView();
		dao.delete(dao.getEmployeeById(employee.getId()));
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/display")
	public ModelAndView displayAll() {
		ModelAndView mv=new ModelAndView();
		List<Employee> employees=dao.alldetails();
		mv.addObject("employeelist", employees);
		mv.setViewName("displayall.jsp");
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView update() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", new Employee());
		modelAndView.setViewName("update.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/up")
	public ModelAndView updateemp(@ModelAttribute Employee employee) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", dao.getEmployeeById(employee.getId()));
		modelAndView.setViewName("updateform.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/upe")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		ModelAndView modelAndView=new ModelAndView();
		dao.update(employee);
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}
	

}
