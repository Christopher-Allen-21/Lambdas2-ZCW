import java.util.ArrayList;
import java.util.List;

public class LamdaExercise{

    public interface CheckPerson {
        boolean test(Person p);
    }

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


    public static class LocalClass implements CheckPerson{
        @Override
        public boolean test(Person p) {
            if(p.getAge()>21 && p.getGender()== Person.Sex.MALE){
                return true;
            }
            return false;
        }
    }

    private CheckPerson anonymous = new CheckPerson() {
        @Override
        public boolean test(Person p) {
            if (p.getAge() > 21 && p.getGender() == Person.Sex.MALE) {
                return true;
            }
            return false;
        }
    };


    private CheckPerson lamda = person -> person.getAge() > 21 && person.getGender() == Person.Sex.MALE;

    public CheckPerson getAnonymous(){
        return anonymous;
    }

    public CheckPerson getLamda(){
        return lamda;
    }




}
