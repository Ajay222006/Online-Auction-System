package com.auction.service;

import org.springframework.stereotype.Service;

import com.auction.model.Bid;

@Service
public class BidService {

    private Bid highestBid = new Bid("None", 0);

    public synchronized String placeBid(Bid bid) {
        if (bid.getAmount() <= 0) return "Invalid bid";
        if (bid.getAmount() > highestBid.getAmount()) {
            highestBid = bid;
            return "Bid accepted";
        }
        return "Bid too low";
    }

    public Bid getHighestBid() {
        return highestBid;
    }
}