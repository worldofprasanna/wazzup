package com.mine.api;

import com.mine.model.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class EventController {

    @GetMapping("/events")
    List<Event> getListOfEvents() {
        LocalDate workshopDate = LocalDate.of(2017, 11, 10);
        Event event = new Event("AWS - Workshop",
                "Prasanna",
                LocalDateTime.of(workshopDate, LocalTime.of(10, 0, 0)),
                LocalDateTime.of(workshopDate, LocalTime.of(16, 0, 0)));
        return Collections.singletonList(event);
    }

}
