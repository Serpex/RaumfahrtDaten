package de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten;

import android.support.v7.app.AppCompatActivity;

import java.lang.Math;

import de.jasperzevering.raumfahrt.raumfahrtdaten.R;

/*diese klasse stellt immer die aktuellen Planetendaten zurverfügung. Die methode "setzePlaneten" setzt alle werte auf den
entsprechenden planeten , die dann durch die jeweiligen getter methoden abgerufen werden können.
z.b. planetdatenintern x = new platentdaten("sonne"); x.getmasse;
 */

public class planetdatenintern extends AppCompatActivity {


    private double masseinzahlen;
    private String masse="X";
    private String durchmesser="X";
    private double durchmesserinzahlen;
    private String dichte="X";
    private double dichteinzahlen;
    private String fallbeschleunigung="X";
    private double fallbeschleunigunginzahlen;
    private String fluchtgeschwindigkeit="X";
    private double fluchtgeschwindigkeitinzahlen;
    private String albedo="X";

    private String rotationsperiode="X";
    private String Bestandteile="X";
    private double AinZahlen;
    private String A="X";
    private double EinZahlen;
    private String E="X";
    private double iinZahlen;
    private String i="X";
    private double VinZahlen;
    private String V="X";
    private String Aphel="X";
    private String Perihel="X";
    private String Apogaeum="X";
    private String Perigaeum="X";
    private String siderisch="X";
    private String synodisch="X";
    private String Druck="X";
    private double Druckinzahlen;
    private String Tmax="X";
    private double TmaxinZahlen;
    private String Tmin="X";
    private double TmininZahlen;
    private String Tmittel="X";
    private double TmittelinZahlen;
    private int foto= android.R.drawable.ic_delete;


    public planetdatenintern(String planet) {


        switch (planet) {

            case "Sonne":
                durchmesserinzahlen = 1392684;
                masseinzahlen = 19984 * Math.pow(10, 26); //* Math.pow(10, 34);


                dichteinzahlen = 1.408;
                fallbeschleunigunginzahlen = 274;
                fluchtgeschwindigkeitinzahlen = 617.3;
                albedo = "Irrelevant";
                rotationsperiode = "25,38 d";

                Bestandteile = "H: 92,1 %\n" +
                        "He: 7,8 %\n" +
                        "O : 500 ppm\n" +
                        "C : 230 ppm\n" +
                        "Ne: 100 ppm\n" +
                        "N : 70 ppm";

                AinZahlen = 0;
                EinZahlen = 0;
                iinZahlen=0;
                Aphel = "0";
                Perihel = "0";
                Apogaeum = "1,0167112299 AE";
                Perigaeum = "0,9832887701 AE";
                siderisch = "25,38";
                synodisch = "25,38 (per defintion)";
                Druck = "2E11 Bar";
                TmininZahlen = 5778;
                Tmittel = "/";
                TmaxinZahlen = 15600000;
                foto= R.drawable.sonne;


                break;

            case "Merkur":
                masseinzahlen = 3.301 * Math.pow(10, 23);

                break;

            case "Venus":
                break;

            case "Erde":
                break;
            case "Mond":
                break;
            case "Mars":
                break;
            case "Jupiter":
                break;
            case "Saturn":
                break;
            case "Uranus":
                break;
            case "Pluto":
                break;

            default:

                break;

        }
    }


    public String getMasse() {

        if (masseinzahlen == 0) {
            return masse;
        }
        masse = masseinzahlen + " kg";
        return masse;

    }

    public String getDurchmesser() {

        if (durchmesserinzahlen == 0) {
            return durchmesser;
        }
        durchmesser = durchmesserinzahlen + " km";
        return durchmesser;

    }

    public String getDichte() {

        if (dichteinzahlen == 0) {
            return dichte;
        }
        dichte = dichteinzahlen + " g/cm^3";
        return dichte;

    }

    public String getFallbeschleunigung() {

        if (fallbeschleunigunginzahlen == 0) {
            return fallbeschleunigung;
        }
        fallbeschleunigung = fallbeschleunigunginzahlen + " km/s^2";
        return fallbeschleunigung;

    }

    public String getFluchtgeschwindigkeit() {

        if (fluchtgeschwindigkeitinzahlen == 0) {
            return fluchtgeschwindigkeit;
        }
        fluchtgeschwindigkeit = fluchtgeschwindigkeitinzahlen + " km/s";
        return fluchtgeschwindigkeit;

    }

    public String getAlbedo() {

        return albedo;
    }

    public String getA() {

        if (AinZahlen == 0) {
            return A;
        }

        A = AinZahlen + " km";
        return durchmesser;

    }

    public String getRotationsperiode() {
        return rotationsperiode;
    }

    public String getBestandteile() {
        return Bestandteile;
    }
    public String getE() {

        if (EinZahlen == 0) {
            return E;
        }
        E =""+ EinZahlen;
        return E;

    }
    public String geti(){

        if (iinZahlen==0)
        {return i;}
        i= iinZahlen+"°";
        return i;
    }

    public String getV() {

        if (VinZahlen == 0) {
            return V;
        }
        V = VinZahlen+ " km/s";
        return V;

    }


    public String getAphel() {

        return Aphel;
    }
    public String getPerihel() {

        return Perihel;
    }
    public String getApogaeum() {

        return Apogaeum;
    }
    public String getPerigaeum() {

        return Perigaeum;
    }
    public String getSiderisch() {

        return siderisch;
    }
    public String getSynodisch() {

        return synodisch;
    }
    public String getDruck() {

        if (Druckinzahlen == 0) {
            return Druck;
        }
        Druck = Druckinzahlen+ " bar";
        return Druck;

    }

    public String getTmax() {

        if (TmaxinZahlen == 0) {
            return Tmax;
        }
        Tmax = TmaxinZahlen+ " kelvin";
        return Tmax;

    }
    public String getTmin() {

        if (TmininZahlen == 0) {
            return Tmin;
        }
        Tmin = TmininZahlen+ " kelvin";
        return Tmin;

    }
    public String getTmittel() {

        if (TmittelinZahlen == 0) {
            return Tmittel;
        }
        Tmittel = TmittelinZahlen+ " kelvin";
        return Tmittel;

    }

    public int getFoto(){
        return foto;
    }


}
