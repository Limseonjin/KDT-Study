const URL = "http://localhost:5000/todos";

// UL 태그
const $todoUl = document.querySelector(".todo-list");

// form 태그
const $addForm = document.querySelector(".todo-insert");


//조회
fetch(URL)
  .then(res => res.json())
  .then((todoList) => {
    // 템플릿을 가져옴
    const $listTemplate = document.getElementById("single-list");

   todoList.forEach(({ id, text }) => {
      // 템플릿태그에서 li태그를 추출
      const $todoLi = document.importNode($listTemplate.content, true);
      $todoLi.querySelector(".checkbox input").dataset.checkId = id;
      $todoLi.querySelector(".todo-list-item").dataset.id = id;
      $todoLi.querySelector(".text").textContent = text;

      $todoUl.appendChild($todoLi);
    });
});


//추가
$addForm.addEventListener("click", (e) => {
  if (!e.target.matches("button")) return ;
  const payload = {
    text : document.getElementById("todo-text").value,
    done : false
  };
  // fetch로 POST요청 보내는법 
  fetch(URL,{
    method : 'POST',
    headers : {
      'content-type' : 'application/json',
    },
    body : JSON.stringify(payload)
  })
  .then(res => {
    if (xhr.status === 200 || xhr.status === 201) {
      alert("등록 성공!");
    } else {
      alert("등록 실패!");
    }
  })
});

const listHandler = e =>{
    e.preventDefault();
    // 삭제 클릭 대상 아이디 잡아오기
    const id = e.target.closest(".todo-list-item").dataset.id;

    //삭제 기능
    const deleteTodo = () => {
    fetch(`${URL}/${id}`,{
        method : 'DELETE'
    }).then(res => {
        if (xhr.status === 200) {
        alert("삭제 성공!");
        } else {
        alert("삭제 실패!");
        }
    });
    };
    
    //체크 박스 기능
    const checkTodo = () =>{

        fetch(`${URL}/${id}`),{
            method : 'PATCH',
            headers : {
                'content-type' : 'application/json',
              },
              body : JSON.stringify({done : true})
        }
        
    }
    //타겟에 따라 발생할 함수
    if (e.target.closest(".remove")) deleteTodo();
    //else if (e.target.closest(".checkbox input")) {
    //    checkTodo() ;
    
}

// 삭제 이벤트 등록
//$todoUl.addEventListener("click", listHandler);

$todoUl.addEventListener("change", (e)=>{
    const id = e.target.dataset.checkId;

    let isCheck = {done:false};

    if (e.target.checked){
        isCheck = {done : true};
    }
    

    fetch(`${URL}/${id}`,{
        method : 'PATCH',
        headers : {
            'content-type' : 'application/json',
        },
        body : JSON.stringify(isCheck)
    })
    .then(res => {
        if (!res.ok){
            console.log("에러에러");
        }
        return res.json();
    })
        
});


/*
4. 할일 체크 기능 - 체크박스를 누르면 put, patch요청으로 db.json에 
done값을 반대값으로 수정

5. 할 일 수정 기능 - 초록색버튼을 누르면 수정모드로 진입(인풋창 활성화)
 인풋창에 새로운 텍스트를 쓰고 확인을 누르면 put,patch요청이 나가고
db.json에서도 수정
*/