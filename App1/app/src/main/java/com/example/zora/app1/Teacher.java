package com.example.zora.app1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

//    public static List<String> getAllTeachers() {
//        List<String> teachers = new ArrayList<String>();
//        teachers.add("张海霞");
//        teachers.add("陈江");
//        teachers.add("叶蔚");
//
//        return teachers;
//    }

    private String name;
    private int imageId;
    private String desc;

    //构造函数
    public Teacher(String name, int imageId, String desc) {
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
    }

    // 返回一个Teacher的列表
    public static List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("黄大狗", R.drawable.d1, "黄大狗，北京大学教授国际大学生iCAN创新创业大赛发起人、主席北京大学信息科学技术学院教授全球华人微纳米分子系统学会秘书长IEEE NTC 北京分会主席。"));
        teachers.add(new Teacher("黄二狗", R.drawable.d2, "黄二狗，北京大学信息科学技术学院副教授，高等学校电路和信号系统教学与教材研究会常务理事，中国通信理论与信号处理委员会委员。"));
        teachers.add(new Teacher("黄三狗", R.drawable.d3, "黄三狗，北京大学软件工程国家工程研究中心副研究员，创办了技术学习服务平台天码营(http://tianmaying.com)与软件开发协同工具Onboard(http://onboard.cn)。"));

        return teachers;
    }

    // 以下都是访问内部属性的getter和setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
