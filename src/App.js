import React from 'react';
import ExpenseItem from './components/ExpenseItem';
import ExpenseList from './components/ExpenseList';

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

  return <ExpenseList items={expense} />;
};

export default App;
