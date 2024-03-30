public class Hafflepuff extends Hogwarts {
   private int hardWork;//трудолюбивы,
   private int loyalty;// верны,
   private int honesty;// честны.

    public Hafflepuff(String name, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    @Override
    protected int sumOfHaracteristix() {
        return hardWork + loyalty + honesty;
    }
    public void compareTo(Hafflepuff student) {
        compareToStudents(student);
    }

    @Override
    public String toString() {
        return super.toString()+ ", Факультет: Пуффендуй " + ", Трудолюбие: " + hardWork + ", Верность: " + loyalty + ", Честность: " + honesty;
    }
}

