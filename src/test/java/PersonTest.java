import org.junit.Assert;
import org.junit.Test;


import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test(){
        LocalDate birthdate = LocalDate.of(1996,3,22);
        Person person = new Person("Chris",birthdate, Person.Sex.MALE,"callen21@gmail.com",25);

        String expected1 = "Chris";
        String actual1 = person.getName();

        LocalDate expected2 = birthdate;
        LocalDate actual2 = person.getBirthday();

        Person.Sex expected3 = Person.Sex.MALE;
        Person.Sex actual3 = person.getGender();

        String expected4 = "callen21@gmail.com";
        String actual4 = person.getEmailAddress();

        int expected5 = 25;
        int actual5 = person.getAge();

        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
        Assert.assertEquals(expected4,actual4);
        Assert.assertEquals(expected5,actual5);

    }

}