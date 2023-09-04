import React from 'react';

import './ChartBar.css';

const ChartBar = ({ label, currentValue, maxValue }) => {
  let barFillheight = `0%`;

  if (maxValue > 0){
    const percentage = (currentValue / maxValue)* 100;
    barFillheight = percentage+'%';
  }
  return (
    <div className="chart-bar">
      <div className="chart-bar__inner">
        <div
          className="chart-bar__fill"
          style={{ height: barFillheight }}
        ></div>
      </div>
      <div className="chart-bar__label">{label}</div>
    </div>
  );
};

export default ChartBar;
