package com.sda.javagda17.checklist.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Checklist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private boolean archived;
    private LocalDateTime dateCreated;
    private LocalDateTime dateCompleted;

    @OneToMany(mappedBy = "checklist", fetch = FetchType.EAGER)
    private List<ChecklistItem> checklistItemList = new ArrayList<>();
}
