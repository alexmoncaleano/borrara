package com.entorno.entornoDesarrollo.createEntorno.talent.values;

import com.entorno.entornoDesarrollo.createEntorno.talent.generic.ValueObject;
import lombok.*;


import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class AccountProfile implements ValueObject<AccountProfile.Props> {

    private String accountName;
    private String accountId;
    private List<BasicProfile> basicProfiles;



    @Override
    public Props value() {
        return new Props() {
            @Override
            public String accountName() {
                return accountName;
            }

            @Override
            public String accountId() {
                return accountId;
            }

            @Override
            public List<BasicProfile> basicProfile() {
                return basicProfiles;
            }
        };
    }


    public interface Props{
        String accountName();
        String accountId();
        List<BasicProfile> basicProfile();
    }
}
