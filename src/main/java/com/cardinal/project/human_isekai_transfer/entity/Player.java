package com.cardinal.project.human_isekai_transfer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "player")
public class Player {
    
    @Id
    private int playerId;
    
    private String firstName;

    private String lastName;

    @ManyToOne
    @JoinColumn(name = "jobId", referencedColumnName = "jobId")
    private int jobId;

    @ManyToOne
    @JoinColumn(name = "worldId", referencedColumnName = "jobId")
    private int worldId;

    private int coin;


}
