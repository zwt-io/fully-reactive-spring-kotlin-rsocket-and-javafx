package com.machanitis.stockclient;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StockPrice {

    private String symbol;
    private Double price;
    private LocalDateTime time;

}
