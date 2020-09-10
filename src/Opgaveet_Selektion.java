public class Opgaveet_Selektion {
    // Lad der være givet følgende erklæring.
    // Input = værdi
    // Forventet output = true/false
    // Aktuelt output = true/false
    int x = 5;
    int y = 8;
    int z = 3;
    /* Evaluer følgende boolske udtryk:
    A: x <= 5 && z != y

    Input: x = 5, z = 3, y = 8
    Forventet % Aktuelt output - True

    Forventet output baseres på enten true eller false - ved et kig på udtrykket, som forventer opgaven at så længe
    x <= 5, så er venstre side true. Højre side er korrekt hvis z != 8 - hvilket også er korrekt.
    Ergo, så må det forventede output være true.
    Sammenligning med det aktuelle output, så er de begge true.
    */

    /*
    B) X == 5 || x == y && z == 3
    || = or - derfor behøver kun én at gælde.
    Forventet output true
    Aktuel output true
    Årsag: X = 5.
    */

    /*
    C) x / y > z / x
    Dividerer først x (5) med y (8). Bemærk, at hvis man dividerer med to integers, så runder Java ned.
    På samme måde gælder det også med z og x. Begge udregninger ender op med resultatet på 0 og derfor kan
    x / y ikke være større end z / x.
    Forventet output - false
    Aktuelt output - false
    */

    /*
    D) !(5 != 8 - 3) == false
    Siden at resultatet inde i parentesen rent faktisk giver 5 på begge sider af lighedstegnet, så må det være:
    Forventet output - false
    Aktuelt output - false
    */

    /*
    E) 2 * x != x || x == 0
    Forventet output true
    Aktuelt output true
    Årsag: 2 * 5 = 10, 10 er ikke lig 5.
    */

    /*

    F) ! true || ! false
    Forvented output - true
    Aktuelt output - true
    */
}
