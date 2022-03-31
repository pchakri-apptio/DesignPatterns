package Builder;

import creationalDesignPattern.Builder.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StudentTest {

    @Test
    public void builderTest(){
        Student.StudentBuilder studentBuilder = new Student.StudentBuilder().setName("praveen");
        Student s = studentBuilder.build();

        assertEquals("if student object is created","praveen",s.name);
    }
}
