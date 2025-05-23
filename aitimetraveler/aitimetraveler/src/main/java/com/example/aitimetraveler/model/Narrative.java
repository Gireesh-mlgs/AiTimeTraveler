package com.example.aitimetraveler.model;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "Narratives")
public class Narrative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer narrative_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(name = "generated_at", updatable = false)
    private Timestamp generated_at;

    // One narrative can have many travel logs
    @OneToMany(mappedBy = "narrative", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TravelLog> travelLogs;

    // Getters and Setters
    public Integer getNarrative_id() {
        return narrative_id;
    }

    public void setNarrative_id(Integer narrative_id) {
        this.narrative_id = narrative_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getGenerated_at() {
        return generated_at;
    }

    public void setGenerated_at(Timestamp generated_at) {
        this.generated_at = generated_at;
    }

    public List<TravelLog> getTravelLogs() {
        return travelLogs;
    }

    public void setTravelLogs(List<TravelLog> travelLogs) {
        this.travelLogs = travelLogs;
    }
}
