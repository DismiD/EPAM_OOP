package com.epam.audio.controller.util;

import com.epam.audio.model.entity.Disc;
import com.epam.audio.model.entity.MusicComposition;

import java.util.List;

public class DurationUtil {


public static String calculateTotalDuration(Disc disc){
        List<MusicComposition> tempCollection = disc.getUserCollection();
        int totalDuration = 0;

        for (MusicComposition composition : tempCollection) {
            totalDuration += composition.getDuration();
        }

        int hours = totalDuration/3600;
        int minutes  = totalDuration%3600/60;
        int seconds = totalDuration%3600%60;
        return "Total playlist duration: " + hours + " hours " + minutes + " minutes " + seconds + " seconds" ;
    }

}
