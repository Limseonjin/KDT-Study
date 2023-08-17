import React from 'react';

import Chart from '../Chart/Chart';

const ExpensesChart = ({ expenses }) => {
  //expenses로 chartDataPoints의 value값을 바꿔줘야함
  
  const chartDataPoints = [
    { label: 'Jan', value: 0 },
    { label: 'Feb', value: 0 },
    { label: 'Mar', value: 0 },
    { label: 'Apr', value: 0 },
    { label: 'May', value: 0 },
    { label: 'Jun', value: 0 },
    { label: 'Jul', value: 0 },
    { label: 'Aug', value: 0 },
    { label: 'Sep', value: 0 },
    { label: 'Oct', value: 0 },
    { label: 'Nov', value: 0 },
    { label: 'Dec', value: 0 },
  ];

  //선택 연도의 모든 지출 데이터를 꺼내서 월을 추출, 해당 월의 지출액을 누적
  expenses.forEach((exp) => {
    //요기 월에선 실제월 -1 되어있다
    const expenseMonth = exp.date.getMonth();
    const expensePrice = exp.price;

    chartDataPoints[expenseMonth].value += expensePrice;
  });

  return <Chart dataPoints={chartDataPoints} />;
};

export default ExpensesChart;
