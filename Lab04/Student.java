public class Student extends Person {
  private String course;

  public Student(String name, String dateOfBirth, String course) {
    super(name, dateOfBirth);
    this.course = course;
  }

  @Override
  public String toString() {
    return super.toString() + ", Course: " + course;
  }
}
