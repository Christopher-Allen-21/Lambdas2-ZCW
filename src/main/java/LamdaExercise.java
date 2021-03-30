import java.util.ArrayList;
import java.util.List;

public class LamdaExercise implements CheckPerson{

    List<Person> personRoster;

    public LamdaExercise(List<Person> personRoster){
        this.personRoster = personRoster;
    }

    public LamdaExercise(){
        this.personRoster = new ArrayList<>();
    }

    public void addPerson(Person person){
        personRoster.add(person);
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(Person p) {
        if(p.getAge() > 21 && p.getGender()== Person.Sex.MALE){
            return true;
        }
        return false;
    }
}
