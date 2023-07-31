//multi parmarmeter : 매개변수 개수가 n개인 경우
//n개를 하나의 박스(배열, 객체)에 담아서 전달하자! 

//정수 n개의 총합 
function addAll(numbers, others){
  let total = 0;
  for (let n of numbers){
    total += n;
  }
  return total;
}

//정수 n개의 총합 (ES6) - 스프레드
function addAllEs6(...numbers){
  let total = 0;
  for (let n of numbers){
    total += n;
  }
  return total;
}

let r1 = addAll([10,20,30,40],[2,12,4])
console.log(r1);

//얘는 배열 2개 안됌 
let r2 = addAllEs6(10,20,30,40,50)
console.log(r2);

//다중 반환값 
//함수의 반환값은 언제나 하나여야 한다 
// f(x) = 3a + 5b +4c;

//2개의 정수를 전달하면 덧셈 곰셉 뺄셈 나눗셈 을 반환받고십당 

function operateAll(n1,n2){
  // return [n1 + n2, n1 - n2, n1 * n2, n1 / n2];
  return {
    plus : n1 + n2,
    minus : n1 - n2,
    multi : n1 * n2,
    divide : n1 / n2,
  };
}

let results = operateAll(20,10);
console.log(results);
// console.log(`덧셈결과: ${results[0]}`);
// console.log(`곱셈결과: ${operateAll(4,5)[2]}`);
console.log(operateAll(1,2).plus);

