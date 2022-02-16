import React, { useCallback, useState } from 'react'

function A09Currency() {
    
    const [data, setData] = useState({
        qty: 3,
        cost: 5,
        inCurr: 'USD'
    });

    const currencies = ['USD', 'EUR', 'CNY'];
    const rate = { USD: 1, EUR: 1.35, CNY: 6.87 };

    const changeData = useCallback( (evt) => {
        setData( {...data, [evt.target.name]: evt.target.value} )
    }, [data]);

    const getTotal = () => {
        return currencies.map( (item) => {
            let total = (data.qty * data.cost * rate[data.inCurr] / rate[item]).toFixed(2);
            return <span key={item}>{item}: {total} &nbsp; </span>
        })
    };

    return (
        <div>
            <h3>A09 Currency</h3>

            Qty: {data.qty}
                <input type="text" name="qty" className="form-control" value={data.qty} onChange={ changeData } />
            Cost: {data.cost}
                <input type="text" name="cost" className="form-control" value={data.cost} onChange={ changeData } />
            Country: {data.inCurr}
                <select className="form-control" name="inCurr" value={data.inCurr} onChange={ changeData }>
                    {currencies.map( (item) => <option key={item}>{item}</option>)}
                </select>
            <br/>

            <div>Total: {data.qty * data.cost}</div>
            <div>Total: {getTotal()}</div>
        </div>
    )
}

export default A09Currency;
