package com.example.quizbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class shivaji extends AppCompatActivity {
    TextView qstn;
    TextView qun;
    TextView scr;
    ProgressBar progress;
    int index;
    int quest;
    int score_count=0;

    QueAndAnsAdapter[] questionbank=new QueAndAnsAdapter[]{
            new QueAndAnsAdapter(R.string.Question_1,true),
            new QueAndAnsAdapter(R.string.Question_2,false),
            new QueAndAnsAdapter(R.string.Question_3,true),
            new QueAndAnsAdapter(R.string.Question_4,false),
            new QueAndAnsAdapter(R.string.Question_5,false),
            new QueAndAnsAdapter(R.string.Question_6,true),
            new QueAndAnsAdapter(R.string.Question_7,false),
            new QueAndAnsAdapter(R.string.Question_8,true),
            new QueAndAnsAdapter(R.string.Question_9,false),
            new QueAndAnsAdapter(R.string.Question_10,false)};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shivaji);
        getSupportActionBar().hide();

        qun=findViewById(R.id.questionnumber);
        qstn=findViewById(R.id.question);
        scr=findViewById(R.id.score);
        progress=findViewById(R.id.progressbar);

        quest= questionbank[index].getQue();
        qstn.setText(quest);
    }
     public void press_true(View view){
        check_answer(true);
         updatescreen();
     }

    public void press_false(View view){
        check_answer(false);
        updatescreen();
    }

    public void updatescreen(){
        index =(index + 1);
        progress.incrementProgressBy(10);
        if(index<10) {
            //quNo
            qun.setText("Q "+(index+1)+"/10");
            //ques
            quest = questionbank[index].getQue();
            qstn.setText(quest);

            //answer
            scr.setText("Score"+score_count+"/10");
        }
        else {
            AlertDialog.Builder myAlertDialog=new AlertDialog.Builder(this);
            myAlertDialog.setTitle("You are at the end of the Quiz");
            myAlertDialog.setCancelable(false);
            myAlertDialog.setMessage("View your Score"+score_count+" Points");
            myAlertDialog.setPositiveButton("Play Next Quiz", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            myAlertDialog.show();
          }

        }
    public void check_answer(boolean userInput){  //true
         boolean correctAns=questionbank[index].isAns();  //index 3 false
         if(userInput==correctAns){ //true or false
             Toast.makeText(this, "Answer is correct", Toast.LENGTH_SHORT).show();
             score_count=score_count+1;
         }
         else{
             Toast.makeText(this, "Answer is incorrect", Toast.LENGTH_SHORT).show();
         }
    }


}