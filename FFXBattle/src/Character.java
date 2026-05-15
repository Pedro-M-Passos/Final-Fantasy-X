public abstract class Character {
    
    // =========================
    // ATRIBUTOS BASE
    // =========================

    private int baseHP;
    private int baseMP;
    private int baseSTRENGTH;
    private int baseMAGIC;
    private int baseDEFENSE;
    private int baseMAGIC_DEF;
    private int baseAGILITY;
    private int baseLUCK;
    private int baseEVASION;
    private int baseACCURACY;

    // =========================
    // BONUS
    // =========================

    private int bonusHP;
    private int bonusMP;
    private int bonusSTRENGTH;
    private int bonusMAGIC;
    private int bonusDEFENSE;
    private int bonusMAGIC_DEF;
    private int bonusAGILITY;
    private int bonusLUCK;
    private int bonusEVASION;
    private int bonusACCURACY;

    // =========================
    // CONSTRUTOR
    // =========================

    public Character(
        int HP,
        int MP,
        int STRENGTH,
        int MAGIC,
        int DEFENSE,
        int MAGIC_DEF,
        int AGILITY,
        int LUCK,
        int EVASION,
        int ACCURACY
    ) {

        this.baseHP = HP;
        this.baseMP = MP;
        this.baseSTRENGTH = STRENGTH;
        this.baseMAGIC = MAGIC;
        this.baseDEFENSE = DEFENSE;
        this.baseMAGIC_DEF = MAGIC_DEF;
        this.baseAGILITY = AGILITY;
        this.baseLUCK = LUCK;
        this.baseEVASION = EVASION;
        this.baseACCURACY = ACCURACY;
    }

    // =========================
    // GETTERS FINAIS
    // =========================

    public int getHP() {
        return baseHP + bonusHP;
    }

    public int getMP() {
        return baseMP + bonusMP;
    }

    public int getSTRENGTH() {
        return baseSTRENGTH + bonusSTRENGTH;
    }

    public int getMAGIC() {
        return baseMAGIC + bonusMAGIC;
    }

    public int getDEFENSE() {
        return baseDEFENSE + bonusDEFENSE;
    }

    public int getMAGIC_DEF() {
        return baseMAGIC_DEF + bonusMAGIC_DEF;
    }

    public int getAGILITY() {
        return baseAGILITY + bonusAGILITY;
    }

    public int getLUCK() {
        return baseLUCK + bonusLUCK;
    }

    public int getEVASION() {
        return baseEVASION + bonusEVASION;
    }

    public int getACCURACY() {
        return baseACCURACY + bonusACCURACY;
    }

    // =========================
    // GETTERS BASE
    // =========================

    public int getBaseSTRENGTH() {
        return baseSTRENGTH;
    }

    public int getBaseMAGIC() {
        return baseMAGIC;
    }

    // =========================
    // SETTERS BONUS
    // =========================

    public void setBonusSTRENGTH(int bonusSTRENGTH) {
        this.bonusSTRENGTH = bonusSTRENGTH;
    }

    public void setBonusMAGIC(int bonusMAGIC) {
        this.bonusMAGIC = bonusMAGIC;
    }

    public void setBonusDEFENSE(int bonusDEFENSE) {
        this.bonusDEFENSE = bonusDEFENSE;
    }

    public void setBonusAGILITY(int bonusAGILITY) {
        this.bonusAGILITY = bonusAGILITY;
    }

    // =========================
    // SETTERS BASE (OPCIONAL)
    // =========================

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public void setBaseMP(int baseMP) {
        this.baseMP = baseMP;
    }
}
