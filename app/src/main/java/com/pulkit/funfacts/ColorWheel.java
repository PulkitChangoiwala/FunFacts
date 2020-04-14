package com.pulkit.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {

    private final String[] colors = new String[]

            {
                    "#bada55" ,
                    "#bada55",
                    "#ff0000",
                    "#065535",
                    "#420420",
                    "#ffd700",
                    "#800080",
                    "#ffa500",
                    "#008080"
            };

    int getColor()
    {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        //String fact  = randomNumber +  "";
        int cl = Color.parseColor(colors[randomNumber]);
        return cl;
    }

}
