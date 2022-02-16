import React from 'react'

function A09Currency() {

    return (
        <div>
            <h3>A09 Currency</h3>

            Qty: <input type="text" name="qty" className="form-control"/>
            Cost: <input type="text" name="cost" className="form-control" />
            Country: 
                <select className="form-control" name="inCurr">
                    
                </select>
            <br/>

            <div>Total: </div>
            <div>Total: </div>
        </div>
    )
}

export default A09Currency;
