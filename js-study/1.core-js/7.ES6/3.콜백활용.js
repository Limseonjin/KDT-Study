const userList = [{
  account: 'abc1234',
  userName: '대길이',
  job: '추노',
  address: '서울',
  hobbys: ['수영', '축구', '테니스']
},
{
  account: 'banana',
  userName: '빠나나',
  job: '과일',
  address: '서울',
  hobbys: ['푸드파이팅', '테니스']
},
{
  account: 'park1234',
  userName: '주차왕',
  job: '발렛파킹',
  address: '경기',
  hobbys: ['족구', '축구', '테니스', '영화감상']
},
{
  account: 'fire',
  userName: '불꽃남자카리스마',
  job: '게이머',
  address: '서울',
  hobbys: ['독서', '테니스']
},
];

// 4명의 회원 중 취미가 딱 2개인 사람들만 필터링해주세요. 
// 취미가 2개인 사람만 모아서 배열에 다시 담아줘 

function filterByHas2Hobby(){
  const filteredArray = [];
  for (let user of userList){
    if (user.hobbys.length === 2){
      filteredArray.push(user);
    }
  }
  return filteredArray
}

//서울 사는 사람들만 필터링해서 새로운 배열에 담아줭
function liveInSeoul(){
  const filteredArray = [];
  for (let user of userList){
    if (user.address === '서울'){
      filteredArray.push(user);
    }
  }
  return filteredArray
}

//콜백을 이용한 필터링 함수 
function filter(condition) {
  const filteredArray = [];
  for (let user of userList){
    if (condition(user)){
      filteredArray.push(user);
    }
  }
  return filteredArray
}

// const result1 =  filter(user =>  user.hobbys.length >= 3)
// console.log(result1);

// const result2 =  filter(user =>  user.address === '서울' && user.job === '게이머')
// console.log(result2);

// const hobby2 = liveInSeoul()
// console.log(hobby2);

// const hobby2 = filterByHas2Hobby()
// console.log(hobby2);

//회원정보중에회원 이름만 전부 모아서 배열에 담아줘 
//매핑 
function map(callback){
  //이름을 담을 배열
  const mappingArray = [];
  for (const user of userList){
    mappingArray.push(callback(user));
  }
  return mappingArray;
}

const nameList =map( user => user.userName);
console.log(nameList);

const addressList = map(user => user.address);
console.log(addressList);