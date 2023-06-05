package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;
import lombok.*;


import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BasicProfile implements ValueObject<BasicProfile.Props> {

    private String name;
    private String accountId;
    private String profileType;
    private List<Technology> selectedTechnologies;



    @Override
    public Props value() {
        return new Props() {
            @Override
            public String name() {
                return name;
            }

            @Override
            public String accountId() {
                return accountId;
            }

            @Override
            public String profileType() {
                return profileType;
            }

            @Override
            public List<Technology> selectedTechnologies() {
                return selectedTechnologies;
            }
        };
    }


    public interface Props {
        String name();
        String accountId();

        String profileType();
        List<Technology> selectedTechnologies();

    }
}
