const NOT_FOUND = -1;
let foods = ['짬뽕','초밥','김치찌개','족발'];
let index = foods.indexOf('짬뽕');

//특정 요소가 어디 인덱스에 있는지 인덱스를 반환 
function myIndexOf(array, searchElement){
  for (let i =0; i<array.length; i++){
    if (searchElement === array[i]) return i;
  }
  return NOT_FOUND;
}

//배열에서 특정 요소가 존재하는지 유무를 확인
function myIncludes(array, searchElement){
  return myIndexOf(array,searchElement) !== NOT_FOUND;
}

index = myIndexOf(foods,'초밥');
let isPresent = myIncludes(foods,'초밥');
console.log(`${index}`);
console.log(`${isPresent}`);
