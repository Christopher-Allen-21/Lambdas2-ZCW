import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LamdaExerciseTest {

    LocalDate birthdate = LocalDate.of(1996,3,22);
    LocalDate birthdate2 = LocalDate.of(1998,5,22);
    Person person1 = new Person("Chris",birthdate, Person.Sex.MALE,"callen21@gmail.com",25);
    Person person2 = new Person("Stephen",birthdate2, Person.Sex.MALE,"sallen21@gmail.com",22);
    Person person3 = new Person("Elizabeth",birthdate2, Person.Sex.FEMALE,"eallen21@gmail.com",22);


    @Test
    public void test1(){
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        LamdaExercise lamdaExercise = new LamdaExercise(personList);

        boolean expected = true;
        boolean actual = lamdaExercise.test(person1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2(){
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        LamdaExercise lamdaExercise = new LamdaExercise(personList);

        boolean expected = true;
        boolean actual = lamdaExercise.test(person2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test3(){
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        LamdaExercise lamdaExercise = new LamdaExercise(personList);

        boolean expected = false;
        boolean actual = lamdaExercise.test(person3);

        Assert.assertEquals(expected,actual);
    }
}