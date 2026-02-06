package sn.edu.isepat.vente_chaussure.entities;

import jakarta.persistence.*;

@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincremente l'id
    private Integer id;

    @Column(nullable = false,unique = true,length = 50)
    private String  nom;

    private String description;


}
