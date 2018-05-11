package com.mine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="events")
public class Event {
    @Id
    private Integer id;
    private String description;
    private String organiser;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
