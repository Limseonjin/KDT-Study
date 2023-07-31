/*
const increase = (() => {
    let count =0;
    return () => ++count;
})();
const decrease = (() => {
  let count =0;
  return () => --count;
})();

console.log(increase()); 
console.log(decrease()); 
console.log(decrease()); 
console.log(increase());
console.log(increase()); 
*/

//클로저 
/*
const countclosure = () =>{
  let count = 0;

  const increase = () => ++count;
  const decrease = () => --count;

  return{
    increase,
    decrease
  };
}

const counter = countclosure(); //객체 리턴 
console.log(counter.increase());
console.log(counter.increase());
console.log(counter.decrease());
console.log(counter.increase()); */

//즉시함수 
const {increase, decrease} = (()=> {
  let count = 0;

  return{
    increase : () => ++count,
    decrease : () => --count
  };
})();

console.log(increase());
console.log(decrease());
console.log(increase());
console.log(increase());
console.log(decrease());