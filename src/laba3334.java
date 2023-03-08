
public class laba3334 {
    public static void main(String[] args) {
        String pitannya=("-");

        switch (pitannya) {
            case "так":
            case "ок":
            case "yes":
            case "y":
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "ні":
            case "no":
            case "n":
            case "-":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Неправильний ввід. Будь ласка, введіть Так або Ні.");
                break;
        }
    }
}
