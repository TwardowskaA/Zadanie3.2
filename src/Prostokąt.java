public class Prostokąt {

    double bokP1;
    double bokP2;
    double obwódProstokąta;


    Prostokąt(double bP1, double bP2){
        bokP1 = bP1;
        bokP2 = bP2;

    }

    double obliczenieObwProst(){
        double wynik = 2 * (bokP1 + bokP2);
        return wynik;
    }
}
