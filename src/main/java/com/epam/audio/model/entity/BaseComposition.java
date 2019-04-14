package com.epam.audio.model.entity;


import java.util.Objects;

public abstract  class BaseComposition implements MusicComposition {
     String compositionName;
     int duration;
     String performerName;

     public BaseComposition(String compositionName, int duration, String performerName) {
          this.compositionName = compositionName;
          this.duration = duration;
          this.performerName = performerName;
     }


     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          BaseComposition that = (BaseComposition) o;
          return duration == that.duration &&
                  Objects.equals(compositionName, that.compositionName) &&
                  Objects.equals(performerName, that.performerName);
     }

     @Override
     public int hashCode() {
          return Objects.hash(compositionName, duration, performerName);
     }
}

