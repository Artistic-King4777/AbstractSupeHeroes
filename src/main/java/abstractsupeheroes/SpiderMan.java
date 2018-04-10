package abstractsupeheroes;

public class SpiderMan extends SuperHero{


    public SpiderMan(String realN, String[] specialP) {
        super(realN, specialP);
    }

    String[] listPowers() {
        return getSpecialPowers();
    }
}
