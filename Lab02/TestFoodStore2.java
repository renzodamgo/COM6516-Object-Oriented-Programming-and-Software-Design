
import sheffield.EasyReader;

public class TestFoodStore2 {

    public static void main(String[] args) {
        // Create an instance of TestFoodStore2
        TestFoodStore2 foodStore = new TestFoodStore2();
        FoodStore foodStoreInstance = new FoodStore(10);

        EasyReader reader = new EasyReader();

        while (true) {  // Added loop to continue program
            System.out.println("Do you want to deposit food? (1)");
            System.out.println("Do you want to withdraw food? (2)");
            System.out.println("Exit (3)");

            String answer = reader.readString();

            switch (answer) {
                case "1":
                    System.out.println("How much food do you want to deposit?");
                    int depositAmount = reader.readInt();
                    foodStore.deposit(depositAmount);  // Call on instance
                    break;
                case "2":
                    System.out.println("How much food do you want to withdraw?");
                    int withdrawAmount = reader.readInt();
                    if (withdrawAmount > FoodStore.getAmountStored()) {
                        System.out.println("Not enough food in the store");
                        break;
                    }
                    foodStore.withdraw(withdrawAmount);
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    public void deposit(int depositAmount) {
        FoodStore.depositFood(depositAmount);
        System.out.printf("Amount deposited: %d%n", depositAmount);  // Fixed format
        System.out.printf("Total food: %d%n", FoodStore.getAmountStored());  // Fixed format
    }

    public void withdraw(int withdrawAmount) {
        FoodStore.withdrawFood(withdrawAmount);
        System.out.printf("Amount withdrawn: %d%n", withdrawAmount);  // Fixed text and format
        System.out.printf("Total food: %d%n", FoodStore.getAmountStored());  // Fixed format
    }
}
