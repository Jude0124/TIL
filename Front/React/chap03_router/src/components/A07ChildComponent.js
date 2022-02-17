
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

            <Route path="/A07Child"    exact       render={ () => (
                <div>
                    <h6>ONE Component</h6>
                    <div>This is one Component</div>    
                </div>
            )} />

            <Route path="/A07Child/two/:id"        render={ ({match}) => (
                <div>
                    <h6>TWO Component</h6>
                    <div>This is two Component</div>
                    <br />

                    <div>
                        Id: {match.params.id}
                    </div>
                </div>
            )} />

            <Route path="/A07Child/three"          render={ () => (
                <div>
                    <h6>THREE Component</h6>
                    <div>This is three Component</div>    
                </div>
            )} />
        </div>
    )
}
export default A05ChildComponent;