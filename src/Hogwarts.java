public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Сила магии: " + powerOfMagic + ", Сила трангресии: " + transgressionDistance;
    }

    private int sumOfBaseHaracteristix() {
        return powerOfMagic + transgressionDistance;
    }

    protected abstract int sumOfHaracteristix();

    protected void compareToStudents(Hogwarts student) {
        int sumOfHaracteristix1 = sumOfHaracteristix();
        int sumOfHaracteristix2 = student.sumOfHaracteristix();
        if (sumOfHaracteristix1 < sumOfHaracteristix2) {
            System.out.println("Ученик " + student.getName() + " сильнее ученика " + getName() + " так как сумма их характеристик, присущих их факультету " + sumOfHaracteristix2 + " и " + sumOfHaracteristix1);
        } else if (sumOfHaracteristix1 > sumOfHaracteristix2) {
            System.out.println("Ученик " + getName() + " сильнее ученика " + student.getName() + " так как сумма их характеристик присущих их факультету " + sumOfHaracteristix1 + " и " + sumOfHaracteristix2);
        } else {
            System.out.println("Ученики равны по силе харктеристик, присущих их факультету");
        }
    }
    protected void compareToHogwartsStudents(Hogwarts student) {
        int sumOfHaracteristix1 = sumOfBaseHaracteristix();
        int sumOfHaracteristix2 = student.sumOfBaseHaracteristix();
        if (sumOfHaracteristix1 < sumOfHaracteristix2) {
            System.out.println("Ученик " + student.getName() + " сильнее ученика " + getName() + " так как сумма их характеристик силы магии и трансгрессии " + sumOfHaracteristix2 + " и " + sumOfHaracteristix1);
        } else if (sumOfHaracteristix1 > sumOfHaracteristix2) {
            System.out.println("Ученик " + getName() + " сильнее ученика " + student.getName() + " так как сумма их характеристик силы магии и трансгрессии " + sumOfHaracteristix1 + " и " + sumOfHaracteristix2);
        } else {
            System.out.println("Ученики равны по силе магии и трансгрессии");
        }
    }

    public void print() {
        System.out.println(this);
    }

}
