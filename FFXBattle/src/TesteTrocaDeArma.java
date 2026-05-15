import org.junit.Test;

public class TesteTrocaDeArma {
    


    @Test
    public void testeTrocaDeArma() {
        Tidus tidus = new Tidus();
        TidusWeaponsAbilities abilities = new TidusWeaponsAbilities();

        // Verificar arma inicial
        assert tidus.getEquippedWeapon() == TidusWeapons.LONGSWORD;
        assert tidus.getSTRENGTH() == 15; // Sem bônus

        // Trocar para Brotherhood
        tidus.setEquippedWeapon(TidusWeapons.BROTHERHOOD);
        assert tidus.getSTRENGTH() == 16; // Bônus aplicado (5% de 15 arredondado para 1)

        
    }
}
