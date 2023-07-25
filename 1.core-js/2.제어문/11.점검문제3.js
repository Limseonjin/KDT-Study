let op = ['+','-','x']
let quizCnt=1;
let o = 0;
let x = 0;
let level;
let levn = 0;

let game = true;
game : while(game){
  while (true) {
    if (!level){
      level = +prompt(`난이도를 설정하세요!
      0.게임종료 1. 상 (1~100) | 2.중 (1~50) | 3. 하 (1~20)`);
      
      if (level === 0) break game;
      else if (level === 1) levn=100;
      else if (level === 2) levn=50;
      else if (level === 3) levn=20;
      else {alert(`똑바로 입력하세요`); continue};
    }
    let rn1 = Math.floor(Math.random() * levn) + 1;
    let rn2 = Math.floor(Math.random() * levn) + 1;
    let rop = op[Math.floor(Math.random()* op.length)];

    let usrN = +prompt(`즐거운 사칙연산~~ 
    문제를 푸시다가 지겨우면 0을 누르세요~~ 
    Q${quizCnt}. ${rn1} ${rop} ${rn2} = ??`)

    if (usrN === 0) {
      break;
    }
    quizCnt++;

    if (rop === '+'&& usrN === rn1+rn2){
        alert(`정답입니다!!`);
        o++;
        continue;
    }
    else if (rop === '-' &&usrN === rn1-rn2){
        alert(`정답입니다!!`);
        o++;
        continue;
    }
    else if (rop === 'x' && usrN === rn1*rn2){
        alert(`정답입니다!!`);
        o++;
        continue;
    }
    else{
        alert(`오답입니다!!`);
        x++;
    }
  } 
  alert(`정답횟수:${o} , 틀린횟수:${x}`)
  game = prompt(`다시 하고싶으면 아무거나 입력`);
}

