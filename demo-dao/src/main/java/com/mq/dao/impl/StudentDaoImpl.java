package com.mq.dao.impl;

import com.mq.beans.Student;
import com.mq.dao.StudentDao;
import com.mq.dao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-24 13:42
 * @lastdate: 2018/11/24
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentMapper serviceMapper;

    @Override
    public Student getStudentById(int i) {
        Student student = serviceMapper.selectOne(new Student());
        return student;
    }
}
