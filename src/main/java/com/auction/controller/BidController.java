package com.auction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auction.model.Bid;
import com.auction.service.BidService;

@RestController
@RequestMapping("/bids")
public class BidController {

    @Autowired
    private BidService service;

    @PostMapping
    public String placeBid(@RequestBody Bid bid) {
        return service.placeBid(bid);
    }

    @GetMapping("/highest")
    public Bid getHighest() {
        return service.getHighestBid();
    }
}