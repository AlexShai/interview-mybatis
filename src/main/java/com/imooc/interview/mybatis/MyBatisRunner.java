package com.imooc.interview.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisRunner {
    public static void main(String[] args) {
        // mybatis 的配置文件
        String resource = "mybatis.xml";
        InputStream is = MyBatisRunner.class.getClassLoader().getResourceAsStream(resource);
        // 构建 sqlSession 的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        String statement = "com.imooc.interview.mybatis.dao.emp.findById";
        SqlSession session1 = sessionFactory.openSession();

        Employee employee1 = session1.selectOne(statement, 3420);
        session1.close();
        SqlSession session2 = sessionFactory.openSession();
        Employee employee2 = session2.selectOne(statement, 3420);
        session2.close();
        System.out.println(employee1);
        System.out.println(employee2);

    }
}
