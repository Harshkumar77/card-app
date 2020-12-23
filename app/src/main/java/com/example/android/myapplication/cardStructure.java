package com.example.android.myapplication;

public class cardStructure {

    public String cardName;
    public int cardImageId;
    public boolean isBlack;

    /**
     * custom structure to store card information
     * @param cardName Name of the card i.e. title
     * @param cardImageId Image Resource id card
     * @param isBlack Color of the card either black or red
     */

    public cardStructure(String cardName, int cardImageId, boolean isBlack) {
        this.cardName = cardName;
        this.cardImageId = cardImageId;
        this.isBlack = isBlack;
    }
}
