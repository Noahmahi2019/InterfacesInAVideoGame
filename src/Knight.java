public class Knight implements Character{
    String name;
    String characterType;

    public Knight(String name, String characterType) {
        this.name = name;
        this.characterType = characterType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    @Override
    public void rangedAttack() {
        System.out.println( this.name + " throwing shield");
    }

    @Override
    public void closeAttack() {
        System.out.println(this.name + " attacking with sword");
    }

    @Override
    public void specialAttack() {
        System.out.println(this.name + " stabbing with sword");

    }
}
