package cn.hinson.test01.service;

import cn.hinson.test01.mappers.Usermapper01;
import cn.hinson.test02.mappers.Usermapper02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("service01")
public class Service01 {

    //注入dao
    @Autowired
    private Usermapper01 usermapper01;
    //注入dao2
    @Autowired
    private Usermapper02 usermapper02;

    //测试方法
    //如果没有使用我们jta+atomikos,就不会回滚test02中的数据,因为我们是在test01业务中操作test02
    //但是我们如果使用了jta+atomokos就会回滚
    public void addUser1andUser2(String username,Integer age){
        usermapper02.AddUser(username,age);
        //加上异常测试,注意这是在test01包下调用test02数据库,看出现异常之后,会不会回滚事务
//        int i= 4 / 0;
        usermapper01.AddUser(username,age);
    }
}