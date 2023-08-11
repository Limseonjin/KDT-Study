import React from 'react';
import './ExpenseDate.css';

const ExpenseDate = ({ date }) => {
  //날짜 포맷팅 변환 함수 정의
  const year = date.getFullYear();
  const month = date.toLocaleString('en-US', { month: 'long' });
  const day = date.getDate();

  return (
    <div className="expense-date">
      <div className="expense-date__year">{month}</div>
      <div className="expense-date__month">{year}</div>
      <div className="expense-date__day">{day}</div>
    </div>
  );
};

export default ExpenseDate;
