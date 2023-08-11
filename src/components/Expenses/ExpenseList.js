import React from 'react';
import ExpenseItem from './ExpenseItem';
import './ExpenseList.css';

const ExpenseList = ({ items: expense }) => {
  return (
    <div className="expenses">
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
    </div>
  );
};

export default ExpenseList;
