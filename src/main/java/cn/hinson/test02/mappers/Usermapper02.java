package cn.hinson.test02.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface Usermapper02 {
    @Insert("INSERT INTO USER (u_id,username,age)VALUES(NULL,#{username},#{age})")
    public void AddUser(@Param("username") String username, @Param("age") Integer age);
}
