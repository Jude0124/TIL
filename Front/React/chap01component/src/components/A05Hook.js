
import React from 'react'

const A05Hook = () => {

    return (
        <div>
            <h3>A05. useState, useEffect</h3>

            <div>
                Num: 
                    <input type="text" name="num" className="form-control" /><br />
                Str: 
                    <input type="text" name="str" className="form-control" /><br />

                Today: <br />
                <br />

                Avg: 
                    <div className="input-group">
                        <input type="text" name="str" className="form-control"/>
                        <button className="btn btn-outline-primary btn-sm">ADD</button>
                    </div>
                    
                    
            </div>
        </div>
    )
}

export default A05Hook
