
const $btn = document.querySelector('button');

function trackHandler(){
    console.log('Click~~');
    setTimeout(()=>{
        console.log('1번코드');
    },5000);
    setTimeout(()=>{
        console.log('2번코드');
    },3000);
    setTimeout(()=>{
        console.log('3번코드');
    },1000);
}

$btn.addEventListener('click', trackHandler);

// let total = 0;
// for (let i=0; i< 1000000000; i++){
//     total += i;
// }
// console.log(total);

