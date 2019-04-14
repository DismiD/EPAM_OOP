package com.epam.audio.controller.util;

import com.epam.audio.model.entity.*;

import java.util.ArrayList;
import java.util.List;

public class SortUtil {

    private static List<MusicComposition> blazeJaz = new ArrayList<>();
    private static List<MusicComposition> classicMusic = new ArrayList<>();
    private static List<MusicComposition> electronicMusic = new ArrayList<>();
    private static List<MusicComposition> hipHopMusic = new ArrayList<>();
    private static List<MusicComposition> finalCollection = new ArrayList<>();



    private static void sortByClass ( List<MusicComposition> tempCollection){
        for (MusicComposition composition : tempCollection) {
            if (composition instanceof BlazeJazz){
                blazeJaz.add(composition);
            }
            if (composition instanceof ClassicMusic){
                classicMusic.add(composition);
            }
            if (composition instanceof HipHopMusic){
                hipHopMusic.add(composition);
            }
            if (composition instanceof ElectronicMusic){
                electronicMusic.add(composition);
            }

        }
    }
        private static void sortedCollectionJoin(){
        finalCollection.addAll(blazeJaz);
        finalCollection.addAll(classicMusic);
        finalCollection.addAll(electronicMusic);
        finalCollection.addAll(hipHopMusic);

        }

        public static void sortCollection(Disc disc){

            List<MusicComposition> tempCollection = disc.getUserCollection();
            sortByClass(tempCollection);
            sortedCollectionJoin();
            disc.setUserCollection(finalCollection);
        }

        }



