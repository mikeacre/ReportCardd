package com.example.mikeacre.reportcard;

public class ReportCard{

    public static void main(String[] args){

    }

    private String stuName;
    private String subject;
    private int score;

    @Override
    public String toString() {
        return "ReportCard{" +
                "stuName='" + stuName + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }

    public ReportCard(String stuName, String subject, int score){
        this.stuName = stuName;
        this.subject = subject;
        this.score = score;
    }

    public int getScore(){return score;}

    public String getName(){return stuName;}

    public String getSubject(){return subject;}

    public void setScore(int setscore){
        score=setscore;
    }
    public void setName(String setname){
        stuName=setname;
    }
    public void setSubject(String setsubject){
        subject=setsubject;
    }
}
