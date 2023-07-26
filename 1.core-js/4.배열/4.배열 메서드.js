let foodList = ['닭꼬치','타코야끼','짜장면','족발']

let findTarget = '족발';
/*
let index = -1;
for (let i=0; i< foodList.length; i++){
    if (findTarget === foodList[i]){
        index = i;
        break;
    }
}
*/
//indexOf : 배열의 특정 요사가 몇번 인덱스에 있는지 검색 
let index = foodList.indexOf(findTarget)
console.log(`찾은 인덱스:${index}`);

// include() : 배열의 특정 요소가 존재하는지 논리여부 확인
let isPresent = foodList.includes('피자');
console.log(`존재여부: ${isPresent}`);

//slice() : 배열을 일정부분 잘라내어, 복사본 배열을 반환 
foodList.push('오뎅','국밥');
console.log(foodList);

let sliceFoodList = foodList.slice(1,3);
console.log(sliceFoodList);
console.log(foodList);

//
let slicde2 = foodList.slice(3);
console.log(slicde2);

let copyArr = foodList.slice();
console.log(copyArr);

//revers() : 배열을 역순으로 출력 
//concated() : 배열 두개를 결합, 결합한 사본을 리턴 
//splice() : 배열의 특정 요소를 제거, 삽입 => 원본에 적용 
console.log(foodList);
foodList.splice(2,1);
console.log(foodList);

foodList.splice(0,1,'보쌈');
console.log(foodList);

foodList.splice(1,0,'말아탕');
console.log(foodList);





