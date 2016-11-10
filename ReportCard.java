package com.example.mikeacre.reportcard;

public class ReportCard{

    String studentFirst;
    String studentLast;

    class grades {

        String subject;
        int score;

        grades(String subject, int score) {

        }

        String getSubject() {
        return subject;
        }
        int getScore() {
            return score;
        }

        void setSubject(String thissubject){
            subject  = thissubject;
        }

        void setScore(int thisscore){
            score = thisscore;
        }



    }

    @Override
    public String toString(){
        return "strings";
    }

    private char toLetter(int grade){
        //Converts number grade to letter for final display
        char lettergrade = 'a';
        return lettergrade;
    }


}
