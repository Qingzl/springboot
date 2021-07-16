package com.javalearning.springboot.user.dao;

import com.javalearning.springboot.user.domain.user;

public interface userMapper {
    //通过主键删除单条
    int deleteByPrimaryKey(String id);

    //新增单条的全部信息
    int insert(user record);

    //选择性的新增单条（即将存在的接收的数据insert进去）
    int insertSelective(user record);

    //通过主键查询单条
    user selectByPrimaryKey(String id);

    //选择性的修改单条（即用存在的接收的数据update）
    int updateByPrimaryKeySelective(user record);

    //通过主键修改单条的全部信息
    int updateByPrimaryKey(user record);
}