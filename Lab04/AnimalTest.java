public class AnimalTest {
  public static void main(String[] args) {
    Cow cow = new Cow();
    Pig pig = new Pig();
    Sheep sheep = new Sheep();
    Animal[] animals = { cow, pig, sheep };

    for (Animal animal : animals) {
      animal.talk();
    }
  }
}
