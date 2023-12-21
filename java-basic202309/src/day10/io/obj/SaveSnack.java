package day10.io.obj;

import day10.io.rw.FilePath;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {
        List<Snack> snackList = List.of(
                new Snack("콘칲",1970,1500, Snack.Taste.GOOD),
                new Snack("사브레",1980,2500, Snack.Taste.BAD),
                new Snack("오징어집",1985,1800, Snack.Taste.SOSO)
        );
        try(FileOutputStream fos = new FileOutputStream(FilePath.path+"/snack.sav")) {
            //객체를 저장할 수 있는 보조스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
