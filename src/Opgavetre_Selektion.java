import java.util.Random;

public class Opgavetre_Selektion {
public static void main(String[] args) {
    /* Erklærer to variable first og second, som er frivillige at bestemme.
       Undersøg hvilken af de to variable der har den største værdi og udskriver denne.
    */
    //Random random = new Random();
    int x;
    int y;

    // Startinput: 41 og 67.
    // Forventede output
    x = 10;
    y = 11;
    System.out.println("Test 1");
    Test(x, y);

    x = 11;
    y = 10;
    System.out.println("Test 2");
    Test(x, y);

    x = 10;
    y = 10;
    System.out.println("Test 3");
    Test(x, y);

}
    public static void Test(int first, int second) {
        if (first > second) {
                System.out.println(first + "=y");
                System.out.println("First variable is greater than second");
        } else if (second > first) {
                System.out.println(second + "=x");
                System.out.println("Second variable is greater than first");
            } else if (first == second) {
                System.out.println(first + "=y");
                System.out.println(second + "=x");
                System.out.println("First and second is equal");
        }
    }
}

