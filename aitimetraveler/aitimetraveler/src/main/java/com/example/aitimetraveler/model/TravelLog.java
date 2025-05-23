package com.example.aitimetraveler.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TravelLogs")
public class TravelLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer log_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "narrative_id", nullable = true)
    private Narrative narrative;

    private String destination;

    private String time_period;

    @Column(name = "travel_date", updatable = false)
    private Timestamp travel_date;

    // Getters and Setters
    public Integer getLog_id() {
        return log_id;
    }

    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Narrative getNarrative() {
        return narrative;
    }

    public void setNarrative(Narrative narrative) {
        this.narrative = narrative;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime_period() {
        return time_period;
    }

    public void setTime_period(String time_period) {
        this.time_period = time_period;
    }

    public Timestamp getTravel_date() {
        return travel_date;
    }

    public void setTravel_date(Timestamp travel_date) {
        this.travel_date = travel_date;
    }
}
