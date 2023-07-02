package com.example.quizbox;

public class QueAndAnsAdapter {
    private int que;
    private boolean ans;

    public QueAndAnsAdapter(int que1,boolean ans1){
        que=que1;
        ans=ans1;
    }

    public int getQue() {
        return que;
    }

    public void setQue(int que) {
        this.que = que;
    }

    public boolean isAns() {
        return ans;
    }

    public void setAns(boolean ans) {
        this.ans = ans;
    }
}
