//  && > and
//  || > or

let t = true;
let f = false;
console.log(t || t);
console.log(t || f);
console.log(f || t);
console.log(f || f);

// 논리반전 not 
console.log('===========================');
console.log(!t);

let money = 0;
if (!money){
    console.log('집에서 쉴거야');
}else {
    console.log('쇼핑할고양');
}
// 조건 연산자 3항
console.log('===========================');
let food;
/*if (money > 6000){
    food = '돈까스';
} else{
    food = '라면';
}*/

console.log(`선택된 음식 : ${money > 6000 ? '돈가쓰':'라면'}`);