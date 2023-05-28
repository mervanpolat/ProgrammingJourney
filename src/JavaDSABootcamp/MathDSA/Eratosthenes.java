package JavaDSABootcamp.MathDSA;
public class Eratosthenes {

    public static void main(String[] args) {
        Eratosthenes eratosthenes = new Eratosthenes(20);
        eratosthenes.sieben();
        eratosthenes.zeigePrimzahlen();
        //Die Primzahl: 2
        //Die Primzahl: 3
        //Die Primzahl: 5
        //Die Primzahl: 7
        //Die Primzahl: 11
        //Die Primzahl: 13
        //Die Primzahl: 17
        //Die Primzahl: 19
    }
    boolean[] zahlen;

    //Erzeugung eines Objekts namens Eratosthenes
    public Eratosthenes(int zahl){
        zahlen = new boolean[zahl];
    }

    public void sieben(){
        //Wir wissen ja, dass die Zahl 1 weder eine Primzahl noch eine Konstante ist
        //Sehr wichtig, in einem Array von Datentyp boolean, sind die 'default' Werte 'false'.
        zahlen[0] = true;

        //F: Welche Zahlen können wir rausfiltern?
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

        //A: Filtern: 1 2 3 [] 5 [] 7 [] [] [] 11 [] 13 [] 15 [] 17 [] 19 []
        //Weil die rausgefilterte Zahlen vielfache von 2 und 3 sind, können wir sie sowohl in 2er-Schritten als in
        //3er-Schritten rausfiltern, daraus folgt: 1 2 3 5 7 11 13 15 17 19

        //Wir fangen bei 2, weil die 1 ist weder eine Primzahl noch eine Konstante.
        int i = 2;
        //While Schleife so lange iterieren lassen bis wir an den Endpunkt vom boolean Array erreichen.
        while (i*i <= zahlen.length) {
            //Bedingung aufstellen, um die vielfachen zu eliminieren
            //Sehr wichtig, in einem Array von Datentyp boolean, sind die 'default' Werte 'false'.
            //!(false) -> true -> Negation
            if (!zahlen[i-1]) {
                //Die ganzen Vielfachen rausfiltern
                for (int j = i*i; j <= zahlen.length; j+=i) {
                    zahlen[j-1] = true;
                }
                //Das gleiche Prinzip für die restlichen Zahlen.
                //Was übrig bleibt sind die Primzahlen.
            }
            i++;
        }
    }
    //Ausgabe
    public void zeigePrimzahlen(){
        for (int i = 1; i <= zahlen.length; i++) {
            if (!zahlen[i-1]) System.out.println("Die Primzahl: " + i);
        }
    }
}
