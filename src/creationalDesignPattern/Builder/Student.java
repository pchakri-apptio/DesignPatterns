package creationalDesignPattern.Builder;

public class Student {
    public String name;
    String address;
    int age;
    int height;
    int weight;
    String x;

    private Student(){}

    public static class StudentBuilder extends Student{

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name1) {
            name = name1;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address1) {
            address = address1;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age1) {
            age = age1;
            return this;
        }

        public int getHeight() {
            return height;
        }

        public StudentBuilder setHeight(int height1) {
            height = height1;
            return this;
        }

        public int getWeight() {
            return weight;
        }

        public StudentBuilder setWeight(int weight1) {
            weight = weight1;
            return this;
        }

        public String getX() {
            return x;
        }

        public StudentBuilder setX(String x1) {
            x = x1;
            return this;
        }

        public Student build(){
            Student s = new Student();
            s.name = name;
            s.age = age;
            s.height = height;
            s.weight = weight;
            s.x = x;
            s.address = address;
            return s;
        }
    }
}
