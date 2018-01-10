package com.mine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private String description;
    private String organiser;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
