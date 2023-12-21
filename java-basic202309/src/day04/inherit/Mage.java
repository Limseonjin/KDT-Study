package day04.inherit;

public class Mage extends Player{
    private int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    public void blizzard() {
        System.out.println("눈보라를 시전합니다.");
    }

    @Override
    public void status() {
        super.status();
        System.out.println("# 마력: "+mana);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
