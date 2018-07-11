public class Trojkat {

    double bokT1;
    double bokT2;
    double bokT3;


    Trojkat(double bT1, double bT2, double bT3) {
        bokT1 = bT1;
        bokT2 = bT2;
        bokT3 = bT3;


    }

    double obliczenieObwodu(){
       double wynik = bokT1 + bokT2 + bokT3;
       return wynik;

    }

}
