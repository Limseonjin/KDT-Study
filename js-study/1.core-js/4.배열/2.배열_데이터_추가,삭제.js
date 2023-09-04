let pets =['멍멍이','냥냥이','쩝쩝스']
console.log(pets);

//배열 맨 끝에 데이터 추가 
pets.push('징징이');
pets.push('징징이','거북이','콩순이');
console.log(pets);

//맨 끝 데이터 지우기 
let r1 = pets.pop();
pets.pop();
pets.pop();
console.log(pets);
console.log(r1);

//배열의 맨 첫 위치에 데이터 추가 
pets.unshift('비둘귀')
console.log(pets);

//맨 첫 데이터 제거 
pets.shift();
console.log(pets);