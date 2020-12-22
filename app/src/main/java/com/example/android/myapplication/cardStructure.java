package com.example.android.myapplication;

import android.graphics.Color;
import android.widget.TextView;

public class cardStructure {

    String cardName;

    int cardImageId;

    String emote;

    int color ;

    public cardStructure(String cardName, int cardImageId, String emote , int color) {
        this.cardName = cardName;
        this.cardImageId = cardImageId;
        this.emote = emote;
        this.color=color;
    }
}
