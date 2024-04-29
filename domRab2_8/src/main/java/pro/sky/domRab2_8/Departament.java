package pro.sky.domRab2_8;

public class Departament {
    private String nameDepart;
    private int numDepart;

    public Departament(int numDepart, String nameDepart) {
        this.numDepart = numDepart;
        this.nameDepart = nameDepart;
    }

    public String getNameDepart() {
        return nameDepart;
    }

    public int getNumDepart() {
        return numDepart;
    }

    @Override
    public String toString() {
        return numDepart + " " + nameDepart + "\n";
    }


}
