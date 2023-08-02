
/*
  <nav class="gnb" id="global-nav">
    <ul class="list-item">
      <li class="list-item__food" title="korean">제육볶음</li>
      <li class="list-item__food" title="western">까르보나라</li>
      <li class="list-item__food" title="japanese">스시</li>
    </ul>
  </nav>
*/

//DOM의 properties 예시 
let nav1, ul1, li1, li2, li3;
nav1 = {
  tagName: 'NAV',
  attributes: {
    id: 'global-nav',
    class: 'gnb'
  },
  classList: ['gnb'],
  parendNode: body,
  children: [ul1]
};
ul1 = {
  tagName: 'UL',
  attributes: {
    class: 'list-item'
  },
  classList: ['list-item'],
  parentNode: nav1,
  children: [li1, li2, li3]
};
li1 = {
  tagName: 'LI',
  attributes: {
    class: 'list-item__food',
    title: 'korean'
  },
  classList: ['list-item__food'],
  textContent: '제육볶음',
  parentNode: ul1,
  nextElementSibling: li2
};
li2 = {
  tagName: 'LI',
  attributes: {
    class: 'list-item__food',
    title: 'western'
  },
  classList: ['list-item__food'],
  textContent: '까르보나라',
  parentNode: ul1,
  nextElementSibling: li3,
  previousElementSibling: li1
};
li3 = {
  tagName: 'LI',
  attributes: {
    class: 'list-item__food',
    title: 'japanese'
  },
  classList: ['list-item__food'],
  textContent: '스시',
  parentNode: ul1
};