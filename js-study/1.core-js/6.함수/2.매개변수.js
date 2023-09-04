//매개변수(parameter)
//함수 정의 시 바깥에서 안으로 들어오는 데이터를 저장하는 변수 

/* 
  description: x~y까지의 누적합을 구하는 함수 정의 
  parameter : 
    -begin : 누적합을 구할 시작값 
    -end : 누적합을 구할 끝값
  return : begin과 end사이의 정수의 총합 

  example :
    calcTotalSum(1,10) -> 55 return
*/
function clacTotalSum(begin,end) {
  console.log(begin,end);
  let total = 0;
  for (let i=begin; i<=end; i++){
    total+=i;
  }
  return total;
}

console.log(clacTotalSum(1, 10));
console.log(clacTotalSum());
console.log(clacTotalSum(1,10,100,1000));

//매개변수의 기본값 
function sayHello(lang='한국어') {
  //ES5 고전에는 lang = lang || '한국어';
  if (lang === '한국어'){
    console.log('안녕하세요!');
  }else if (lang === '영어'){
    console.log('hello!');
  }else if (lang === '중국어'){
    console.log("따자하옹");
  }else{
    console.log('ㅋㅋㄹㅃㅃ');
  }
}

console.log('==================');
sayHello();