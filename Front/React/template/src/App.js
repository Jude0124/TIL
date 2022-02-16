// JSX 문법
/*
const elem = <h3>Hello World</h3>


function App(){
  // return <h1>Hello World</h1>
  return elem;
}
*/

/*
// 1개의 요소만 리턴이 가능하다.
const elem = <div>
  <h1>Hello World</h1>
  <div>안녕하세요</div>
  </div>
function App() {
  // return elem;
  return <div>
  <h1>Hello World</h1>
  <div>안녕하세요</div>
  </div>
}
*/

/*
const elem =
<div>
  <h1>Hello World</h1>
  <div>안녕하세요</div>
</div>;
function App() {
  // return elem;
  return (
    <div>
      <h1>Hello World</h1>
      <div>안녕하세요</div>
    </div>
  )
}
*/

/*
function App() {
  const name = '놀부';
  const age = 30;
  const qty = 3;
  const cost  = 5;
  const arr = [10, 11, 100];
  const obj = {
    name : 'HeungBu',
    age : 20,
    address: 'Seoul'
  }
  const onAdd = function(x, y) {
    return `${x} + ${y} = ${x + y}`
  }
  return (
    <div>
      <h1>처음 만들어 보는 React</h1>

      <div>
        Name : {name}<br></br>
        Age : {age}<br />
        Total : {qty + cost} <br />
        Array : {arr[0]} / {arr[1]} / {arr[10]} <br />
        object : {obj.name} / {obj.age} / {obj.tel} <br />
        onAdd : {onAdd(10, 20)}
      </div>
    </div>
  )
}


// 외부 javascript 파일에서 사용할 수 있도록 출력
export default App 
*/

// import logo from './logo.svg';
// import './App.css';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

// export default App;

import './App.css';
import A01comp from './components/A01ClassComp';
import A02comp from './components/A02FuncComp';

function App() {
  return (
    <div className="APP">
      <h1>JSX</h1>

      <div>안녕하세요. 리엑트입니다.</div>
      <A01comp></A01comp>
      <A02comp></A02comp>

    </div>
  );
}

export default App;