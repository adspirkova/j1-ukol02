package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();
        nakresliZmrzlinu(zofka);
        nakresliSnehulaka(zofka, 5);
        nakresliMasinku(zofka);
    }

    private void nakresliMasinku(Turtle zofka) {
        zofka.setLocation(600,300);
        nakresliObdelnik(130, 80, zofka);
        zofka.penDown();
        nakresliKolecko(zofka, 80 / 8);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(130);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliObdelnik(60, 130, zofka);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.penDown();
        nakresliKolecko(zofka, 60/10);
        zofka.move(50);
        nakresliKolecko(zofka, 60/10);
        zofka.turnLeft(180);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(40);
        nakresliRovnoramennyTrojuhelnik(80, 60, zofka);
    }

    public void nakresliSnehulaka(Turtle zofka, double velikost) {
        zofka.setLocation(300,300);
        nakresliKolecko(zofka, velikost);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(3* velikost);
        zofka.turnRight(90);
        zofka.move(3* velikost + 2);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(zofka, 2* velikost);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(3*2* velikost + 2);
        zofka.turnRight(90);
        zofka.move(3*2* velikost + 2);
        zofka.move(3*2* velikost);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliKolecko(zofka, velikost/2);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(3*2* velikost);
        zofka.move(3*2* velikost + 2);
        zofka.move(3*2* velikost + 2);
        zofka.move(2* velikost);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliKolecko(zofka, velikost/2);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(2* velikost);
        zofka.move(3*2* velikost + 2);
        zofka.turnLeft(90);
        zofka.move(3*2* velikost + 2);
        zofka.move(2* velikost);
        zofka.turnRight(180 + 90);
        zofka.penDown();
        nakresliKolecko(zofka, velikost *3);
        zofka.turnLeft(85);
    }

    private void nakresliCastMnohohuelniku(Turtle zofka, double delkaStrany, int pocetStran, int cast) {
        double uhel = 360.0 / pocetStran;

        zofka.turnRight(uhel/2);
        for (int i = 0; i < pocetStran/cast; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(uhel);
        }
        zofka.turnLeft(uhel/2);
    }

    private void nakresliKolecko (Turtle zofka, double delkaStrany)   {
        nakresliCastMnohohuelniku(zofka, delkaStrany, 24, 1);
    }

    public void nakresliZmrzlinu(Turtle zofka) {
        zofka.setLocation(100,100);
        zofka.penDown();
        nakresliKolecko(zofka, 15);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(30);
        nakresliRovnostrannyTrojuhelnik(110,zofka);
        zofka.turnLeft(155);
    }


    public void nakresliRovnostrannyTrojuhelnik(double delkaStrany, Turtle zofka) {
        for (int i = 0; i < 3; i++) {
            zofka.penDown();
            zofka.move(delkaStrany);
            zofka.turnLeft(120);
        }
    }

    public void nakresliRovnoramennyTrojuhelnik(double velikostStranyA, double velikostStranyB, Turtle zofka) {

        zofka.turnLeft(180 - 45);
        var velikostPrepony = Math.sqrt(Math.pow(velikostStranyA, 2) + Math.pow(velikostStranyB, 2));
        zofka.move(velikostPrepony);
        zofka.turnLeft(180 - 45);
        zofka.move(velikostStranyB + 10);
        zofka.turnLeft(90);
        zofka.move(velikostStranyA);
    }

    public void nakresliObdelnik(double delkaStranyX, double delkaStranyY,Turtle zofka) {
        zofka.penDown();

        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyX);
            zofka.turnRight(90);
            zofka.move(delkaStranyY);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
