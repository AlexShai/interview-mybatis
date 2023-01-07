package com.imooc.interview.mybatis.dao;

import com.imooc.interview.mybatis.Employee;
import org.springframework.stereotype.Repository;


/**
 * 为验证 mapper 和 mapper.xml 的关联创建，建议加上注解 @Repository
 * 未使用
 */
@Repository
public interface emp {
    Employee findById(Integer id);
}
