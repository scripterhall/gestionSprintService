package com.ms.gestionSprints.gestionsprintsservice.services;

import com.ms.gestionSprints.gestionsprintsservice.entities.Sprint;
import com.ms.gestionSprints.gestionsprintsservice.repositories.SprintRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprintService {
    
    @Autowired
    private SprintRepository sprintRepository;
    public List<Sprint> findAllSprintsByProductBacklog(Long id){
        return this.sprintRepository.findAllByProductBacklogId(id);
    }
    public List<Sprint> findAllSprints(){
        return this.sprintRepository.findAll();
    }
    public Sprint createSprint(Sprint sprint) {
        return sprintRepository.save(sprint);
    }

    public Sprint modifierSprint(Sprint sp){
       
        return sprintRepository.save(sp);
    }

    public void supprimerSprint(Long id){
        this.sprintRepository.deleteById(id);
    }

    public Sprint getSprint(Long id){
        return sprintRepository.findById(id).get();
    }
}
