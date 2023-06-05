package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;


import java.util.List;

public class SelectProfile implements ValueObject<SelectProfile.Props> {

    private String profileName;
    private String profileId;
    private Float fitPercentage;
    private List<Technology> opportunitieImprovement;

    public SelectProfile(String profileName, String profileId, Float fitPercentage, List<Technology> opportunitieImprovement) {
        this.profileName = profileName;
        this.profileId = profileId;
        this.fitPercentage = fitPercentage;
        this.opportunitieImprovement = opportunitieImprovement;
    }

    public SelectProfile(){}

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Float getFitPercentage() {
        return fitPercentage;
    }

    public void setFitPercentage(Float fitPercentage) {
        this.fitPercentage = fitPercentage;
    }

    public List<Technology> getOpportunitieImprovement() {
        return opportunitieImprovement;
    }

    public void setOpportunitieImprovement(List<Technology> opportunitieImprovement) {
        this.opportunitieImprovement = opportunitieImprovement;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String profileName() {
                return profileName;
            }

            @Override
            public String profileId() {
                return profileId;
            }

            @Override
            public Float fitPercentage() {
                return fitPercentage;
            }

            @Override
            public List<Technology> opportunitieImprovement() {
                return opportunitieImprovement;
            }
        };
    }


    public interface Props {
        String profileName();
        String profileId();
        Float fitPercentage();
        List<Technology> opportunitieImprovement();



    }
}
