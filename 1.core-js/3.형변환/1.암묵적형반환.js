let n1 = 10;
let n2 = '20';

console.log(n1 + n2);

let n3 = n1 + '';
console.log(typeof(n3));

let n4 = '100' - 55;
console.log(n4);

//truthy, falsy
// 0 , '', null . undefined, NaN은 거짓이다. 
// 나머지는 모두 참 
//Truthy
if (undefined) console.log('OK1'); 
if (null) console.log('OK2');
if (0) console.log('OK3');
if ('') console.log('OK4'); 
if (NaN) console.log('OK5');
//Falsy
if (0) console.log('OK6'); 
if (-100.99) console.log('OK7');
if ('  ') console.log('OK8');
if ('메렁') console.log('OK9'); 
if ([1,2,3]) console.log('OK10');
if (function () {  
}) console.log('OK101');