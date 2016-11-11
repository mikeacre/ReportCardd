package com.example.mikeacre.reportcard;

public class ReportCard{

    private String mstuName;
    private String msubject;
    private int mscore;

    @Override
    public String toString() {
        return "ReportCard{" +
                "stuName='" + mstuName + '\'' +
                ", subject='" + msubject + '\'' +
                ", score=" + mscore +
                '}';
    }

    public ReportCard(String stuName, String subject, int score){
        this.mstuName = stuName;
        this.msubject = subject;
        this.mscore = score;
    }

    public int getScore(){return mscore;}

    public String getName(){return mstuName;}

    public String getSubject(){return msubject;}

    public void setScore(int setscore){
        mscore=setscore;
    }
    public void setName(String setname){
        mstuName=setname;
    }
    public void setSubject(String setsubject){
        msubject=setsubject;
    }
}
