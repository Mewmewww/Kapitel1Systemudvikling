import java.util.Random;

public class Opgavefire_Selektion {
    public static void main(String[] args) {
        // Input værdier - 50 42 12.
        // Forventet output 50
        // Aktuel værdi 50
        int x;
        int y;
        int z;

        x = 50;
        y = 42;
        z = 12;
        System.out.println("Test 1");
        Test(x,y,z);

        // Input værdier - 12 40 16.
        // Forventet output 40
        // Aktuel værdi 40
        x = 12;
        y = 40;
        z = 16;
        System.out.println("Test 2");
        Test(x,y,z);

        // Input værdier - 12 15 30.
        // Forventet output 30
        // Aktuel værdi 30
        x = 12;
        y = 15;
        z = 30;
        System.out.println("Test 3");
        Test(x,y,z);

        // Input værdier - 12, 12, 12.
        // Forventet output 12
        // Aktuel værdi 12
        x = 12;
        y = 12;
        z = 12;
        System.out.println("Test 4");
        Test(x,y,z);
    }

    public static void Test(int first, int second, int third)
    {
        if (first > second && first > third) {
            System.out.println(first + "=x");
            System.out.println("First is greater than the rest"); // <- Aktuelt output
        } else {
            if (second > first && second > third) {
                System.out.println(second + "=y");
                System.out.println("Second is greater than the rest");
            } else {
                if (third > first && third > second) {
                    System.out.println(third + "=z");
                    System.out.println("Third is greater than the rest");
                } else {
                    System.out.println(first);
                    System.out.println(second);
                    System.out.println(third);
                    System.out.println("All is equal");
                }
            }
        }
    }
}
