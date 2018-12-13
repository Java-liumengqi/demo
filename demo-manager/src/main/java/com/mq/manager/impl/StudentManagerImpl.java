package com.mq.manager.impl;

import com.mq.beans.Student;
import com.mq.dao.StudentDao;
import com.mq.manager.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-24 16:19
 * @lastdate: 2018/11/24
 */
@Service("studentManager")
public class StudentManagerImpl implements StudentManager {

    @Autowired
    private StudentDao studentDao;

    public Student getStudentById(int i) {
        return studentDao.getStudentById(i);
    }
}
