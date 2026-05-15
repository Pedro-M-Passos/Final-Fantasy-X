public class TidusWeaponsAbilities {
    
    private TidusWeapons weapon;
    


    public void CalcularBonus(Tidus tidus){
        switch (tidus.getEquippedWeapon()) {
            case BROTHERHOOD:

                int bonus = (int)Math.round(tidus.getBaseSTRENGTH() * 0.05);
                tidus.setBonusSTRENGTH(bonus);
                break;

            case LONGSWORD:

                tidus.setBonusSTRENGTH(0);
                break;
        }
    }

}
