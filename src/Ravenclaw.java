public class Ravenclaw extends Hogwarts {
   private int cleverness;//умны,
   private int wisdom;// мудры,
   private int wit;// остроумны
   private int creative;// и полны творчества

   public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int cleverness, int wisdom, int wit, int creative) {
      super(name, powerOfMagic, transgressionDistance);
      this.cleverness = cleverness;
      this.wisdom = wisdom;
      this.wit = wit;
      this.creative = creative;
   }

   public int getCleverness() {
      return cleverness;
   }

   public int getWisdom() {
      return wisdom;
   }

   public int getWit() {
      return wit;
   }

   public int getCreative() {
      return creative;
   }
   @Override
   protected int sumOfHaracteristix() {
      return cleverness + wisdom + wit + creative;
   }
   public void compareTo(Ravenclaw student) {
      compareToStudents(student);
   }

   @Override
   public String toString() {
      return super.toString()+ ", Факультет: Когтевран " + ", Интеллект " + cleverness + ", Мудрость " + wisdom + ", Остроумие " + wit + ", Творчество " + creative;
   }
}
