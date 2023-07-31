//JS의 함수는 또 다른 함 수를 리턴할 수 있음 

function add(n1, n2){
  return n1 + n2;
}

// function Calcultaor(){ 
//   return (n1,n2) => n1 + n2;
// }

const Calcultaor = () => (n1,n2) => n1 + n2;

const result = Calcultaor();
console.log(result(5,8));
console.log(Calcultaor()(7,4));

console.log('==================================');

let count = 0; //전역 변수 

//카운트 증가 함수 
/*const increase = () => ++count;

console.log(increase());
console.log(increase());
count = 999;
 console.log(increase()); */
 
/*const increase = () =>{
   let count = 0; //지역변수
   return ++count;
 };
console.log(increase());
console.log(increase());
console.log(increase()); */

//카운트 증가 시키는 함수를 리턴하는 클로저 생성 
const increaseCloser = () => {
  let count =0;
  return () => ++count;
}
const increase = increaseCloser();
console.log(increase());
console.log(increase());
count = 900;
console.log(increase()); 

//즉시 실행 함수 : 1회성 호출 함수를 만들 때 주로 사용

const r1 = (function(n1,n2){
  return n1 + n2;
})(10,20);

console.log(`r1 : ${r1}`);
console.log('=======================');

const increase2 = (() => {
  let count =0;
  return () => ++count;
})();
console.log(increase2());
console.log(increase2());
count = 900;
console.log(increase2()); 