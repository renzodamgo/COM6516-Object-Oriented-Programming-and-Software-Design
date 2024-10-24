public class TestPerson {
  public static void main(String[] args) {
    Person person = new Person("John Doe", "1980-01-01");
    Student student = new Student("Jane Smith", "1995-05-15", "Computer Science");
    Tutor tutor = new Tutor("Dr. Brown", "1970-12-31", "Room 401");

    System.out.println(person);
    System.out.println(student);
    System.out.println(tutor);
  }
}
