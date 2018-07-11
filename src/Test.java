public class Test {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(5.5);
        double wynik = kwadrat.obliczeniePola();
        System.out.println(wynik);

        Kolo kolo = new Kolo (5);
        double wynik1 = kolo.obliczeniePola();
        System.out.println(wynik1);

        Trojkat trojkat = new Trojkat(4.4,8.7,9.4);
        double wynik2 = trojkat.obliczenieObwodu();
        System.out.println(wynik2);

        Prostokat prostokat = new Prostokat(4.3,8.4);
        double wynik3 = prostokat.obliczenieObwodu();
        System.out.println(wynik3);

    }

}
