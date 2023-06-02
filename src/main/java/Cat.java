import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cat {
    private int id;
    private String name;
    private double age;
    private String color;
    private Category category;
    private ArrayList<Habit> habits;
    private String additionalInfo;
//    @JsonSerialize(using = LocalDateSerializer.class)
//    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate birth;
}

class Habit {
    private String name;
    private String description;
    private Boolean good;
}

