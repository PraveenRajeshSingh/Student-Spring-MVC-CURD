package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.student.dao.StudentDAO;
import com.student.service.StudentService;
import com.student.model.Student;

import java.util.List;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String listStudents(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "student-list";
	}

	@GetMapping("/students/add")
	public String showAddStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@PostMapping("/students/save")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/";
	}

	@GetMapping("/students/edit/{id}")
	public String showEditStudentForm(@PathVariable("id") Long id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "student-form";
	}

	@PostMapping("/students/update")
	public String updateStudent(@ModelAttribute("student") Student student) {
		studentService.updateStudent(student);
		return "redirect:/";
	}

	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
	}
}