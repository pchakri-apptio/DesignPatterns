import creationalDesignPattern.Builder.Student;

public class ClientClass {

    public static void main(String[] args) {
//        StringUtility s = new SubStringUtility();
//        s.printValue("10");
//
//        SingletonClass sc = new SubSingletonClass();
//        sc.printValue("jdke");
        Student student = new Student.StudentBuilder().setName("pravenn").setAge(2).build();
    }
}
