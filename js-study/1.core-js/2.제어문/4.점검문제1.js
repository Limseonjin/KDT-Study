let start = +prompt(`시작 값 입력`);
let end = +prompt(`마지막 값 입력`);
let tol = 0;
let temp;

if (start > end) {
    temp = start;
    start = end;
    end = temp;
}
for (let i=start; i<=end; i++){
    tol += i;
}
alert(`${start} ~ ${end}까지의 누적합:${tol}`);