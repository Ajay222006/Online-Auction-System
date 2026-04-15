package com.auction.model;

public class Bid {
    private String bidder;
    private double amount;

    public Bid() {}

    public Bid(String bidder, double amount) {
        this.bidder = bidder;
        this.amount = amount;
    }

    public String getBidder() { return bidder; }
    public void setBidder(String bidder) { this.bidder = bidder; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}