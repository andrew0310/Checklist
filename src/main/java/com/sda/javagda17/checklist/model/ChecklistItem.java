package com.sda.javagda17.checklist.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class ChecklistItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @CreationTimestamp
    private LocalDateTime dateCompleted;

    @ManyToOne
    private Checklist checklist;

    @OneToMany(mappedBy = "checklistItem", fetch = FetchType.EAGER)
    private List<Notes> notesList = new ArrayList<>();
}
