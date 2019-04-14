package com.epam.audio.controller.util;

import com.epam.audio.model.entity.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DurationUtilTest {
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
    public void calculateTotalDuration() {

        String actual = DurationUtil.calculateTotalDuration(disc);
        String expected = "Total playlist duration: " + 0 + " hours " + 16 + " minutes " + 11 + " seconds";

        assertEquals("Something wrong with calculation of total duration", actual, expected);
    }
}