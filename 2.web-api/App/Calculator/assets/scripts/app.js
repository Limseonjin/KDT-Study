
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
  console.log(logEntries);
};

// 사용자의 입력값을 읽어오는 함수
const getUserNumerInput = () => parseInt($userInput.value);

// 계산 로그를 만들고 화면에 렌더링하는 함수
const createLogAndRenderOutput = (operateMark, originResult, calcNumber) => {
  // 로그 생성 :  0 + 11
  const calcDescriptionLog = `${originResult} ${operateMark} ${calcNumber}`;
  // 화면에 렌더링
  outputResult(currentResult, calcDescriptionLog);
};

// 더하기 버튼 이벤트 핸들러
const addHandler = () => {
  console.log('+ button click!');
  // 입력창에 입력한 숫자를 읽기
  const enteredNumber = getUserNumerInput();
  // 계산 전 값을 백업
  const originResult = currentResult;
  // 실제 계산 결과 반영
  currentResult += enteredNumber;
  createLogAndRenderOutput('+', originResult, enteredNumber);
  // 로그이력 쌓기
  writeToLog('ADD', originResult, enteredNumber, currentResult);
};

// substractHandler
const substractHandler = () => {
  console.log('- button click!');
  const enteredNumber = getUserNumerInput();
  const originResult = currentResult;
  currentResult -= enteredNumber;
  createLogAndRenderOutput('-', originResult, enteredNumber);
  writeToLog('SUB', originResult, enteredNumber, currentResult);
};

// multiplyHandler
const multiplyHandler = () => {
  console.log('x button click!');
  const enteredNumber = getUserNumerInput();
  const originResult = currentResult;
  currentResult *= enteredNumber;
  createLogAndRenderOutput('x', originResult, enteredNumber);
  writeToLog('MULTI', originResult, enteredNumber, currentResult);
};

// divideHandler
const divideHandler = () => {
  console.log('/ button click!');
  const enteredNumber = getUserNumerInput();
  const originResult = currentResult;
  currentResult /= enteredNumber;
  createLogAndRenderOutput('/', originResult, enteredNumber);
  writeToLog('DIVIDE', originResult, enteredNumber, currentResult);
};

// ============  이벤트 핸들러 바인딩 ============ //
$addBtn.addEventListener('click', addHandler);
$subtractBtn.addEventListener('click', substractHandler);
$multiplyBtn.addEventListener('click', multiplyHandler);
$divideBtn.addEventListener('click', divideHandler);