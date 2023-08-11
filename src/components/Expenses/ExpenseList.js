import React from 'react';
import ExpenseItem from './ExpenseItem';
import './ExpenseList.css';
import ExpenseFilter from './ExpenseFilter';

const ExpenseList = ({ items: expense }) => {
  const filterChangeHandler = (selectedYear) => {
    console.log('select필터');
    console.log(selectedYear);
  };
  return (
    <div className="expenses">
      <ExpenseFilter onChageFilter={filterChangeHandler} />
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
