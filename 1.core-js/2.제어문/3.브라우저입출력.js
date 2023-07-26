//사용자에게 입력받을 수 있는 함수 prompt

let userName = prompt('당신의 이름은??');
console.log(`입력한 이름: ${userName}`);

//숫자로 변환시 앞에 + 기호 붙이기
let userAge = +prompt('당신의 나이는?');
alert(`100년뒤 당신의 나이: ${userAge + 100}`);
alert(`당신은 ${2023 - userAge + 1}년 생이시군뇽?`);