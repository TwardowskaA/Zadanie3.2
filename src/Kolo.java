public class Kolo {

    int r;
    final double pi = 3.14;

    Kolo(int r){

        this.r=r;

    }

    double obliczeniePola(){
        double wynik = pi * (r * r);
        return wynik;

    }

}
