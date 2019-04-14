package com.epam.audio.controller.util;

import com.epam.audio.model.entity.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SearchUtilTest {
    private Disc disc = new Disc();
    private List<MusicComposition> temp = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
        temp.add(new BlazeJazz("Blaze & Fade Out", 365, "Seba"));
        temp.add(new HipHopMusic("Top Billin", 289, "Audio Two"));
        temp.add(new ElectronicMusic("One More Time", 317, "Daft Punk"));
        disc.setUserCollection(temp);
    }

    @Test
    public void findCompositionsByDuration() {

        List<MusicComposition> expected = new ArrayList<>();
        expected.add(new HipHopMusic("Top Billin", 289, "Audio Two"));

        List<MusicComposition> actual =  SearchUtil.findCompositionsByDuration(235, 316,disc);

        assertEquals("Something wrong with finding compositions by duration", expected, actual);

    }
}