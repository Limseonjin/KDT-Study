
//일반함수에서 this는 
//nodejs환경에서는 global 객체 
//브라우저환경에서는 window 객체 
function foo() {
    console.log(this);
}

//foo();

//객체에서의 this 
const car = {
    madeBy : '현대',
    model : '그랜져',
    showCarInfo : function (){
        console.log(this);
        console.log(`제조사: ${this.madeBy}`);
    }
};

car.showCarInfo();

//이벤트 핸들러 this
/*
const $btn = document.getElementById('btn');
const btnHandler = function (){
    console.log(this);
    this.style.background = 'red';
}

//$btn.addEventListener('click', btnHandler);*/

console.log('===============================');

//this를 조작하는 메서드 bind, call, apply 

//call 
function sayHello (lang1, lang2){
    console.log(`this:${this}`);
    console.log(`Hello I am ${this.name} , I can seapk ${lang1} and ${lang2}`);
}
const kim = {
    name : '김철수',
    age : 2
};
const park = {
    name : '박영희',
    age : 3
};

//this를 조작하는 메서드 call()
// 파라미터1 : 조작할 this 
// 파라미터2 : 원래 함수가 받아야할 파라미터

// sayHello.call(park,'Eng','Ko');

//this를 조작하는 apply
// call이랑 똑같은데 파라미터2를 배열에 묶어서 줘야함

//sayHello.apply(park,['Eng','Ko']);

//this를 조작하는 bind  <<<<중요! 
//call, apply함수를 바로 실행시킨다 
//그러나 bind는 this를 조작한 새로운 함수를 반환하고 실행 시키지 않는당 

const bindedSayHello = sayHello.bind(park,'Ko','Span')

//예시
const eventHandler = function(fruits,e) {
    console.log(`event 객체 : e`);
    console.log('과일명 : ',fruits);
    // console.log(this);
};
const $input = document.querySelector('input');

// document.getElementById('btn').addEventListener('click',eventHandler.bind($input))
document.getElementById('btn').addEventListener('click',eventHandler.bind(null,'사과'));