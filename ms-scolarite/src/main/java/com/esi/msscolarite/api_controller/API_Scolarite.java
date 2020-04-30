package com.esi.msscolarite.api_controller;

import com.esi.msscolarite.dao.EtudiantRepository;
import com.esi.msscolarite.entities.Etudiant;
import com.esi.msscolarite.proxy.FormationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class API_Scolarite {

    @Autowired
    EtudiantRepository etudiantRepository;


    @Autowired
    FormationProxy formationProxy;

    @GetMapping("/etudiant/{id}")
    Etudiant getEtudiantWithFormation(@PathVariable("id") Long  ide)
    {
        Etudiant etudiant=etudiantRepository.findById(ide).get();

        etudiant.setFormation(formationProxy.getFormation(etudiant.getIdFormation()));

        return etudiant;
    }


}
