package _2024_05_05summury.event;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventsDemo {
    public static void main(String[] args) {
        Events events = new Events(LocalDateTime.now(),"summury Java");
        Events events1 = new Events(LocalDateTime.now().minusDays(1L),"Practice");
        Events events2 = new Events(LocalDateTime.of(2024,5,6,10,0),"Collocvium");
        Events events3 = new Events(LocalDateTime.of(2024,5,6,10,0),"Additional");
        List<Events> eventsList = new ArrayList<>(List.of(events2,events1,events3,events));
        Collections.sort(eventsList);
        eventsList.forEach(e-> System.out.println(e));

    }
}
