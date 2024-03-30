public class Griffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor;//честь
    private int bravery;//храбрость

    public Griffindor(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    @Override
    protected int sumOfHaracteristix() {
        return nobility + honor + bravery;
    }

    public void compareTo(Griffindor student) {
        compareToStudents(student);
    }

    @Override
    public String toString() {
        return super.toString()+ ", Факультет: Гриффиндор " + ", Благородство: " + nobility + ", Честь: " + honor +
                ", Храбрость: " + bravery;
    }
}
