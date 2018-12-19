package com.sda.javagda17.checklist.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @ManyToOne
    private ChecklistItem checklistItem;
}
