package com.ssm.main.pojo;

import javax.validation.constraints.*;

@SuppressWarnings("unused")
public class UserInfo {
    //获取学生信息的pojo
    private String meg="未定义";

    @NotNull
    private long id;

    private String name;

    @Pattern(regexp = "/^['男'|'女']$/")
    private String gender;

    @Max(100)
    @Min(0)
    private int age;

    private  String birthday;

    @Past
    private String enrollment;
    private String class_name;
    private String department;
    private String teacher;

    @Past
    private String lastLogTime="1996-08-03";

    public UserInfo(String meg){
        this.meg=meg;
    }

    public UserInfo(){}

    public UserInfo(String meg, long id, String name, String gender, int age, String birthday, String enrollment, String class_name, String department, String teacher, String lastLogTime) {
        this.meg = meg;
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
        this.enrollment = enrollment;
        this.class_name = class_name;
        this.department = department;
        this.teacher = teacher;
        this.lastLogTime = lastLogTime;
    }

    public String getMeg() {
        return meg;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public  String getBirthday() {
        return birthday;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public String getClass_name() {
        return class_name;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getLastLogTime() {
        return lastLogTime;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday( String birthday) {
        this.birthday = birthday;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setLastLogTime(String lastLogTime) {
        this.lastLogTime = lastLogTime;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "meg='" + meg + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", enrollment=" + enrollment +
                ", class_name='" + class_name + '\'' +
                ", department='" + department + '\'' +
                ", teacher='" + teacher + '\'' +
                ", lastLogTime=" + lastLogTime +
                '}';
    }
}
