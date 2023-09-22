package day09.api.obj;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("모나미", "서울지사");
        Pen redpen = new Pen(company,1,"빨강",500);
        Pen redpencil = new Pen(company,1,"빨강",500);

        Pen bluePen = new Pen(company, 2, "파랑", 600);


        System.out.println("redpen = " + redpen);
        System.out.println("red = " + (redpen.equals(redpencil)));

        System.out.println(redpen.hashCode());
        System.out.println(redpencil.hashCode());
        
        Set<Pen> penSet = new HashSet<>();
        penSet.add(redpencil);
         penSet.add(redpen);
        penSet.add(bluePen);

        // redpencil == redpen인데 중복제거가 안됨 (hasCode 오버라이딩 안했을 시)
        System.out.println("penSet.size() = " + penSet.size());

        long time = System.currentTimeMillis();
        System.out.println(time);

    }
}
