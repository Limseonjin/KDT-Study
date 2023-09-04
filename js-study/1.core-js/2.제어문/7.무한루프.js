// 무한루프 : 무한하게 반복 - 악성코드
//횟수를 몰라서 일단 무한하게, 반드시 탈출조건 필수!

let i = 0
while (true){
    if (i >100) break;
    console.log(`hello! ${i}`);
    i += 1
}