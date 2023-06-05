package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;


import java.util.List;
import java.util.Objects;

public class Profile implements ValueObject<Profile.Props> {
    public String profileName;
    public List<Skill> skillList;

    public Profile(String profile, List<Skill> skillList) {
        this.profileName = profile;
        this.skillList = skillList;
    }
    public Profile(){}

    public Profile(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "profile='" + profileName + '\'' +
                ", skillList=" + skillList +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile1 = (Profile) o;
        return Objects.equals(profileName, profile1.profileName) && Objects.equals(skillList, profile1.skillList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileName, skillList);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String profileName() {
                return profileName;
            }

            @Override
            public List<Skill> skillsList() {
                return skillList;
            }
        };
    }

    public interface Props{
        String profileName();
        List<Skill> skillsList();
    }
}
