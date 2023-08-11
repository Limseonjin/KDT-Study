import React from 'react';
import ExpenseItem from './components/ExpenseItem';

const App = () => {
  //지출 항목에 대한 객체 배열
  const expense = [
    {
      title: '피즈',
      price: 21200,
      date: new Date(2023, 8, 5),
    },
    {
      title: '바나나',
      price: 29900,
      date: new Date(2023, 8, 7),
    },
    {
      title: '오뤤지',
      price: 2500,
      date: new Date(2023, 8, 11),
    },
  ];

  return (
    <>
      <ExpenseItem
        title={expense[0].title}
        price={expense[0].price}
        date={expense[0].date}
      />
      <ExpenseItem
        title={expense[1].title}
        price={expense[1].price}
        date={expense[1].date}
      />
      <ExpenseItem
        title={expense[2].title}
        price={expense[2].price}
        date={expense[2].date}
      />
    </>
  );
};

export default App;
