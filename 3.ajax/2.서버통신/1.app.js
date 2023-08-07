
//ul 태그
const $postUl = document.querySelector('.posts');
//form 태그
const $addForm = document.querySelector('#new-post form');


//서버에서 게시물들을 가져와서 화면에 렌더링 함수 
const feachGetPosts = () =>{
  // 서버와 통신하기 
  const xhr = new XMLHttpRequest;
  
  xhr.open('GET','http://localhost:5000/posts');

  //요청 보내기 
  xhr.send();

  //응답 데이터 가져오기 
  xhr.onload = e=> {
      //요청이 끝난 후 xhr객체를 보면 응답 정보가 들어있습니다.
    //console.log(xhr.response);  

    //서버에서 온 데이터는 js가 아니라 json이다. 따라서 js에서 사용하려면 json을 js로 변환해야함
    //JSON -> JS : JSON.parse()
    //JS -> JSON : JSON.stringify()
    const postList = JSON.parse(xhr.response);
    //console.log(postList);

    postList.forEach(post => {
      const $postLi = document.createElement('li');
      $postLi.classList.add('post-item');
      $postLi.innerHTML=`
          <h2>${post.title}</h2>
          <p>${post.body}</p>
          <button>DELETE</butoon>
      `;
      $postUl.appendChild($postLi);
    });
  }
};

feachGetPosts();

const fetchNewPost = (e) =>{
  e.preventDefault(); //form의 새로고침 기능 중단 
  // 서버와 통신하기 
  const xhr = new XMLHttpRequest;
  
  xhr.open('POST','http://localhost:5000/posts');

  const payload = JSON.stringify({
    title : document.getElementById('title').value,
    body : document.getElementById('content').value
  })

  xhr.setRequestHeader('content-type','application/json');
  //요청 보내기 
  xhr.send(payload);

  //응답 상황 처리 
  xhr.onload = e=>{
    if (xhr.status === 200 || xhr.status === 201){
      alert('게시물 등록 성공!');
    }else {
      alert('게시물 등록 실패!');
    }
  }
}

//폼 태그 전송 이벤트 등록 
$addForm.addEventListener('submit',fetchNewPost);

document.getElementById('go-link').addEventListener('click', e=>{
  const flag = confirm('정말 이동하시겠습니까?');
  if (!flag){
    console.log('너 못갛ㅎ');
    e.preventDefault(); //태그의 기본 기능을 없앰. 
                        //a -> link 이동 / checkbox -> check / form -> 서버 데이터 전달 및 새로고침

  }
})