import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // VJEZBE ZADATAK 1

        System.out.println("==============================\n" +
                "\t\t\tVISIT KARTA\t\t\t\n" +
                "Ime:\tAnes Meskic\t\n" +
                "Studij:\tIR\n" +
                "Godina:\t3.\n" +
                "Moto:\tDo the possible\n" +
                "==============================\n");

        // VJEZBE ZADATAK 2

        String ime = "Anes";
        char a = 'M';
        int lvl = 7;
        float zdravlje = 120;
        double preciznost = 0.85;
        boolean stit = true;
        long xp = 35000000;
        final int max_nivo = 50;

        System.out.println("***" + ime + " (" + a + ")***\n" +
                "Nivo:" + lvl + "//" + max_nivo + "\n" +
                "Zdravlje: " + zdravlje + "\n" +
                "Preciznost: " + preciznost + "\n" +
                "Ima stit: " + stit + "\n" +
                "Iskustvo: " + xp);


        // VJEZBE ZADATAK 3

        int ukupnoSekundi = 200000;

        int dani = ukupnoSekundi / 86400;
        int ostatak = ukupnoSekundi % 86400;
        int sati = ostatak / 3600;
        int ostatak1 = ostatak % 3600;
        int minute = ostatak1 / 60;
        int ostatak2 = ostatak1 % 60;
        int sekunde = ostatak2;

        System.out.println(ukupnoSekundi + " s = " + dani + " d, " + sati + " h, "
                + minute + " min, " + sekunde + " s");

        // VJEZBE ZADATAK 4

        int o1 = 9, o2 = 8, o3 = 10, o4 = 7, o5 = 9;

        // TODO a) zbir
        System.out.println("\nZbir=" + (o1 + o2 + o3 + o4 + o5));

        // TODO b) prosjek kao int
        int avg = (o1 + o2 + o3 + o4 + o5) / 5;
        System.out.println("Prosjek: " + avg);

        // TODO c) prosjek kao double (pazite na cjelobrojno dijeljenje!)
        double avg1 = (o1 + o2 + o3 + o4 + o5) / 5;
        System.out.println("Prosjek: " + avg1);

        // TODO d) zaokruženi prosjek
        System.out.println("Zaokruzeni prosjek: " + Math.round(avg1));

        // TODO e) ispis sa dvije decimale (printf)
        System.out.printf("%f.2", avg1);

        // TODO f) stipendija
        boolean stipendija=true;
        System.out.println("Stipendija: "+stipendija);

        // VJEZBE ZADATAK 5

        String ime1 = "Anes";
        String prezime1 = "Meskic";
        String godinaRodjenja = "2005";

        // TODO: napravite korisničko ime
        String korisnickoIme = ime1.substring(0,1)+prezime1.toLowerCase(Locale.ROOT)+godinaRodjenja.substring(2);
        System.out.println("Korisničko ime: " + korisnickoIme.toLowerCase(Locale.ROOT));

        // TODO: ispišite dužinu korisničkog imena
        System.out.println(korisnickoIme.length());
    }
}