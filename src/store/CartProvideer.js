import React, { useReducer } from 'react';
import CartContext from './cart-context';

//reducer함수 정의 : 여러자기 복잡한 상태관리를 중앙집중화
//state : 업뎃 이전 / action : 어떤 업데이트를 하는지의 정보, 필요값
const defaultState = { items: [] };
const cartReducer = (state, action) => {
  if (action.type === 'ADD') {

    const updatedItems = [...state.items, action.items]

    return {
      item : updatedItems
    }; // 업데이트된 액션을 리턴 

  }else if (action.type === 'REMOVE'){

    const removedItems = state.items.filter( item => !item.id !== action.id);

    return {
      item : removedItems
    }; // 업데이트된 액션을 리턴 

  }

  return defaultState;
};

const CartProvider = ({ children }) => {
  const [cartState, dispatchCartAction] = useReducer(cartReducer, defaultState);
  const cartContext = {
    items: cartState.items, //장바구니에 담긴 항목
    addItem: (item) => {
      //action함수는 반드ㄴ시 무슨 액션을 하는지와 액션에 필요한 값을 전달
      dispatchCartAction({
        type: 'ADD',
        item: item,
      });
    },
    removeItem: (id) => {
      dispatchCartAction({
        type: 'REMOVE',
        id: id,
      });
    },
  };

  //Provider의 value는 실제로 관리할 데이터 객체
  return (
    <CartContext.Provider value={cartContext}>{children}</CartContext.Provider>
  );
};

export default CartProvider;
