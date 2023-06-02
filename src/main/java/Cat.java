import java.time.LocalDate;
import java.util.ArrayList;

public class Cat {
    private int id;
    private String name;
    private double age;
    private String color;
    private Category category;
    private ArrayList habits;
    private String additionalInfo;
    private LocalDate birth;
}
class Category {
    private String name;
    private String description;
}

