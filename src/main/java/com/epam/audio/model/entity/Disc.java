package com.epam.audio.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Disc {
    private List<MusicComposition> userCollection = new ArrayList<>();

    public List<MusicComposition> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(List<MusicComposition> userCollection) {
        this.userCollection = userCollection;
    }

    public void removeComposition(){
    }

    public void addComposition(MusicComposition music){

        userCollection.add(music);
    }
}
