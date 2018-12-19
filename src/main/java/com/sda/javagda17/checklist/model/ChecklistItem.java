package com.sda.javagda17.checklist.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

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

    @Column(unique = true)
    private String name;

    @Length(max = 300)
    private String content;

    @CreationTimestamp
    private LocalDateTime dateCompleted;

    @ManyToOne(fetch = FetchType.EAGER)
    private Checklist checklist;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Notes> notesList = new ArrayList<>();
}
