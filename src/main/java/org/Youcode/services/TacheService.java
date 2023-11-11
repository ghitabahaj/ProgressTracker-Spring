package org.Youcode.services;

import org.Youcode.entities.Tache;
import org.Youcode.repositories.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class TacheService {
    private TacheRepository tacheRepository;

    @Autowired
    public TacheService(TacheRepository tacheRepository){
        this.tacheRepository = tacheRepository;
    }

    public void saveTask(Tache tache){
        tacheRepository.save(tache);
    }

    public void deleteTask(Tache tache){
        tacheRepository.delete(tache);
    }

    public List<Tache> findTasks(){
        return tacheRepository.findAll();
    }

    public Optional<Tache> findTask(Long id){
        return  tacheRepository.findById(id);
    }
}
