package com.mq.beans;

import java.util.Date;

/**
 * @description:
 * @author: liumengqi
 * @createdate: 2018-11-24 16:09
 * @lastdate: 2018/11/24
 */
public class Student {

    private Integer studentId;

    private String studentName;

    private Integer gender;

    private Integer age;

    private Date createTime;

    private Date updateTime;

    public Student() {
    }

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
