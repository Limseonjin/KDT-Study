package day08.generic;

import java.util.Arrays;

public class GenricList<V> {

        // 스트링 배열을 필드로 등록
        Object[] sArr;

        // 생성자를 통해 배열을 초기화
        public GenricList() {
            sArr = new Object[0];
        }
        GenricList(V... initData) {
            sArr = new Object[initData.length];
            for (int i = 0; i < sArr.length; i++) {
                sArr[i] = initData[i];
            }
        }

        // 배열 맨 끝데이터 제거
        V pop() {
            Object deleteDatum = sArr[sArr.length - 1];

            Object[] temp = new Object[sArr.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = sArr[i];
            }
            sArr = temp;

            return (V)deleteDatum;
        }

        void printArray() {
            System.out.println(Arrays.toString(sArr));
        }

        // 배열에 저장된 데이터 수를 알려주는 기능
        public int size() {
            return sArr.length;
        }

        // 배열에 맨 끝에 데이터를 추가하는 기능
        public void push(V newData) {
            Object[] temp = new Object[sArr.length + 1];
            for (int i = 0; i < sArr.length; i++) {
                temp[i] = sArr[i];
            }
            temp[temp.length - 1] = newData;
            sArr = temp;
        }
        // 배열이 비어있는지 확인
        boolean isEmpty() {
            return sArr.length == 0;
        }
        // 배열을 전체 삭제하는 메서드
        void clear() {
            sArr = new Object[0];
        }

        // 인덱스 탐색 (indexOf)
        public int indexOf(V target) {
            for (int i = 0; i < sArr.length; i++) {
                if (target.equals(sArr[i])) {
                    return i;
                }
            }
            return -1;
        }

        // 자료 유무 확인 (includes)
        public boolean includes(V target) {
            return indexOf(target) != -1;
        }

        // 중간 삭제 (remove) : 인덱스로 삭제
        public V remove(int index) {
            if (index < 0 || index > sArr.length - 1) return null;

            Object targetData = sArr[index];
            for (int i = index; i < sArr.length - 1; i++) {
                sArr[i] = sArr[i + 1];
            }
            pop();
            return (V) targetData;
        }
        // 중간 삭제 (remove) : 값으로 삭제
        public V remove(V target) {
            return remove(indexOf(target));
        }

        // 중간 삽입 (insert)
        public void insert(int index,V newData) {

            if (index < 0 || index > sArr.length - 1) return;
            if (index == sArr.length - 1) push(newData);

            Object[] temp = new Object[sArr.length + 1];
            for (int i = 0; i < sArr.length; i++) {
                temp[i] = sArr[i];
            }
            for (int i = temp.length - 1; i > index; i--) {
                temp[i] = temp[i-1];
            }
            temp[index] = newData;
            sArr = temp;
        }

        public Object[] getsArr() {
            return sArr;
        }
}

