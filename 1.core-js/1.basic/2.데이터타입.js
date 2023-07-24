let age1 = 19;
let age2 = '19';

age1+age2;

let 피카츄;

//js는 정수,실수 구분x 모두 실수처리

let num = 2;
console.log(typeof num);
console.log(5/2);
// 문자타입
let s1 = 's1';
let s2 = "s2";
let s3 = `s3`; //백틱

console.log(typeof s1);
console.log(typeof s2);
console.log(typeof s3);


let tag = '<ul>\n<li><a href="#">link</a></li><ul>';
console.log(tag);

let tage = `<ul>
    <li>
        <a href"#">kubg</a>
    </li>
</ul`

console.log(tage);

let userName = `보로로`;
let userAge = 5;

let message = '제 이름은'+userName+'이구용 나이는 '+userAge+'살 이애용'
let message2 = `제 이름은 ${userName}이구용 나이는 ${userAge}살 이애용`

console.log(message);
console.log(message2);

// 논리
let flag = true;
 console.log(typeof flag);

//  undefined타입과 null타입
//  undefined타입: 변수 만들고 값 안 넣은거
// null:의도적으로 값이 없는 상태

let address = '청양';
address = null;
console.log(address);