import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import { Abb, x as AbbX } from './Abb'; // {} 내부의 이름은 변수명과 동일해야 한다.
import reportWebVitals from './reportWebVitals';


ReactDOM.render(
  <React.StrictMode>
    {/* 
      1. 태그명으로 사용하는 경우 첫 글자는 반드시 대문자로 정의
      2. 종료 태그가  반드시 존재해야 한다. 또는 <tabName />
    */}
    <Abb />
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
