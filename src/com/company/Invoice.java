package com.company;

import java.util.Scanner;

public class Invoice {
    private double price;
    private final double COST = 100;
    private final double perQuestion = .35;
    private EmoEliza emoEliza;
    private String name;
    private String address;
    Scanner scan = new Scanner(System.in);

    public Invoice(){
        System.out.println("Raven's Invoice");

    }
    public String getInfo(){
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your address: ");
        address = scan.nextLine();
        String invoice = "Raven's Invoice\nTo:\n" + name + "\n" + address;
        System.out.println(invoice);
        return invoice;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCOST() {
        return COST;
    }

    public double getPerQuestion() {
        return perQuestion;
    }

    public EmoEliza getEmoEliza() {
        return emoEliza;
    }

    public void setEmoEliza(EmoEliza emoEliza) {
        this.emoEliza = emoEliza;
    }
}
