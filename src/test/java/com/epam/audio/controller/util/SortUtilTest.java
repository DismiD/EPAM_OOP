package com.epam.audio.controller.util;

import com.epam.audio.model.entity.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortUtilTest {

    private Disc disc = new Disc();
    private List<MusicComposition> temp = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        temp.add(new BlazeJazz("Blaze & Fade Out", 365, "Seba"));
        temp.add(new HipHopMusic("Top Billin", 289, "Audio Two"));
        temp.add(new ElectronicMusic("One More Time", 317, "Daft Punk"));
        temp.add(new ClassicMusic("Symphony No. 5", 401, "Ludwig van Beethoven"));
        disc.setUserCollection(temp);

    }

    @Test
    public void sortCollection() {
       List<MusicComposition> expected = new ArrayList<>();
        expected.add(new BlazeJazz("Blaze & Fade Out", 365, "Seba"));
        expected.add(new ClassicMusic("Symphony No. 5", 401, "Ludwig van Beethoven"));
        expected.add(new ElectronicMusic("One More Time", 317, "Daft Punk"));
        expected.add(new HipHopMusic("Top Billin", 289, "Audio Two"));

        SortUtil.sortCollection(disc);

        List<MusicComposition> actual = disc.getUserCollection();

        assertEquals("Something wrong with sorting collection by style", expected, actual);
    }
}