
//OR 연산: 첫번째 truthy를 반환 
console.log(`hello` || `world`);
console.log(0 || `안녕`);

//AND 연산: 첫번째 falsy를 반환 
console.log(`Hello` && `Wold`);
console.log(null && `W메홍`);

/* 활용 
    <h1>웰컴 투 홈</h1>
    isLogin && <h2>ㅌㅌ님 환영합니다</h2>
    
    coupon && sendCoffee() 

*/