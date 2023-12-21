package day04.inherit;


//부모클래스 (super class) : 자식 클래스(sub)들의 공통 필드와 메서드를 가짐
public class Player {
    private String nickName;
    private int level;
    private int hp;

    public Player(String nickName) {
        System.out.println("플레이어 생성자 호출");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 5;
    }

    public void attack() {
        System.out.println(nickName + "님이 공격합니다.");
    }
    public void status() {
        System.out.println("\n======== 캐릭터 정보 ========");
        System.out.println("# 닉네임: " + nickName);
        System.out.println("# 레벨: " + level);
        System.out.println("# 체력: " + hp);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
