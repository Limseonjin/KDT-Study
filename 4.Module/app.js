// eslint-disable-next-line linebreak-style
// eslint-disable-next-line linebreak-style
import { $btn } from './getDOM.js';
import ABC, { clickHandler as ch } from './event.js';

const init = () => {
  $btn.style.background = 'aqua';
  $btn.addEventListener('click', ch);
  const dog = new ABC('초코', 4);
  dog.info();
};

// eslint-disable-next-line eol-last
init();
