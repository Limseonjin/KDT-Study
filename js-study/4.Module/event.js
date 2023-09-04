/* eslint-disable require-jsdoc */
// getDOM꺼
import { $p as $para } from './getDOM.js';

// event 꺼
const $p = document.querySelector('p');

export const clickHandler = (e) => {
  $para.textContent = '하이!';
};

// default는 파일에 1개만 ㄱㄴ
export default class {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  // eslint-disable-next-line require-jsdoc
  info() {
    alert(`${this.name}: 저는 ${this.age}살 입니다.`);
  }
}
