package com.github.superwen0001.demo1.demo.controller;

import com.github.superwen0001.demo1.demo.bean.StudentBean;
import com.github.superwen0001.demo1.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wenshiliang on 2017/2/7.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("select")
    public List<StudentBean> select(){
        return studentService.select();
    }

}
