package com.wenjie.crowd.test;

import com.wenjie.crowd.entity.Admin;
import com.wenjie.crowd.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * @author Wenjie FU
 * @create 2021-11-15 21:16
 */
//指定 Spring 给 Junit 提供的运行器类
@RunWith(SpringJUnit4ClassRunner.class)
//加载 Spring 配置文件的注解
@ContextConfiguration(locations = { "classpath:spring-persist-mybatis.xml" })
public class CrowdTest {
    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void testDataSource() throws SQLException {
        // 1.通过数据源对象获取数据源连接
        Connection connection = dataSource.getConnection();
        // 2.打印数据库连接
        System.out.println(connection);
    }



    @Test
    public void testAdminMapperAutowired() {
        Admin admin = adminMapper.selectByPrimaryKey(1);
        System.out.println(admin.getUserName());
    }
    
    @Test
    public void insertAdmin(){
        Admin admin = new Admin(null, "tom", "1234", "Novm", "123@gmail", null);
        adminMapper.insert(admin);

    }

    @Test
    public void testLog() {
        // 1.获取Logger对象，这里传入的Class对象就是当前打印日志的类
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);

        // 2.根据不同日志级别打印日志
        logger.debug("Hello I am Debug level!!!");
        logger.debug("Hello I am Debug level!!!");
        logger.debug("Hello I am Debug level!!!");

        logger.info("Info level!!!");
        logger.info("Info level!!!");
        logger.info("Info level!!!");

        logger.warn("Warn level!!!");
        logger.warn("Warn level!!!");
        logger.warn("Warn level!!!");

        logger.error("Error level!!!");
        logger.error("Error level!!!");
        logger.error("Error level!!!");
    }


}