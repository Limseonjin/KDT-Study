import React from 'react';
import ExpenseList from './components/ExpenseList';
import Hello from './Hello';

const App = () => {
  //지출 항목에 대한 객체 배열
  const expense = [
    {
      title: '피즈',
      price: 21200,
      date: new Date(2023, 8 - 1, 5),
    },
    {
      title: '바나나',
      price: 29900,
      date: new Date(2023, 8 - 1, 7),
    },
    {
      title: '오뤤지',
      price: 2500,
      date: new Date(2023, 8 - 1, 11),
    },
  ];

  return (
    <>
    <ExpenseList items={expense} />
    <Hello>
      <ul>
        <li>사과</li>
        <li>포도</li>
        <li>복싱아</li>
      </ul>
    </Hello>
    </>
  );
};

export default App;
