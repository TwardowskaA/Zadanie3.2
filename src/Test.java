public class Test {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(5.5);
        double wynik3 = kwadrat.obliczeniePolaK();
        System.out.println(wynik3);

        Koło koło = new Koło (5);
        double wynik2 = koło.obliczeniePolaKoła();
        System.out.println(wynik2);

        Trójkąt trójkąt = new Trójkąt(4.4,8.7,9.4);
        double wynik = trójkąt.obliczenieObwTrójkąta();
        System.out.println(wynik);

        Prostokąt prostokąt = new Prostokąt(4.3,8.4);
        double wynik1 = prostokąt.obliczenieObwProst();
        System.out.println(wynik1);

    }

}
