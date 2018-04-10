package abstractsupeheroes;

public class Deadpool extends SuperHero {


    public Deadpool(String realN, String[] specialP) {
        super(realN, specialP);
    }


    String[] listPowers() {
        return getSpecialPowers();
    }

}
