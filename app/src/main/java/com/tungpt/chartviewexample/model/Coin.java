package com.tungpt.chartviewexample.model;

public class Coin {
    private String mId;
    private String mName;
    private String mSymbol;
    private int mRank;
    private int mPriceUSD;
    private int mPriceBTC;

    public Coin(String id, String name, String symbol, int rank, int priceUSD, int priceBTC) {
        mId = id;
        mName = name;
        mSymbol = symbol;
        mRank = rank;
        mPriceUSD = priceUSD;
        mPriceBTC = priceBTC;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSymbol() {
        return mSymbol;
    }

    public void setSymbol(String symbol) {
        mSymbol = symbol;
    }

    public int getRank() {
        return mRank;
    }

    public void setRank(int rank) {
        mRank = rank;
    }

    public int getPriceUSD() {
        return mPriceUSD;
    }

    public void setPriceUSD(int priceUSD) {
        mPriceUSD = priceUSD;
    }

    public int getPriceBTC() {
        return mPriceBTC;
    }

    public void setPriceBTC(int priceBTC) {
        mPriceBTC = priceBTC;
    }
}
