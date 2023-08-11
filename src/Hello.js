//rafce

import React from 'react';
import Card from './components/UI/Card';

const Hello = (props) => {
  console.log('hi componenet');
  console.log(props);
  return (
    <Card className="rectangle ">
      <div>
        {props.children}
        Hello React
      </div>
    </Card>
  );
};

export default Hello;
