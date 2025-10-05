public class App {
    public static void main(String[] args) throws Exception {

        int ika = 18;

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
        else {
            System.out.println("Olet aikuinen");
        }

    } 
}     