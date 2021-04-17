package com.ssx04ZiDingYiYiChang;

public class Teacher {

    public void checkScore(int Score) throws ScoreException{
        if(Score<0||Score>100){
//          throw new ScoreException();
            throw new ScoreException("你给的分数有误,分数在0-100之间");
        }else{
            System.out.println("分数正常");
        }
    }
}
