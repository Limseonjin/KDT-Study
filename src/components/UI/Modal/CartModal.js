import React from 'react';
import styles from './CartModal.module.scss';
import Portal from '../Portal/Portal';

const Backdrop = ({ onHide }) => {
  return <div className={styles.backdrop} onClick={onHide}></div>;
};
const ModalOverlay = ({ children }) => {
  return (
    <div className={styles.modal}>
      <div className={styles.content}>{children}</div>
    </div>
  );
};

const CartModal = ({ onClose, children }) => {
  return (
    <>
      <Portal destId="backdrop-root">
        <Backdrop onHide={onClose} />
      </Portal>
      <Portal destId="overlay-root">
        <ModalOverlay>{children}</ModalOverlay>
      </Portal>
    </>
  );
};

export default CartModal;
