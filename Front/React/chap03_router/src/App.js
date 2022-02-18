
import 'bootstrap/dist/css/bootstrap.css';
// npm i bootstrap@4

// https://velog.io/@soryeongk/ReactRouterDomV6
// npm un react-router  => 6 버전이 설치되면 삭제 
// npm i react-router@5 

// npm un react-router-dom  => 6 버전이 설치되면 삭제 
// npm i react-router-dom@5


import { Link, NavLink, Route, Switch } from 'react-router-dom'

import A01FunctionProps from './components/A01FunctionProps'
import A02FunctionState from './components/A02FunctionState'
import A03Currency from './components/A03Currency'
import A04History from './components/A04History'
import A05MatchParam from './components/A05MatchParam'
import A06Arguments from './components/A06Arguments'
import A07ChildComponent from './components/A07ChildComponent'
import NotFoundComponent from './components/NotFoundComponent'

function App() {
  const user = {name: 'HungBu', age: 20};
  const ary = ['a', 'b', 'c'];
  const onPlus = (x, y) => {
    return `${x} + ${y} = ${x + y}`;
  }
  const style = { color: 'orange', fontWeight : 'bold'}
  
  return (
    <div className="card-body">
      <h1>Router</h1>

      <div>
        <NavLink activeStyle={style} to="/index">Index</NavLink> | {' '} 
        <NavLink activeStyle={style} to="/props">Props</NavLink> | {' '}
        <NavLink activeStyle={style} to="/state">State</NavLink> | {' '}
        <Link to="/currency">Currency</Link> | {' '}
        <Link to="/history">History</Link> | {' '}
        <Link to="/params/5/data/NolBu">NolBu</Link> | {' '}
        <Link to="/params/3/data/HungBu">HungBu</Link> | {' '}
        <Link to="/args?no=5&name=NolBu&add=Seoul">Args</Link> | {' '}
        <Link to="/child">Child</Link> | {' '}
        <Link to="/abc">ABC</Link> | {' '}
      </div>

      <hr />

      {/* Route가 기술된 영역에 지정한 컴퍼넌트가 표시된다 
        exact => path의 매칭 여부     
        Switch => 매칭되는 path를 만나면 Switch 태그를 벗어난다. (하위 검색 안함) 
      */}
      <Switch>
      <Route path="/"  exact={true}       render={ () => <div>
                                                <h1>Index Page</h1>
                                                <div>Hello World</div>
                                              </div>} />

      {/* props로 값을 전달 할 필요가 있는 경우 */}
      <Route path="/props"     render={ () => <A01FunctionProps name="NolBu" age={20} arr={ary} user={user} onPlus={onPlus} isChecked={true} /> } />

      {/* props의 값 전달 없이 순수하게 표시만 하는 경우는 component로 간단히 사용 */}
      <Route path="/state"      component={A02FunctionState} />
      <Route path="/currency"   component={A03Currency} />
      <Route path="/history"    component={A04History} />

      {/* path/:no => no는 임의의 이름이 들어올 수 있는 패스 이름이 되면서 변수명 역할을 한다  */}
      <Route path="/params/:no/data/:name"     component={A05MatchParam} />
      
        주소줄에 ?no=5&name=NolBu&add=Seoul 형태로 전달. 여기서는 기술하지 않고 Link에서 전달
      <Route path="/args"     component={A06Arguments} />
     
     
      <Route path="/child"     component={A07ChildComponent} />
      
      {/* 맨 마지막에 기술한다. */}
      <Route path="/*"     component={NotFoundComponent} />
      </Switch>

    </div>
  );
}

export default App;