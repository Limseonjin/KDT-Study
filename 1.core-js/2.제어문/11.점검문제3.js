let op = ['+','-','x']
let quizCnt=1;
let o = 0;
let x = 0;

while (true) {
  let rn1 = Math.floor(Math.random() * 20) + 1;
  let rn2 = Math.floor(Math.random() * 20) + 1;
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