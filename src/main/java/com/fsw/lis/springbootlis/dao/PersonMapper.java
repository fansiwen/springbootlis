package com.fsw.lis.springbootlis.dao;

import com.fsw.lis.springbootlis.pojo.Person;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PersonMapper {
    @Select(value = "select * from person where id = #{id}")
    @Results({
            @Result(property = "id",column = "id")
    })
    Person getPersonByID(@Param("id") int id);
}
