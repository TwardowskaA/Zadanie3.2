public class Koło {

    int r;
    final double pi = 3.14;
    double poleKoła;

    Koło(int r){

        this.r=r;

    }

    double obliczeniePolaKoła(){
        double wynik = pi * (r * r);
        return wynik;

    }

}
