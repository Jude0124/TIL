import { useState } from 'react';

import './../node_modules/bootstrap/dist/css/bootstrap.css';
import A01Props from './components/A01Props';
import A02State from './components/A02State';
import A04CreateDOM from './components/A04CreateDOM';
import A05Hook from './components/A05Hook';

function App() {
  //  useState로 정의된 변수는 값이 변경되면 변경된 값으로 화면 갱신을 한다.
  const [name , setName] = useState('NolBu');

  //  이 변수는 변경되도 화면에 반영되지 않는 일반 함수
  // const name = 'NolBu';
  let age = 20;
  const arr = [10, 11, 100];
  const obj = {
    name : 'HeungBu',
    age : 18,
  }
  const onAdd = (x, y) => `${x}+ ${y} = ${x + y}`;
  const changeAge = () => {
    age = 100 ;
    console.log('Age -> ' , age);    /*내부적으로는 변경된다. 하지만 화면 갱신 작업이 없어서 화면에서 바뀌지않는다.*/
  }
  const changeName = () => setName('놀부');

  return (
    <div className ='container'>
      <div className = 'col-12'>
        <h1>Component</h1>
      </div>

      <div className = 'col-12'>
        <A05Hook.js />
      </div>

      <div className ='col-12'>
        <A04CreateDOM />
      </div> 
      <br />

      <div className='col-12'>
          <A02State name = {name} age = {age} />
      </div>
      
      <div className='col-12'>
        
        {/* 전달 값은 속성 형식으로 전달한다. {}를 ""로 묶지 않는다. */}
        <A01Props comp="A01 Props"
         name = {name} age = {age} ary = {arr} obj = {obj}
          onAdd = {onAdd} changeName = {changeName} changeAge = {changeAge} ></A01Props>
      </div>
    
    
    </div>
  );
}

export default App;
