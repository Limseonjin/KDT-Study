
const emp = {
  empName: '뽀로로',
  age : 4,
  hireDate: '2020-01-01',
  birthDay: '2020-01-01'
};

//이름 똑같아야 함
const {empName, birthDay, age} = emp
console.log(`내 이름은 ${empName}이고, 나이는 ${age}살 입니다. 그리고 생일은 ${birthDay}입니다.`);

//별칭 붙이기
const {empName:en, birthDay:bd, age:a} = emp
console.log(`내 이름은 ${en}이고, 나이는 ${a}살 입니다. 그리고 생일은 ${bd}입니다.`);

console.log('===================');
const { birthDay:bDay , ...others} = emp;
console.log(others);

//객체 복사 
console.log('===================');
const copyEmp = { ...emp, 
  address: '청양군',
  hobbies : ['산책','수영'],
  age : 17
};

copyEmp.empName = '잔만울피'

console.log(copyEmp);
console.log(emp);