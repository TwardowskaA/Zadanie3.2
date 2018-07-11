public class Prostokat {

    double bokP1;
    double bokP2;


    Prostokat(double bP1, double bP2){
        bokP1 = bP1;
        bokP2 = bP2;

    }

    double obliczenieObwodu(){
        double wynik = 2 * (bokP1 + bokP2);
        return wynik;
    }
}
