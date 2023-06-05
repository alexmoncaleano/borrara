package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;


import java.util.Objects;

public class Skill implements ValueObject<Skill.Props> {
    public String tecnologia;
    public Integer nivel;

    public Skill(String tecnologia, Integer nivel) {
        this.tecnologia = tecnologia;
        this.nivel = nivel;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tecnologia() {
                return tecnologia;
            }

            @Override
            public Integer nivel() {
                return nivel;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(tecnologia, skill.tecnologia) && Objects.equals(nivel, skill.nivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tecnologia, nivel);
    }

    public interface Props{
        String tecnologia();
        Integer nivel();
    }
}