import React from 'react';
import Header from './components/Food/Layout/Header';
import Meals from './components/Food/Meals/Meals';
import AvailableMeals from './components/Food/Meals/AvailableMeals';
//컨텍스트 불러오기

const App = () => {
  return (
    <>
      <Header />
      <div id="main">
        <Meals />
      </div>
    </>
  );
};

export default App;
