
import React, { useState } from 'react'

const A05Hook = () => {
  
    const [data, setData] = useState({
        num : 0,
        str : ''
    });
    
    const changeData = (evt) => setData({...data, [evt.target.name]: evt.target.num})

    const [today, setToday] = useState(new Date());

    setTimeout ( () => {
        setToday(new Date());

    }, 3000);


    return (
        <div>
            <h3>A05. useState, useEffect</h3>

            <div>
                Num: {data.num}
                    <input type="text" name="num" className="form-control" 
                        defaultValue ={data.num} onChange={changeData} /><br />

                Str: {data.str}
                    <input type="text" name="str" className="form-control" 
                        defaultValue={data.str} onchange={changeData}/><br />

                Today: {today.toLocaleTimeString}<br />
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
