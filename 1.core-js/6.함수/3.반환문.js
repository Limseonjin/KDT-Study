function addNumber(n1,n2){
  //반환값 : 함수 호출이 끝나면 함수 호출부로 전달될 값 
  return n1 + n2;
  //반환문은 함수의 탈출문
}

console.log(addNumber(5,7));

//함수의 중첩 호출 
//안쪽부터 실행 같은 레벨이면 왼쪽부터
let r2 = addNumber(addNumber(addNumber(3, 2), 10), addNumber(5, 8));
console.log(r2);

//리턴이 없는 함수 : void 함수 
function multi(n1,n2){
  let result = n1 * n2;
  console.log(`${n1} x ${n2} = ${result}`);
}
//void 함수는 다른 변수에 담지도 말고 다른 함수의 매개값으로 쓰지도 말자 
let r3 = multi(4,6)
console.log(r3);

multi(addNumber(2,2),addNumber(4,4))
//괜찮음 

//안돼 
addNumber(multi(2,2), multi(5,5))

//return의 탈출 의미 
function callName(nickName){
  //금지어 
  let prohibits = ['돌아이', '멍청이', '빠가'];
  if (prohibits.includes(nickName)){
    console.log('바른말 고운말 써라');
    return;
  }
  console.log(`${nickName}님 하이!!!!!!!!!!!!!`);
}

console.log(`============`);
callName('빠가');

function stopLoop() {
  while (true){
    let flag = prompt('명령어 입력!');
    if (flag === '스톱'){
      return;
    }
    alert(flag)
  }
  alert('수고수고리잉')
}

stopLoop();