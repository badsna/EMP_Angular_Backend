package com.example.employeemgmtsys.service.teacherservice;

import com.example.employeemgmtsys.model.Teacher;
import com.example.employeemgmtsys.repository.TeacherRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    public final TeacherRepo teacherRepo;
    public final ObjectMapper objectMapper;
    public List<Teacher> getTeachers()
    {
        return teacherRepo.findAll();
    }

    public Teacher getTeacherById(Integer id) {
        return teacherRepo.findById(id).get();
    }

    public void saveTeacher(Teacher teacher) {
        teacherRepo.save(teacher);
    }

    public void deleteEmployeeById(Integer id){
        teacherRepo.deleteById(id);
    }

}
