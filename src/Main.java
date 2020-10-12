public class Main {

    public static void main(String[] args) {

         Mage Character1 = new Mage("Tom Ripley","Mage");
         Rogue Character2=new Rogue("Molly Bloom","Rogue");
         Knight Character3=new Knight("Flora Poste","Knight");

          Character1.specialAttack();
          Character2.rangedAttack();
        System.out.println(Character1.getCharacterType());
           Character2.specialAttack();
          Character3.closeAttack();
    }
}
