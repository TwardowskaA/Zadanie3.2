public class Kalkulator {


    double poleKwadratu (Kwadrat kwadrat){
     kwadrat.poleKwadratu = 2 * kwadrat.bokK;

        return kwadrat.poleKwadratu;
    }


    double poleKoła(Koło koło){
     koło.poleKoła = koło.pi * (koło.r * koło.r);

        return koło.poleKoła;
    }


    double obwódTrójkąta (Trójkąt trójkąt){
     trójkąt.obwódTrójkąta = trójkąt.bokT1 + trójkąt.bokT2 + trójkąt.bokT3;

        return trójkąt.obwódTrójkąta;
    }




    double obwódProstokąta (Prostokąt prostokąt){
     prostokąt.obwódProstokąta = (2 * (prostokąt.bokP1 + prostokąt.bokP2));

        return prostokąt.obwódProstokąta;
    }


}
