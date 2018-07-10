public class Test {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(5.5);
        Kalkulator kalkulator3 = new Kalkulator();
        double wynik3 = kalkulator3.poleKwadratu(kwadrat);
        System.out.println(wynik3);

        Koło koło = new Koło (5);
        Kalkulator kalkulator2 = new Kalkulator();
        double wynik2 = kalkulator2.poleKoła(koło);
        System.out.println(wynik2);

        Trójkąt trójkąt = new Trójkąt(1.1,5.7,6.2);
        Kalkulator kalkulator = new Kalkulator();
        double wynik = kalkulator.obwódTrójkąta(trójkąt);
        System.out.println(wynik);

        Prostokąt prostokąt = new Prostokąt(4.3,8.4);
        Kalkulator kalkulator1 = new Kalkulator();
        double wynik1 = kalkulator1.obwódProstokąta(prostokąt);
        System.out.println(wynik1);


    }

}
