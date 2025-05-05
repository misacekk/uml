package uml;

import java.time.LocalDate;
import java.util.List;

public class Email extends Document{
    public String subject;
    public List<String> to;


    public String getSubject() {
        return subject;
    }
    public String getTo() {
        return to.toString();
    }
}
