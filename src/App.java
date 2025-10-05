public class App {
    public static void main(String[] args) throws Exception {

        int ika = 20;

        // Tulostusehdot
        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
            if (ika == 16 || ika == 17) {
                System.out.println("Saat ajaa kevaria!");
            }

       
              
        }
        else if (ika == 18) 
        {
                System.out.println("Onnea, olet tullut täysi-ikäiseksi ja nyt saat ajaa autoa!"); 
        }
        else if (ika >= 65)
        {
            System.out.println("Olet eläkeläinen");
        }
        else if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60 || ika == 70 || ika == 80 || ika == 90)
        {
            System.out.println("Onnittelut tasavuosikymmennestä!");
        }

        else {
            System.out.println("Olet aikuinen");
        }

    } 
}     