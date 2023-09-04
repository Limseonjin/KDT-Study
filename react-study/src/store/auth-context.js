import React, { useEffect, useState } from 'react';
//로그인 상태변수를 관리할 컨텍스트

const AuthContext = React.createContext({
  isLoggedIn: false,
  onLogout: () => {},
  onLogin: (emain, password) => {},
});

export const AuthContextProvider = ({children}) => {
  //로그인 상태를 관리하는 변수
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  //화면이 리 렌더링될때 localStorage를 확인해서
  //현재 로그인 플래그가 존재하는지 검사
  useEffect(() => {
    console.log('로그인 검사 수행');
    const storedLoginFlag = localStorage.getItem('login-flag');
    if (storedLoginFlag === '1') {
      setIsLoggedIn(true);
    }
  }, []);

   //서버로 로그인을 요청하는 함수
   const loginHandler = (email, password) => {
    //로그인의 증거로 브라우저에 로그인 값을 1로 표현해서 저장
    localStorage.setItem('login-flag', '1');
    setIsLoggedIn(true);
  };

  const logoutHandler = () => {
    localStorage.removeItem('login-flag');
    setIsLoggedIn(false);
  };
  return(
    <AuthContext.Provider value={{
      isLoggedIn:isLoggedIn,
      onLogout : logoutHandler,
      onLogin:loginHandler,
    }}>
      {children}
    </AuthContext.Provider>
  )
};

export default AuthContext;
