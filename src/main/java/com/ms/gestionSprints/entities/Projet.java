package com.ms.gestionSprints.entities;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Projet {
    
    private Long id;
    private String nom; 
    private String cles; 
    private Date dateDebut; 
    private Long chefProjetId;
    private Date dateFin; 

}
