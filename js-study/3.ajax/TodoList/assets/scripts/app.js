const URL = 'http://localhost:5000/todos';

const $todoList = document.querySelector('.todo-list');
const $todoInsert = document.querySelector('.todo-insert');

// step1. db.json에 있는 todos를 화면에 렌더링하기
const fetchTodos = (url, method='GET', payload=null) => {
  const requestInit = {
    method: method,
    headers: { 'Content-Type': 'application/json' }
  };
  if (payload) requestInit.body = JSON.stringify(payload);

  return fetch(url, requestInit);
};

const renderRestTodo = (todoList) =>{
  //총 할 일 개수
  const totalTodos = todoList.length;
  //완료된 할 일의 개수 
  const restTodos = todoList.filter(todo=>todo.done).length;
  //렌더링
  const $rest = document.querySelector('.rest-todo');
  if (totalTodos === 0) return;

   $rest.textContent=`(${restTodos}/${totalTodos}개 완료)`;
  

}
// 화면에 todos를 렌더링하는 함수
const renderTodos = (todoList) => {
  //step5. 헤더 텍스트 변경 (4/5개 완료됨)
  renderRestTodo(todoList);
  
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
const insertTodo = async function(payload) {
  const res = await fetchTodos(URL, 'POST', payload)
     if (res.status === 200 || res.status === 201) {
      console.log('등록 성공!');
    } else {
      console.log('등록 실패!');
    }
  }
const addTodoHandler = e => {
  const $textInput = document.getElementById('todo-text');
  const inputText = ($textInput.value).trim();
  if (inputText === "") {
    $textInput.style.background = 'orangered';
    $textInput.setAttribute('placeholder','공백은 허용되지 않습니다!');
    $textInput.value = '';
    return;
  }
  const payload = {
    text: inputText,
    done: false
  };
  insertTodo(payload);
 
};

// step2. 할 일 등록 기능 / 엔터로추가 +빈칸은 등록거절
const $addBtn = document.getElementById('add');
$addBtn.addEventListener('click', addTodoHandler);
$todoInsert.addEventListener('submit',e=>{
  e.preventDefault();
})
$todoInsert.addEventListener('keydown', e=>{
  if (e.key === 'Enter'){
    addTodoHandler(e);
  }
});

// step3. 할 일 삭제 기능
const removeTodo = async (id) =>{
  const res = await fetchTodos(`${URL}/${id}`, 'DELETE')
  res => {
    if (res.status === 200 || res.status === 201) {
      console.log('삭제 성공!');
    } else {
      console.log('삭제 실패!');
    }
  };
}
const deleteTodoHandler = e=>{
  if (!e.target.matches('.remove span')) return;
  
  if (!confirm('진짜로 삭제합니까??')) return;

  const id = e.target.closest('.todo-list-item').dataset.id;
  removeTodo(id);
}
$todoList.addEventListener('click',deleteTodoHandler);

//step4. 할 일 완료 체크 처리 
const checkTodoHandler = e =>{
  console.log(e);
  if (e.target.type === 'checkbox'){
    const id = e.target.closest('.todo-list-item').dataset.id;
  
    fetchTodos(`${URL}/${id}`, 'PATCH',{
      done : e.target.checked
    })
  }
  else if (e.target.type === 'text'){
    modifyTodo(e.target);
  }
 

}
$todoList.addEventListener('change',checkTodoHandler);

//step5. 할 일 수정하기 
const insertTodoHandler = e=>{
  if (e.target.matches('.modify span.lnr-undo')){
    changeInsertTodo(e.target);
  }
  else if (e.target.matches('.modify span.lnr-checkmark-circle')){
    modifyTodo(e.target);  // 서버 수정 요청 보내기
  }
}
const modifyTodo = ($checkMark) =>{
  const $li= $checkMark.closest('.todo-list-item');
  const id = $li.dataset.id;
  const newtext = $li.querySelector('.modify-input').value;
  if (newtext === ""){
    alert('제대로 입력하세용');
    return;
  } 
  //즉시 실행 함수 
  (async ()=>{
    const res = await fetchTodos(`${URL}/${id}`, 'PATCH',{
      text : newtext
    })
  })();

}

const changeInsertTodo = (target) => {

  //span input으로 바꾸기
  const $text= target.closest('.todo-list-item').querySelector('.text')
  
  const $newInput = document.createElement('input');
  $newInput.setAttribute('type','text');
  $newInput.setAttribute('placeholder',$text.textContent);
  $newInput.classList.add('modify-input');

  $text.parentNode.replaceChild($newInput, $text)
  //버튼 바꾸기
  target.classList.replace('lnr-undo','lnr-checkmark-circle');

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