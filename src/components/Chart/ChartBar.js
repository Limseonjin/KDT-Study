import React from 'react';

import './ChartBar.css';

const ChartBar = ({ label }) => {
  let barFillheight = `50%`;
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
