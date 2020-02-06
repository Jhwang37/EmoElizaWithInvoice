package com.company;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmoEliza extends  Invoice {
    Scanner scan = new Scanner(System.in);
    private double sum = 100;
    private int positiveCount = 0;
    private int negativeCount = 0;
    private String feeling;
    private boolean start = true;
    private ArrayList<String> allResponses = new ArrayList<String>();
    private List<String> positive = Arrays.asList("good", "glad", "happy", "relaxed",
            "accomplished", "alert", "creative");
    private List<String> negative = Arrays.asList("bad", "sad", "tired", "angry", "anxious",
            "hungry", "moody", "afraid");

    public EmoEliza() {
        System.out.println("Welcome to Raven APP");
        feelings();

    }
    public void invoiceTotal(int positiveCount, int negativeCount){
        int totalCount = positiveCount + negativeCount;
        for (int i = 0; i <= totalCount; i++){
            sum += .50;
        }
        System.out.println("Total due:  " + sum);
        System.out.println("Thank you for doing business with Eliza");
    }

    public void printResponses(ArrayList<String> allResponses) {
        for (String x : allResponses) {
            System.out.println(x);
        }
    }

    //method to show response depending on the number of matches
    public void feelings() {
        while (start) {
            System.out.println("How are you feeling today: ");
            feeling = scan.nextLine();
            if (positive.contains(feeling)) {
                positiveCount += 1;
                allResponses.add(feeling);
            }
            if (negative.contains(feeling)) {
                negativeCount += 1;
                allResponses.add(feeling);
            } else if (feeling.equalsIgnoreCase("q")) {
                printResponses(allResponses);
                break;
            }
        }
        ravenResponse(positiveCount, negativeCount);
        getInfo();
        invoiceTotal(positiveCount, negativeCount);

    }

    public void ravenResponse(int positiveCount, int negativeCount) {
        if (positiveCount > 10) {
            System.out.println("I am so happy for you.. Yay..");
        } else if (positiveCount < 5 && negativeCount < 5) {
            System.out.println("Really! Why tell me more!");
        } else if (positiveCount == negativeCount) {
            System.out.println("MEH");
        } else if (negativeCount > 10) {
            System.out.println("I love it");
        } else {
            System.out.println("Helloo");
        }
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }
}
