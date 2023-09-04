import React from 'react';

import ChartBar from './ChartBar';
import './Chart.css';

const Chart = ({ dataPoints }) => {
  
  // 지출액들만 월별로 추출
  const dataPointValues = dataPoints.map((dp) => dp.value);
  console.log(dataPointValues);

  // 그중에서 제일 지출이 높은 값
  const maximumValue = dataPointValues.reduce( (cur,accum) => cur + accum ,0)
  console.log(maximumValue);

  return (
    <div className="chart">
      {dataPoints.map(({ label, value }) => (
        <ChartBar
          key={label}
          label={label}
          currentValue={value}
          maxValue={maximumValue}
        />
      ))}
    </div>
  );
};

export default Chart;
