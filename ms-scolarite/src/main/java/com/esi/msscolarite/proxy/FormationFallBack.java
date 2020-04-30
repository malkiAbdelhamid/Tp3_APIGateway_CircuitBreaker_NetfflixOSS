package com.esi.msscolarite.proxy;

import com.esi.msscolarite.model.Formation;
import org.springframework.stereotype.Component;

@Component
public class FormationFallBack implements FormationProxy {
    @Override
    public Formation getFormation(Long idf) {
        return new Formation(idf,"php",0);
    }
}
