public class Tutor extends Person {
  private String office;

  public Tutor(String name, String dateOfBirth, String office) {
    super(name, dateOfBirth);
    this.office = office;
  }

  @Override
  public String toString() {
    return super.toString() + ", Office: " + office;
  }
}