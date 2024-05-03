package _2024_05_03summury.event;

import javax.swing.border.EmptyBorder;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Events implements Comparable<Events>{
    private final LocalDateTime localDateTime;
    private final String  nameOfEvent;

    public Events(LocalDateTime localDateTime, String nameOfEvent) {
        this.localDateTime = localDateTime;
        this.nameOfEvent = nameOfEvent;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    @Override
    public String toString() {
        return "Events{" +
                "localDateTime=" + localDateTime +
                ", nameOfEvent='" + nameOfEvent + '\'' +
                '}';
    }

    @Override
    public int compareTo(Events o) {
        int res = this.getLocalDateTime().compareTo(o.localDateTime);
        if(res == 0){
            res = this.nameOfEvent.compareTo(o.nameOfEvent);
        }
        return res;
    }
}
