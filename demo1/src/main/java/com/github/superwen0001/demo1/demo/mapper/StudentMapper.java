package com.github.superwen0001.demo1.demo.mapper;


import com.github.superwen0001.demo1.demo.bean.StudentBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by wenshiliang on 2017/2/7.
 */
public interface StudentMapper {

    @Select("select * from student")
    @Results({@Result(id = true, property = "createDate", column = "create_date")})
    List<StudentBean> select();


    @Insert("insert into student(name) values(#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int add(StudentBean studentBean);


}
