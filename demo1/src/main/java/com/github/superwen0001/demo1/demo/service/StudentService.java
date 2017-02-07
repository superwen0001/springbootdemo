package com.github.superwen0001.demo1.demo.service;

import com.github.superwen0001.demo1.demo.bean.StudentBean;

import java.util.List;

/**
 * Created by wenshiliang on 2017/2/7.
 */
public interface StudentService {
    List<StudentBean> select();

    int add(StudentBean studentBean);
}
