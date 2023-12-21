package day04.encap;

public class Car {

    private String model; // 모델명
    private int speed; // 현재 속도
    private char mode; // 변속 모드 (D, N, R, P)
    private boolean start; // 시동 걸린 여부

    // 자동차가 처음 만들어질 때 초기 상태 지정
    public Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    // 속도를 조절하는 메서드 (setter메서드)
    // 정보은닉화된 필드값을 변경하는 메서드
    public void setSpeed(int speed) {
        if (speed < 0 || speed > 100) {
            return;
        }
        this.speed = speed;
    }

    // getter메서드 : 은닉된 필드를 참조하는 메서드
    public int getSpeed() {
        return speed;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'R': case 'P': case 'D': case 'N':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }
    public char getMode() {
        return mode;
    }

    // 엔진에 연료가 주입되는 기능
    private void inject() {
        System.out.println("연료가 주입됩니다.");
    }
    // 엔진오일이 순환하는 기능
    private void putOil() {
        System.out.println("엔진오일이 순환합니다.");
    }
    // 실린더가 움직이는 기능
    private void moveCylinder() {
        if (start) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("자동차가 터졌습니다!");
        }
    }
    // 시동버튼을 누르는 기능
    public void pressButton() {
        this.start = true;
        inject();
        putOil();
        System.out.println("시동이 걸립니다.");
        moveCylinder();
    }
}
