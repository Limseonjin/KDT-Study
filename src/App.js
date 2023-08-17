import React, { useState } from 'react';
import './App.css';
import CourseList from './components/CourseGoals/CourseList';
import CourseInput from './components/CourseGoals/CourseInput';

const DUMMY_DATA = [
  {
    id: 'g1',
    text: '리엑트 컴포넌트 스타일링 마스터하깅',
  },
  {
    id: 'g2',
    text: 'UI 고수되기 ',
  },
];

const App = () => {
  const [goals, setGoals] = useState(DUMMY_DATA);
  //courselist 조건부 렌더링
  let listContent = (
    <p
      style={{
        color: 'red',
        fontSize: '2em',
        textAlign: 'center',
      }}
    >
      목표를 등록해주세요
    </p>
  );

  //삭제 핸들러를 item까지 내려보내야함
  const deleteGoalHandler = (id) => {
    console.log(id + '클릭됨');
    const updateGoals = goals.filter((goal) => goal.id !== id);

    setGoals(updateGoals);
  };

  if (goals.length > 0) {
    listContent = <CourseList items={goals} onDelete={deleteGoalHandler} />;
  }
  //Input에게 전달할 함수
  const addGoalHandler = (text) => {
    console.log(text);
    const newGoal = {
      id: Math.random().toString(),
      text: text,
    };

    // setGoals([...goals, newGoal]);
    //순서에 따라 수정됨
    setGoals((prevGoals) => [...prevGoals, newGoal]);
  };

  return (
    <div>
      <section id="goal-form">
        <CourseInput onAdd={addGoalHandler} />
      </section>
      <section id="goals">{listContent}</section>
    </div>
  );
};

export default App;
