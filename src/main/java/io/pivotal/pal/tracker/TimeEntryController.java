package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeEntryController {

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
    }

    //CREATE
    public ResponseEntity create(TimeEntry timeEntryToCreate) {
      return null;
    }

    //READ
    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        return null;
    }

    //UPDATE
    public ResponseEntity update(long timeEntryId, TimeEntry expected) {
        return null;
    }

    //DELETE
    public ResponseEntity delete(long timeEntryId) {
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

}
