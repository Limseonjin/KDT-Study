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