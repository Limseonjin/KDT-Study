import React, { useState } from 'react';
import './CourseInput.css';
import Button from '../UI/Button/Button';

const CourseInput = ({ onAdd }) => {
  const [enteredText, setEnteredText] = useState('');
  const [isValid, setIsValid] = useState(true);

  const textChangeHandler = (e) => {
    if (e.target.value.trim().length > 0) {
      setIsValid(true);
    }
    setEnteredText(e.target.value);
  };

  const formSubmitHandler = (e) => {
    e.preventDefault();

    if (enteredText.trim().length === 0) {
      setIsValid(false);
      return;
    }

    onAdd(enteredText);
    setEnteredText('');
  };

  return (
    <form onSubmit={formSubmitHandler}>
      <div className="form-control">
        <label>나의 목표</label>
        <input
          type="text"
          onChange={textChangeHandler}
          value={enteredText}
          style={{
            background: isValid ? 'transparent' : 'salmon',
            borderColor: isValid ? 'black' : 'red',
          }}
        />
      </div>
      <Button type="submit">목표 추가하기</Button>
    </form>
  );
};

export default CourseInput;
