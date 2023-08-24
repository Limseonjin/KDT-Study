import React, { useState } from 'react';
import Header from './components/Food/Layout/Header';
import Meals from './components/Food/Meals/Meals';
import Cart from './components/Food/Cart/Cart';
//컨텍스트 불러오기
import CartProvider from './store/CartProvideer';

const App = () => {
  //장바구니 모달을 닫고 여는 상태변수
  const [cartIsShown, setCartIsShown] = useState(false);

  //모달을 열어주는 핸들러
  const showCartHandler = () => setCartIsShown(true);
  //모달을 닫아주는 핸들러
  const hideCartHandler = () => setCartIsShown(false);

  return (
    <CartProvider>
      {cartIsShown && <Cart onHideCart={hideCartHandler} />}
      <Header onShowCart={showCartHandler} />
      <div id="main">
        <Meals />
      </div>
    </CartProvider>
  );
};

export default App;
