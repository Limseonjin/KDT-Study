// 1 ~ 100 사이의 랜덤한 숫자하나가 정답으로 주어진다.
// 사용자는 이 사이의 숫자를 입력할 수 있어야 한다.
// 시스템은 입력한 숫자를 판단하여 up인지 down인지 알려줘야 한다.
// 만약 정답을 맞추지 못하면 지속해서 입력을 받고 결과를 알려준다.
// 정답을 맞추면 맞췄다는 메시지와 함께 프로그램을 종료한다.

// 사용자들은 입력 기회가 5번으로 제한된다. 
// 즉, 5번 안에 정답을 맞추지 못할 경우 게임이 강제종료된다.

// 사용자는 게임 시작전에 난이도를 설정할 수 있다. 
// 난이도는 상, 중, 하 난이도가 존재하며 
// 난이도별 입력 횟수제한이 다르다.



let game = true;
game : while (game){
    let rn = Math.floor(Math.random() * 100) + 1;
    let cnt;
    let start = 1;
    let end = 100;
    let level;
    while (true){  
        if (!level){
            level = +prompt(`난이도를 설정하세요!
            0.게임종료 1. 상(기회4번) 2.중 (기회 6번) 3. 하 (기회 10번)`);

            if (level === 0) break game;
            else if (level === 1) cnt=4;
            else if (level === 2) cnt=6;
            else if (level === 3) cnt=10;
            else {alert(`똑바로 입력하세요`); continue};
        }
        if (cnt <= 0){
            alert(`GAME OVER! 당신이 졌습니다.`);
            break;
        }
      
        
        let userNum = +prompt(`${start} ~ ${end} 사이의 숫자를 입력하세요`);
        cnt--;
    
        if ( rn > userNum){
             alert(`UP!! 기회가 ${cnt}번 남았습니다`); 
             start = userNum+1;
        }
        else if ( rn < userNum) {
             alert(`Down!!  기회가 ${cnt}번 남았습니다`); 
             end = userNum-1;
            }
        else {
            alert('정답입니다!!');
            break;
        }
    }
    game = prompt(`다시 하고싶으면 아무거나 입력`);
}

