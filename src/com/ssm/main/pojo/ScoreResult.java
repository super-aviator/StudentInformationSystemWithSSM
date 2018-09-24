package com.ssm.main.pojo;

public class ScoreResult {
    //获取学生成绩的pojo
    private String sub_name;
    private double score;
    private String teacher;

    public ScoreResult(String name, String teacher , double score){
        this.sub_name=name;
        this.teacher=teacher;
        this.score=score;
    }
    public ScoreResult(){}

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setSub_teacher(String sub_teacher) {
        this.teacher = sub_teacher;
    }


    public String getSub_name() {
        return sub_name;
    }

    @Override
    public String toString() {
        return "ScoreResult{" +
                "sub_name='" + sub_name + '\'' +
                ", score=" + score +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    public double getScore() {
        return score;
    }

    public String getSub_teacher() {
        return teacher;
    }

}
