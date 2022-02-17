import React, { useCallback, useState } from 'react'

function A06Currency() {
    const [data, setDAta] = useState({
        qty : 3,
        cost : 5,
        inCurr : 'USD'
    })

    const currencies = ['USD', 'EUR', 'CNY'];
    const rate = {'USD': 1, 'EUR' : 1.35, 'CNY': 6.87};

    const changeData = useCallback( (evt) => {
        setDAta({...data, [evt.target.name]: Number(evt.target.value)});
    }, []);

    const changeCurr = useCallback( (evt) => {
        setDAta({...data, inCurr: evt.target.value});
    }, []);


    const total = useCallback( ()  => {
        return currencies.map( item => {
            const value = (data.qty * data.cost * rate['USD'] /rate[item]).toFixed(2);
            return <span key= {item}> {item} : {value} </span>
        })
    })
    return (
        <div>
            <h3>A06 Currency</h3>

            Qty: <input type="text" name="qty" className="form-control"
                    value={data.qty} onChange={changeData} />
            Cost: <input type="text" name="cost" className="form-control" 
                    value={data.cost} onChange={changeData} />
            Country: 
                <select className="form-control" name="inCurr"
                    value = {data.inCurr} onChange ={changeCurr}>
                    {currencies.map( item => <option key={item}> {item}  </option>)} 
                </select>
            <br/>

            <div>Total: </div>
            <div>Total: </div>
        </div>
    )
}

export default A06Currency;
