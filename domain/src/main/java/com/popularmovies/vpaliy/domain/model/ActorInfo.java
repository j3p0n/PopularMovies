package com.popularmovies.vpaliy.domain.model;

import java.util.List;

public class ActorInfo {

    private String actorId;
    private String birthday;
    private String birthplace;
    private String bioDescription;
    private List<String> imagePaths;

    public ActorInfo(String actorId){
        this.actorId=actorId;
    }

    public String getActorId() {
        return actorId;
    }


    public List<String> getImagePaths() {
        return imagePaths;
    }

    public String getBioDescription() {
        return bioDescription;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public void setBioDescription(String bioDescription) {
        this.bioDescription = bioDescription;
    }


    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setImagePaths(List<String> imagePaths) {
        this.imagePaths = imagePaths;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
