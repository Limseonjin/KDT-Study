
//ul 태그
const $postUl = document.querySelector('.posts');

// 서버와 통신하기 

const xhr = new XMLHttpRequest;
// console.log(xhr);

//통신 정보를 전달 
/*
    HTTP method 
    -GET: 리소스 조회(조회, 마이페이지)
    -POST: 리소스 등록 (쓰기, 회원가입, 장바구니)
    -PUT: 리소스 일괄수정 (게시물의 모든 정보를 통채로 수정)
    -PATCH: 리소스 일부수정 (게시물의 제목만 수정)
    -DELETE: 리소스를 삭제 (게시물 삭제, 회원탈퇴, 좋아요 취소)
*/
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
};