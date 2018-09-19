import java.util.ArrayList;

/**
 *
 * @author lison
 */
public class Phonebook {
    private ArrayList<Person> book;
    
    public Phonebook() {
        this.book = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
       this.book.add(new Person(name,number));
    }
    
    public void printAll() {
        for (Person one : this.book) {
            System.out.println(one);
        }
    }
    
    public String searchNumber(String name) {
        for (Person one : this.book) {
            if (one.getName().equals(name)) {
                return one.getNumber();
            }
        }
        return "number not known";
    }
}
