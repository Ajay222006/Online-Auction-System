package com.auction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.auction.model.Bid;
import com.auction.service.BidService;

public class BidServiceTest {

    @Test
    void validBid() {
        BidService service = new BidService();
        assertEquals("Bid accepted", service.placeBid(new Bid("Ajay", 200)));
    }

    @Test
    void lowBid() {
        BidService service = new BidService();
        service.placeBid(new Bid("A", 200));
        assertEquals("Bid too low", service.placeBid(new Bid("B", 100)));
    }

    @Test
    void invalidBid() {
        BidService service = new BidService();
        assertEquals("Invalid bid", service.placeBid(new Bid("A", -1)));
    }
}