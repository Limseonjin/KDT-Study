import React from 'react';
import './App.css';

function App() {
  const $h2 = React.createElement('h2', null, '반가방가~~');
  return (
    <>
      <div className="App">
        <h1>메롱메롱</h1>
        {$h2}
      </div>
      <div className="noname">
        <input type='text'/>
        <p>
          오늘은 태풍이 와서 비가 많이 내렸땅. <br />
          그래서 공부가 하기 실땅
        </p>
      </div>
    </>
  );
}

export default App;
