public class Slizerin extends Hogwarts {
    private int cunning;//хитрость,
    private int determination;// решительность,
    private int ambition;// амбициозность,
    private int resourcefulness;// находчивость
    private int lustforPower;// жажда власти.

    public Slizerin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustforPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustforPower = lustforPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustforPower() {
        return lustforPower;
    }
    @Override
    protected int sumOfHaracteristix() {
        return cunning + determination + ambition + resourcefulness + lustforPower;
    }
    public void compareTo(Slizerin student) {
        compareToStudents(student);
    }

    @Override
    public String toString() {
        return super.toString()+ ", Факультет: Слизерин " + ", Хитрость " + cunning + ", Решительность: " + determination + ", Амбициозность: " + ambition + ", Находчивость " + resourcefulness + ", Жажда власти " + lustforPower;
    }
}
