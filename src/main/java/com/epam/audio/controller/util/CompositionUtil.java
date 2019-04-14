package com.epam.audio.controller.util;

import com.epam.audio.model.entity.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompositionUtil {
    private static  Map<String, MusicComposition> compositionCollection = new LinkedHashMap<>();



    public static void init(){
        compositionCollection.put("1", new BlazeJazz("Blaze & Fade Out", 365, "Seba"));
        compositionCollection.put("2", new ClassicMusic("Canon in D major", 443, "Johann Pachelbel"));
        compositionCollection.put("3", new BlazeJazz("Blow Up", 307, "Shinji Takeda"));
        compositionCollection.put("4", new ElectronicMusic("Eple", 204, "Röyksopp "));
        compositionCollection.put("5", new BlazeJazz("Take Five", 281, "Dave Brubeck"));
        compositionCollection.put("6", new ClassicMusic("The Four Seasons", 389, "Antonio Vivaldi"));
        compositionCollection.put("7", new BlazeJazz("Take The A Train", 246, "Duke Ellington"));
        compositionCollection.put("8", new ClassicMusic("Peer Gynt Suite", 372, "Edvard Grieg"));
        compositionCollection.put("9", new ClassicMusic("Adagio for Strings", 409, "Samuel Barber"));
        compositionCollection.put("10", new HipHopMusic("Top Billin", 289, "Audio Two"));
        compositionCollection.put("11", new HipHopMusic("Push It", 209, "Salt-N-Pepa"));
        compositionCollection.put("12", new ElectronicMusic("One More Time", 317, "Daft Punk"));
        compositionCollection.put("13", new HipHopMusic("That’s the Joint", 276, "Funky 4 + 1"));
        compositionCollection.put("14", new ElectronicMusic(" Angel", 408, "Massive Attack"));
        compositionCollection.put("15", new BlazeJazz("Winter Truce", 248, "Django Bates"));
        compositionCollection.put("16", new ElectronicMusic("Porcelain", 249, "Moby"));
        compositionCollection.put("17", new HipHopMusic("The Symphony", 308, "Marley Marl"));
        compositionCollection.put("18", new HipHopMusic("Lost Ones", 703, "Lauryn Hill"));
        compositionCollection.put("19", new ClassicMusic("Symphony No. 5", 401, "Ludwig van Beethoven"));
        compositionCollection.put("20", new ElectronicMusic("Teardrop", 307, "Massive Attack"));

    }

    public static Map<String, MusicComposition> getCompositionCollection() {
        return compositionCollection;
    }
}
