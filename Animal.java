import java.time.LocalDate;

public class Animal {
    private String name;
    private LocalDate birth;
    private String command;

    public Animal(String name, LocalDate birth, String command){
        this.name = name;
        this.birth = birth;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", birth=" + birth + ", command=" + command + "]";
    }
    
}
