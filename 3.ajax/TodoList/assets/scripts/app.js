const URL = 'http://localhost:5000/todos';

const $todoList = document.querySelector('.todo-list');

// step1. db.json에 있는 todos를 화면에 렌더링하기
const fetchTodos = (url, method='GET', payload=null) => {
  const requestInit = {
    method: method,
    headers: { 'Content-Type': 'application/json' }
  };
  if (payload) requestInit.body = JSON.stringify(payload);

  return fetch(url, requestInit);
};

// 화면에 todos를 렌더링하는 함수
const renderTodos = (todoList) => {
  // li태그의 템플릿을 가져옴
  const $liTemplate = document.getElementById('single-todo');

  todoList.forEach(({ id, text, done }) => {
    // console.log('todo: ', todo);
    const $newLi = document.importNode($liTemplate.content, true);
    $newLi.querySelector('li').dataset.id = id; // data-id 속성 부여
    $newLi.querySelector('.text').textContent = text;

    // 체크박스 가져오기
    const $checkbox = $newLi.querySelector('.checkbox input[type=checkbox]');
    // console.dir($checkbox);
    $checkbox.checked = done;

    done && $checkbox.parentNode.classList.add('checked');

    $todoList.appendChild($newLi);
  });
};

// ========= 이벤트 관련 함수 ========= //
const addTodoHandler = e => {
  // 1. 클릭이벤트가 잘 일어나나?
  // console.log('클릭!');

  // 2. 클릭하면 일단 왼쪽에 인풋의 텍스트를 읽어야 함.
  // 2-1. 인풋부터 찾자
  const $textInput = document.getElementById('todo-text');
  // 2-2. 인풋 안에 텍스트를 꺼내자
  const inputText = $textInput.value;

  // 3. 그럼 서버에 이 데이터를 보내서 저장해야 하는데?
  // -> fetch가 필요하겠다. 저장이니까 POST해야겠다.
  // -> payload를 API 스펙에 맞게 만들어 보내야 함
  const payload = {
    text: inputText,
    done: false
  };
  fetchTodos(URL, 'POST', payload)
    .then(res => {
      if (res.status === 200 || res.status === 201) {
        console.log('등록 성공!');
      } else {
        console.log('등록 실패!');
      }
    });
};

// step2. 할 일 등록 기능 
const $addBtn = document.getElementById('add');
$addBtn.addEventListener('click', addTodoHandler);

// step3. 할 일 삭제 기능

const deleteTodoHandler = e=>{
  if (!e.target.matches('.remove span')) return;
  
  if (!confirm('진짜로 삭제합니까??')) return;

  const id = e.target.closest('.todo-list-item').dataset.id;
  
  fetchTodos(`${URL}/${id}`, 'DELETE')
  .then(res => {
    if (res.status === 200 || res.status === 201) {
      console.log('삭제 성공!');
    } else {
      console.log('삭제 실패!');
    }
  });
}
$todoList.addEventListener('click',deleteTodoHandler);

//step4. 할 일 완료 체크 처리 
const checkTodoHandler = e =>{
  const id = e.target.closest('.todo-list-item').dataset.id;

  fetchTodos(`${URL}/${id}`, 'PATCH',{
    done : e.target.checked
  })
}
$todoList.addEventListener('change',checkTodoHandler);

//step5. 할 일 수정하기 
const insertTodoHandler = e=>{
  if (!e.target.matches('.modify span')) return;

  if (e.target.classList.contains('lnr-undo'))
    changeInsertTodo(e.target);
}

const changeInsertTodo = (target) => {
  const id = target.closest('.todo-list-item').dataset.id;

  //span input으로 바꾸기
  const $li = target.closest('li')
  const $text= $li.querySelector('.checkbox .text')
  
  const $newInput = document.createElement('input');
  $newInput.setAttribute('type','text');
  $newInput.setAttribute('placeholder',$text.textContent);
  $newInput.classList.add('modify-input');

  $text.parentNode.replaceChild($newInput, $text)
  //버튼 바꾸기
  target.classList.replace('lnr-undo','lnr-checkmark-circle');

  
  target.addEventListener('click',(e)=>{
    let newtext = $newInput.value
    if (newtext === "")
      newtext = $text.textContent;

    fetchTodos(`${URL}/${id}`, 'PATCH',{
      text : newtext
    })
    console.log($newInput.value);
  })
}

$todoList.addEventListener('click',insertTodoHandler);
// =========== 앱 실행 =========== //
const init = () => {
  fetchTodos(URL)
    .then(res => res.json())
    .then(todos => {
      renderTodos(todos);
    });
};

init();