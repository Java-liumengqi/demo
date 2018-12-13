package com.mq.dao.mapper;

import com.mq.beans.Student;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-24 13:43
 * @lastdate: 2018/11/24
 */
@Repository("studentMapper")
public interface StudentMapper extends tk.mybatis.mapper.common.Mapper<Student>, tk.mybatis.mapper.common.MySqlMapper<Student>{

}
