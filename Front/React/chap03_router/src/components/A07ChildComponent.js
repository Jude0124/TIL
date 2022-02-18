
import React from 'react';
import { Route, Link } from 'react-router-dom';

const A05ChildComponent = () => {

    return (
        <div>
            <h5>Children Component</h5>
            <div>This is Children Component</div>
            <br />
            
            <div>
                <Link to="/A07Child">ONE</Link> | &nbsp; 
                <Link to="/A07Child/two/100"> TWO</Link> |  &nbsp;
                <Link to="/A07Child/three"> THREE</Link>
            </div>
            
            <hr />

            {/* 상위 패스의 하위 패스 형태가 된다.
                상위가 /child의 경우  자식 route에서 path를 동일이름으로 기술하면 기본 값으로 출력 */}
            <Route path="/child"    exact       render={ () => (
                <div>
                    <h6>ONE Component</h6>
                    <div>This is one Component</div>    
                </div>
            )} />

            {/* 상위 path가 /child 이므로 항상 /child/하위패스명 형태로 기술해야 한다. */}
            <Route path="/child/two/:id"        render={ ({match}) => (
                <div>
                    <h6>TWO Component</h6>
                    <div>This is two Component</div>
                    <br />

                    <div>
                        Id: {match.params.id}
                    </div>
                </div>
            )} />

            <Route path="/child/three"          render={ () => (
                <div>
                    <h6>THREE Component</h6>
                    <div>This is three Component</div>    
                </div>
            )} />
        </div>
    )
}
export default A05ChildComponent;