package com.epam.audio.model.entity;

public class ClassicMusic extends BaseComposition {


    public ClassicMusic(String compositionName, Integer duration, String performerName) {
        super(compositionName, duration, performerName);
    }

    public void playMusicComposition() {
        System.out.println("I am playing Classic song");
    }

    public String getCompositionName(){
        return compositionName;
    }
    public void  setCompositionName(String compositionName){
        this.compositionName = compositionName;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getPerformerName(){
        return performerName;
    }
    public void setPerformerName(String performerName){
        this.performerName = performerName;
    }
}
