package com.github.superwen0001.demo1.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.superwen0001.demo1.core.service.AbstractService;
import com.github.superwen0001.demo1.demo.bean.StudentBean;
import com.github.superwen0001.demo1.demo.mapper.StudentMapper;
import com.github.superwen0001.demo1.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wenshiliang on 2017/2/7.
 */
@Service
public class StudentServiceImpl extends AbstractService implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentBean> select() {
        return studentMapper.select();
    }

    @Override
    public int add(StudentBean studentBean) {
        int count = studentMapper.add(studentBean);
        logger.info("student = "+JSONObject.toJSONString(studentBean));
        return count;
    }
}
