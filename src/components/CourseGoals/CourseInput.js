import React from 'react';
import './CourseInput.css';
import Button from '../UI/Button/Button';

export const CourseInput = () => {
  return (
    <form>
      <div className="form-control">
        <label>나의 목표</label>
        <input type="text" />
      </div>
      <Button type="submit">목표 추가하기</Button>
    </form>
  );
};
