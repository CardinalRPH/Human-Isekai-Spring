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
@Table(name = "item")
public class Item {
    
    @Id
    private int itemId;

    private String itemName;

    private int damage;

    private String type;
    
    @ManyToOne
    @JoinColumn(name = "jobId", referencedColumnName = "jobId")
    private int jobId;
}
