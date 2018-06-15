package com.bob;

public class Calculator {
    private int answer;
    public Calculator(){
        answer = 0;
    }

    public void add(int num){
        answer+=num;
        //return answer;
    }
    public int subtract(int num){
        answer-=num;
        return answer;
    }
    public void multiply(int num){
        answer*=num;
      //  return answer;
    }
    public void divide(int num){
        answer/=num;
       // return answer;
    }
    public int getAnswer(){
        return  answer;
    }
    public void clear(){
        answer = 0;
    }
}
