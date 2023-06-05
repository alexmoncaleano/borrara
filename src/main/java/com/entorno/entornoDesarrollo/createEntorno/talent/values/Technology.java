package com.entorno.entornoDesarrollo.createEntorno.talent.values;


import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;


public class Technology implements ValueObject<Technology.Props> {
    private String name;
    private Boolean isRequired;
    private Integer level;

    public Technology(String name, Boolean isRequired, Integer level) {
        this.name = name;
        this.isRequired = isRequired;
        this.level = level;
    }

    public Technology() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRequired() {
        return isRequired;
    }

    public void setRequired(Boolean required) {
        isRequired = required;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String name() {
                return name;
            }

            @Override
            public Boolean isRequired() {
                return isRequired;
            }

            @Override
            public Integer level() {
                return level;
            }
        };
    }


    public interface Props{
        String name();
        Boolean isRequired();
        Integer level();
    }
}
