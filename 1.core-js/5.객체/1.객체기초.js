let myPet = {
    name : '뽀삐',
    age : 3,
    favorite : ['산책','간식'],
    kind : '진돗개',
    injection: true
};
let yourPet = {
    name : '파블로',
    kind : '블랙러시안',
    age : 4,
    favorite : ['낮잠','털뭉치'],
    injection: true,
    'hate-food' : '양냠게댱'
};

console.log(typeof myPet);

//객체에 저장된 데이터(프로퍼티) 참조
console.log(myPet.kind);
console.log(yourPet.kind);
console.log(yourPet.age*4);
console.log(yourPet.favorite[0]);

myPet.favorite.push('꼬리흔들기')
console.log(myPet);

//키-값 == 프로퍼티 
//프로퍼티 참조 2 - -- [""] 필수
console.log('================');
console.log(myPet.injection);

console.log(myPet['injection']);
console.log(yourPet["hate-food"]);

let myPetName = 'name';
console.log(myPet[myPetName]);