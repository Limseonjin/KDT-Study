const userNames = ['김철수','강감찬','박영희'];

//userNames에서 각각의 요소들을 다시 변수로 저장시키고 싶당. 
/*const kim = userNames[0];
const kang = userNames[1];
const park = userNames[2];*/

const [kim,kang,park] = userNames;

console.log(`a:${kim}, b:${kang}, c:${park}`);

const [km, kg] = userNames
console.log(`km:${km}, kg:${kang}`);

const [kmm, ,pk] = userNames
console.log(`kmm:${kmm}, pk:${pk}`);

//변수값 교환하기
let first = 10;
let second = 20;

[second, first] = [first, second];
console.log(`1st : ${first}, 2nd:${second}`);

//맨 앞 2개는 각각의 변수에 저장하고 
//나머지는 묶어서 다시 배열로 만들고 싶단 
const [one,two, ...rest] = [1,2,3,4,5,6]

console.log(`1 : ${one}, 2: ${two}`);
console.log(rest);

//스프레드를 활용한 배열 간편 복사 
console.log('====================');
const foods =['감튀','햄벅','콜라'];

//const copyFoods = foods; //배열 포인터 복사 

//배열 값 복사 방법
//const copyFoods = foods.map(f => f);
//const copyFoods = foods.slice();
const copyFoods = ['치킨너겟',...foods,'닭강정'];

foods[1] = '치벅';
copyFoods[0] = '란라'
console.log('foods',foods);
console.log('copy',copyFoods);
