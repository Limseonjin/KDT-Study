/*console.log(`김철수 하이`);
console.log(`즐거운 하루~`);

//코드 10000줄 

console.log(`신금희 하이`);
console.log(`즐거운 하루~`);

console.log(`반지음 하이`);
console.log(`오늘도 수고~`);*/


function sayHello(name,isMorning){
  console.log(`${name} 하이`);
  if (isMorning)
    console.log(`즐거운 하루~`);
  else 
    console.log(`오늘도 수고~`);
}

sayHello('김철수',true);
console.log('==========');
sayHello('박영희',true);
console.log('==========');
sayHello('홍길동',false);

function makeLine(){
  console.log('==========================');
}

for (let i =0; i<4; i++)
  makeLine();


//inputd이 주어지면 output 데이터가 나와야함
//원의 넓이를 자주 구하는 상황
function calcAreaCircle(r){
  console.log('원 넓이 구하는중 ..');
  const PI = 3.1415326;
  const area = PI * r ** 2;
  return area;
}
let result = calcAreaCircle(5);
console.log(result);