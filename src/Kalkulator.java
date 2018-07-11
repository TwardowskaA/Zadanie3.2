public class Kalkulator {


    double poleKwadratu (Kwadrat kwadrat){
     double wynik = kwadrat.obliczeniePolaK();
        System.out.println(wynik);

        return wynik;
    }


    double poleKoła(Koło koło){
     double wynik1 = koło.obliczeniePolaKoła();
        System.out.println(wynik1);;

        return wynik1;
    }


    double obwódTrójkąta (Trójkąt trójkąt){
     double wynik2 = trójkąt.obliczenieObwTrójkąta();
        System.out.println(wynik2);
        return wynik2;
    }


    double obwódProstokąta (Prostokąt prostokąt){
      double wynik3 = prostokąt.obliczenieObwProst();
        System.out.println(wynik3);
        return wynik3;
    }


}
