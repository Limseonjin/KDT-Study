package day02.array;

import java.util.Arrays;

public class StringList {

    //스트링 배열을 필드로 등록
    String[] sArr;

    //생성자를 통해 초기화
    StringList(){
        sArr = new String[0];
    }
    StringList(String... initData){
        sArr = new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }

    String[] copy(int len){
        String[] temp = new String[sArr.length + len];
        int newSize = temp.length;
        int loopCount = (len > 0) ? newSize - 1 : newSize;
        for (int i = 0; i < loopCount; i++) {
            temp[i] = sArr[i];
        }
        return temp;
    }
    void clear(){
        sArr = new String[0];
    }
    boolean isEmpty(){
       return size() > 0 ? false : true;
    }
    void pop(){
        String[] temp = copy(-1);
        sArr = temp;
    }
    void push(String item){
        String[] temp = copy(1);
        temp[temp.length-1] = item;
        sArr = temp;
    }

    void insert (int index, String item){
        String[] temp = copy(1);
        temp[index] = item;
        for (int i = index+1; i < temp.length; i++) {
            temp[i] = sArr[i-1];
        }
        sArr = temp;
    }
    boolean includes(String item){
        return indexOf(item) != -1;
    }
    int indexOf(String item){
        for (int i = 0; i < item.length(); i++) {
            if (sArr[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
    public String remove(int index){
        if (index < 0 || index > sArr.length -1) return null;

        String[] temp = copy(-1);
        String targetData = temp[index];
        for (int i = index; i < temp.length; i++) {
            temp[i] = sArr[i+1];
        }
        sArr = temp;
        return targetData;
    }
    void remove(String item){
        int index = indexOf(item);
        remove(index);

    }
    int size(){
        return sArr.length;
    }
    void printArray(){
        System.out.println(Arrays.toString(sArr));
    }
}
