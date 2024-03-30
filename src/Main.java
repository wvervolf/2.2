public class Main {
    public static Griffindor students(Griffindor a, Griffindor b, Griffindor c) {
        return a;
    }
    public static void main(String[] args) {

        Griffindor potter = new Griffindor("Гарри Поттер", 30, 50,33,45, 98);
        Griffindor yizli = new Griffindor("Рон Уизли", 35,24,74, 52, 41);
        Griffindor graindjer = new Griffindor("Гермиона Грейнджер", 28,64,48, 79, 47);



        //Драко Малфой, Грэхэм Монтегю, Грегори Гойл
        Slizerin malfoi = new Slizerin("Драко Малфой", 50,24,28, 28, 24, 28, 90);
        Slizerin montegu = new Slizerin("Драко Монтегю", 28,28,50, 28, 28, 28, 20);
        Slizerin goil = new Slizerin("Грегори Гойл", 24,50,28, 24, 28, 28, 30);

        //Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
        Hafflepuff smith = new Hafflepuff("Захария Смит", 50,24,50, 28, 28);
        Hafflepuff diggory = new Hafflepuff("Седрик Диггори", 50,35,24, 24, 50);
        Hafflepuff finchFlatchly = new Hafflepuff("Джастин Финч-Флетчли", 35,50,28, 28, 28);

        //Чжоу Чанг, Падма Патил и Маркус Белби
        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 50,24,50, 24, 50, 35);
        Ravenclaw patil = new Ravenclaw("Падма Патил", 48,48,48, 24, 28, 50);
        Ravenclaw belbi = new Ravenclaw("Маркус Белби", 24,50,35, 50, 48, 1);


        potter.compareTo(yizli);
        malfoi.compareTo(goil);
        smith.compareTo(finchFlatchly);
        chang.compareTo(belbi);

        yizli.compareToHogwartsStudents(montegu);

        potter.print();
        malfoi.print();
        diggory.print();
    }
}