
public class StudentTest {
    public static void main(String[] args) {

        // testing the mutable student
        MutableStudent student1 = new MutableStudent("liam", 16);

        System.out.println("mutable student before changes:");
        System.out.println("name: " + student1.getName());
        System.out.println("age: " + student1.getAge());

        // changing the same object with setters
        student1.setName("john");
        student1.setAge(17);

        System.out.println("\nmutable student after changes:");
        System.out.println("name: " + student1.getName());
        System.out.println("age: " + student1.getAge());

        // testing the immutable student
        ImmutableStudent student2 = new ImmutableStudent("liam", 16);

        System.out.println("\noriginal immutable student:");
        System.out.println("name: " + student2.getName());
        System.out.println("age: " + student2.getAge());

        // immutable students have no setters so we make a new object
        // student2.setAge(17); would not work

        ImmutableStudent student3 = new ImmutableStudent("john", 17);

        System.out.println("\nnew immutable student:");
        System.out.println("name: " + student3.getName());
        System.out.println("age: " + student3.getAge());

        // the original object still has the same values
        System.out.println("\noriginal immutable student again:");
        System.out.println("name: " + student2.getName());
        System.out.println("age: " + student2.getAge());
    }
}
