package com.pulkit.funfacts;

import java.util.Random;



public class FactBook {

    private final String[] facts = new String[]{

            "Space smells like a combination of diesel fuel and barbecue, according to astronauts. The smell is caused by dying stars.",

            "Rapunzel, Rapunzel! A single strand of hair can hold up to 3 ounces of weight. That means the typical person’s full head of hair can support up to 12 tons.",
            "Cornell University scientists have created a functioning guitar the size of a human blood cell.",

            "Many oranges are green when they’re ripe. Scientists remove their chlorophyll to make them more appealing to North American consumers.",

            "The average person walks the equivalent of 5 laps around the world during their lifetime.",

            "The chills you get when listening to music are caused by your brain releasing dopamine, a neurotransmitter that causes pleasure.",

            "Women constitute 70 percent of Iranian university science and engineering students",

            "A British research study found that watching a horror film prior to viewing abstract art enhances the enjoyment of the art for most people.",

            "In 2005, an Australian research institute published a study on the loss of teaspoons in the workplace.",

            "The average bolt of lightning contains enough energy to toast 100,000 pieces of bread.",

            "The scientific name for brain freeze is sphenopalatine ganglioneuralgia.",

            "Researchers from Heidelberg University Hospital have determined it takes 6 minutes for alcohol to impact human brain cells.",

            "In 1992, 29,000 rubber ducks were lost at sea, and they are still being discovered in unexpected places.",

            "Globally, only 2 percent of the population has green eyes."


    };

    public String getFact()
    {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        //String fact  = randomNumber +  "";
        return facts[randomNumber];
    }
}
