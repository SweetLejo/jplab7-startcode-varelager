package no.hvl.dat100.varelager;

public class Varelager {

    protected Vare[] varer;
    protected int antall;

    public Varelager(int n) {

        this.varer = new Vare[n];
        this.antall = 0;

    }


    public Vare[] getVarer() {

        return this.varer;

    }

    public boolean leggTilVare(Vare v) {

        if (this.antall >= this.varer.length) {
            return false;
        }


        this.varer[antall] = v;
        this.antall++;

        return true;


    }

    public boolean leggTil(int varenr, String navn, double pris) {

        Vare a = new Vare(varenr, navn, pris);

        return leggTilVare(a);
    }

    public Vare finnVare(int varenr) {

        boolean found = false;
        Vare rightPos = null;
        int pos = 0;

        while (!found && pos < this.varer.length) {

            found = varer[pos].getVarenr() == varenr;
            rightPos = found ? varer[pos] : null;
            pos++;
        }

        return rightPos;
    }

    public void printVarelager() {

        String SEP = "==============================";
        System.out.println(SEP);
        for (Vare i : this.varer) {
            System.out.println(i.toString());
        }
        System.out.println(SEP);
    }

}
