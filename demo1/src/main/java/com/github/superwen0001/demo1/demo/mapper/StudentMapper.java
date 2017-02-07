package com.github.superwen0001.demo1.demo.mapper;


import com.github.superwen0001.demo1.demo.bean.StudentBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wenshiliang on 2017/2/7.
 */
public interface StudentMapper {

    @Select("select * from student")
    List<StudentBean> select();

}
