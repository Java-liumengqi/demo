package com.mq.student.impl;

import com.mq.beans.Student;
import com.mq.manager.StudentManager;
import com.mq.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-24 16:17
 * @lastdate: 2018/11/24
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentManager studentManager;

    public Student getStudentById(int i) {
        Student student = studentManager.getStudentById(i);
        return student;
    }
}
