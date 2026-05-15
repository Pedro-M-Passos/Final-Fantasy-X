public class Tidus extends Character {

    private TidusWeapons equippedWeapon;
    
    public Tidus() {

        super(520, 12, 15, 5, 5, 5, 10, 18, 10, 10);
        this.equippedWeapon = TidusWeapons.LONGSWORD;

    }

    public TidusWeapons getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(TidusWeapons equippedWeapon) {

        this.equippedWeapon = equippedWeapon;

        TidusWeaponsAbilities abilities = new TidusWeaponsAbilities();

        abilities.CalcularBonus(this);
}


}
