// 1~10사이 랜덤 정수 

// 0.0이상 ~ 1.0미만 랜덤 실수 생성
// random * 10 : 0.0이상 ~ 10.0  미만 랜덤 실수 생성 
// Math.floor(Math.random() * 10) -> 0 <= ~ < 10
// Math.floor(Math.random() * 10) + 1 -> 1 <= ~ <11

//x 이상 y이하의 랜덤 정수 생성 공식
// Math.floor(Math.random() * (y - x +1)) +x;
let rn = Math.floor(Math.random() * 10) + 1;
console.log(rn);