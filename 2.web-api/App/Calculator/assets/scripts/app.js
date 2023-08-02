
// index.html에서 활용할 이벤트처리, 핸들러...

// 계산 이력을 모아둘 배열
const logEntries = [];

// 현재 계산기에 그려질 숫자
let currentResult = 0;

// 로그 이력을 만드는 함수
const writeToLog = (operation, prevResult, number, result) => {
  // 하나의 로그 객체 (연산, 이전결과, 연산숫자, 연산결과)
  const logObject = {
    operation,
    prevResult,
    number,
    result 
  };
  logEntries.push(logObject);
  //Calculator-Log에 출력하기 
  createLog(logEntries);
};

//태그 생성 후 로그 정보를 저장
const createLog = (logEntries)=>{
  const logLi = $loglist.appendChild(document.createElement('li'))
  logEntries.forEach((log)=> {
  logLi.textContent=(`${log.operation},${log.prevResult},${log.number},${log.result}`)
  });
}

// 사용자의 입력값을 읽어오는 함수
const getUserNumerInput = () => parseInt($userInput.value);

// 계산 로그를 만들고 화면에 렌더링하는 함수
const createLogAndRenderOutput = (operateMark, originResult, calcNumber) => {
  // 로그 생성 :  0 + 11
  const calcDescriptionLog = `${originResult} ${operateMark} ${calcNumber}`;
  // 화면에 렌더링
  outputResult(currentResult, calcDescriptionLog);
};

// 계산 기능 헬퍼 함수
const calculate = (type) => {
  // 계산 전 값을 백업
  const originResult = currentResult;
  // 입력창에 입력한 숫자를 읽기
  const enteredNumber = getUserNumerInput();

  let mark;
  if (type === 'ADD') {
    mark = '+';
    // 실제 계산 결과 반영
    currentResult += enteredNumber;
  } else if (type === 'SUB') {
    mark = '-';
    currentResult -= enteredNumber;
  } else if (type === 'MULTI') {
    mark = 'x';
    currentResult *= enteredNumber;
  } else {
    mark = '/';
    currentResult /= enteredNumber;
  }

  console.log(`${mark} button click!`);
  createLogAndRenderOutput(mark, originResult, enteredNumber);
  // 로그이력 쌓기
  writeToLog(type,originResult,enteredNumber,currentResult);
};


// 더하기 버튼 이벤트 핸들러
const addHandler = () => {
  calculate('ADD');
};

// substractHandler
const substractHandler = () => {
  calculate('SUB');
};

// multiplyHandler
const multiplyHandler = () => {
  calculate('MULTI');
};

// divideHandler
const divideHandler = () => {
  calculate('DIVIDE');
};

// ============  이벤트 핸들러 바인딩 ============ //
$addBtn.addEventListener('click', addHandler);
$subtractBtn.addEventListener('click', substractHandler);
$multiplyBtn.addEventListener('click', multiplyHandler);
$divideBtn.addEventListener('click', divideHandler);