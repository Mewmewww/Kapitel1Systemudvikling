public class Opgaveto_selektion {
    public static void main(String[] args) {
        //Opgavebeskrivelse: Erklærer 2 variabler, x og y.
        // Startinput: 41 og 67.
        // Forventede output: True
        int x;
        int y;
        // Lægger summeen af disse to tal sammen

        x = 41;
        y = 67;
        System.out.println("Test 1");
        Test(x, y);

        // Startinput: 40 og 60.
        // Forventede output: False
        x = 40;
        y = 60;
        System.out.println("Test 2");
        Test(x,y);

        // Startinput: 30 og 20.
        // Forventede output: False
        x = 30;
        y = 20;
        System.out.println("Test 3");
        Test(x,y);
    }
    public static void Test(int first, int second) {
        if (first + second > 100) {
                System.out.println("The result is greater than 100");
        }
        else {
            if (first + second < 100) {
                System.out.println("The result is lower than 100");
            }
        else {
            if (first + second == 100) {
                System.out.println("The result is equal to 100");
                }
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}
