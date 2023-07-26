let num = 1234567;

// num은 몇자리수 인가?>

num = num.toString(); // 숫자를 문자로 변환 
console.log(`자리수: ${num.length}`);

// let cnt = 0;
// while (true){
//     num = Math.floor(num / 10);
//     cnt++;
//     let rest = num % 10;
//     if (rest === 0) break;
// }
//console.log(`자리수: ${cnt}`);

//숫자를 문자로 
let x =30, y = 40;
let result = String(x) + y.toString();
console.log(`result: ${result}`);

//문자를 숫자로 
let z = '100';
let result2 = +z+200;
console.log(`res2 : ${result2}`);

//논리로 변환 
let money = 7000;
let hasMoney = !!money;
console.log(`돈 있냐? ${hasMoney}`);