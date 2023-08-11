import React from 'react';
import ExpenseList from './components/Expenses/ExpenseList';
import Hello from './Hello';
import NewExpense from './components/NewExpense/NewExpense';

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
  //ExpenseForm에게 내려보낼 함수
  const onAddExpenseHandler = (NewExpense) => {
    console.log('App컴포넌트에서 응답함니다');
    console.log(NewExpense);
  };
  return (
    <>
      <NewExpense onAddExpense={onAddExpenseHandler} />
      <ExpenseList items={expense} />
    </>
  );
};

export default App;
