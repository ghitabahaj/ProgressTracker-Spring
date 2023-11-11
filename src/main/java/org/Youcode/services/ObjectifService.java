package org.Youcode.services;

import org.Youcode.entities.Objectif;
import org.Youcode.repositories.ObjectifRepository;

import java.util.List;
import java.util.Optional;

public class ObjectifService {

    ObjectifRepository objectifRepository;

    public ObjectifService (ObjectifRepository objectifRepository){
        this.objectifRepository = objectifRepository;
    }

    public void saveObjectif(Objectif objectif){
        objectifRepository.save(objectif);
    }

    public void deleteObjective(Objectif objective){
        objectifRepository.delete(objective);
    }

    public List<Objectif> getAllObjectives(){
        return objectifRepository.findAll();
    }

    public Optional<Objectif> getObjective(Long id){
        return objectifRepository.findById(id);
    }
}
