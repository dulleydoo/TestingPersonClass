import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = null;
        Integer expectedAge = 0;
        Character expectedGender = '\u0000';
        String expectedSound = null;
        Integer expectedWeight = 0;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Character actualGender = person.getGender();
        String actualSound = person.getSound();
        Integer actualWeight = person.getWeight();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedSound, actualSound);
        Assert.assertEquals(expectedWeight, actualWeight);

    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetGender(){
        //given
        Person person = new Person();
        Character expected = 'M';
        //when
        person.setGender('M');
        Character actual = person.getGender();
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSetSound(){
        //given
        Person person = new Person();
        String expected = "Hello";
        //when
        person.setSound("Hello");
        String actual = person.getSound();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHeight(){
        //given
        Person person = new Person();
        int expectedWeight = 130;
        //then
        person.setWeight(130);
        int actual = person.getWeight();

        //when
        Assert.assertEquals(expectedWeight, actual);
    }
}
