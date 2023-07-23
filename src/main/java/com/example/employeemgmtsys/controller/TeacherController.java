package com.example.employeemgmtsys.controller;

import com.example.employeemgmtsys.model.Teacher;
import com.example.employeemgmtsys.service.teacherservice.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
//for linking with angular
@CrossOrigin(origins = "*")

public class TeacherController {
private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/add")
    public String saveTeacherDetails(@RequestBody Teacher teacher){
    teacherService.saveTeacher(teacher);
    return "Added Successfully";
    }

    @GetMapping("/getAll")
    public List<Teacher> getAllEmployee(){
      return teacherService.getTeachers();
    }

    @GetMapping("/getEmployeeById/{id}")
    public Teacher getEmployeeById(@PathVariable Integer id){
        return teacherService.getTeacherById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") Integer id){
        teacherService.deleteEmployeeById(id);
    }

    @PutMapping(value = "/update/{id}")
    private Teacher update(@RequestBody Teacher teacher, @PathVariable(name = "id") Integer id) {
        teacher.setId(id);
        teacherService.saveTeacher(teacher);
        return teacher;
    }

}
