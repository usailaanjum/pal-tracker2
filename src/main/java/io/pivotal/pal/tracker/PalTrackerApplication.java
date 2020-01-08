package io.pivotal.pal.tracker;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
<<<<<<< HEAD
=======
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
>>>>>>> 65651fe... Add TimeEntry MVC in memory

@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args){

        SpringApplication.run(PalTrackerApplication.class, args);
    }

    @Bean
<<<<<<< HEAD
    public TimeEntryRepository timeEntryRepository(){
        return timeEntryRepository();
    }




=======
    TimeEntryRepository timeEntryRepository() {
        return new InMemoryTimeEntryRepository();
    }
>>>>>>> 65651fe... Add TimeEntry MVC in memory
}
