package com.epam.audio.controller.util;

import com.epam.audio.model.entity.Disc;
import com.epam.audio.model.entity.MusicComposition;

import java.util.ArrayList;
import java.util.List;

public class SearchUtil {

    public static List<MusicComposition> findCompositionsByDuration(int min, int max, Disc disc) {

        List<MusicComposition> foundCompositions = new ArrayList<>();

        List<MusicComposition> initialList = new ArrayList<>(disc.getUserCollection());

        for (MusicComposition composition : initialList) {
            if (composition.getDuration() >= min && composition.getDuration()<= max ){
                foundCompositions.add(composition);
            }
        }
        return foundCompositions;
    }
}
