package com.company;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        boolean GameOver =true;
        Scanner ss = new Scanner(System.in);
        System.out.println("ENTER THE BASE SCORE(NOT HIGHER THAN 1000) :");
        int LevelCompletionScore=ss.nextInt();
        Scanner bb = new Scanner(System.in);
        System.out.println("ENTER THE BONUS SCORE(NOT HIGHER THAN 300): ");
        int Bonus=bb.nextInt();

        float FinalLevelCompletionScore=LevelCompletionScore*Bonus/2;
        System.out.println("THE FINAL SCORE IS: " + FinalLevelCompletionScore);
        if (GameOver)
        {
            try
            {
                if (FinalLevelCompletionScore == 150000)
                {
                    System.out.println("FLAWLESS!! YOU DESERVE A PAY RISE");
                }
                else if(FinalLevelCompletionScore>150000)
                {
                    System.out.println("OUT OF BOUNDS");
                    return;
                }
            }
            finally
            {
                if (FinalLevelCompletionScore < 50000 && FinalLevelCompletionScore > 39999)
                {
                    System.out.println("YOUR SCORE IS LESS THAN 50000, BUT THAT DID THE JOB!!");
                }
                else if (FinalLevelCompletionScore <= 39999)
                {
                    System.out.println("YOUR SCORE IS LESS THAN 40000");
                    System.out.println("MISSION FAILED, WE'LL GET EM NEXT TIME!!");
                }
                else if (FinalLevelCompletionScore > 50000 || FinalLevelCompletionScore == 50000)
                {
                    if (FinalLevelCompletionScore != 150000 && FinalLevelCompletionScore<15000 )
                        System.out.println("WELL DONE!! COME BACK, YOU DESERVE A REST");
                }
            }
        }

    }
}
