
import React, { useCallback, useEffect, useRef, useState } from 'react'

const A05Hook = () => {
  
    const [data, setData] = useState({
        num : 0,
        str : '',
        name : ''
    });
    const [today, setToday] = useState(new Date());
    
    // 값이 유지되는 변수를 정의 할 목적으로 사용한다. 화명 갱신 작업은 이루어 지지 않는다.
    const cnt = useRef(1);
    
    // DOM 객체를 참조할 목적으로도 사용한다.
    const inputElem = useRef();

    // setTimeout ( () => {
    //     setToday(new Date());

    // }, 3000);

    useEffect(() => {
        setTimeout(() => {
            setToday(new Date());
        }, 3000);
    }, [data]);

    useEffect(()=> {
        console.log(inputElem.current);             //JavaScript 객체
        inputElem.current.style.border = '1px solid orange';
    }, []);

    // 함수
    const changeData = useCallback(
        (evt) => setData( {...data, [evt.target.name] : evt.target.value})
   , [] );

    const increase = useCallback( () => {
        cnt.current++;
        console.log(cnt);
    }, []);

    const decrease = useCallback( () => {
        cnt.current--;
        console.log(cnt);
    }, []);

    const changeName = useCallback(() =>
        setData( {...data, name: inputElem.current.value})
    )

   return (
        <div>
            <h3>A05. useState, useEffect</h3>

            <div>
                Num: {data.num}
                    <input type="text" name="num" className="form-control" 
                        defaultValue ={data.num} onChange={changeData} /><br />

                Str: {data.str}
                    <input type="text" name="str" className="form-control" 
                        defaultValue={data.str} onChange={changeData}/><br />

                Today: {today.toLocaleTimeString()}<br />
                <br />
                
                Cnt : {cnt.current} <br />
                <button className='btn btn-outline-primary btn-sm' onClick={increase}>+</button>
                <button className='btn btn-outline-primary btn-sm' onClick={decrease}>-</button>
                <br />

                Avg: {data.name}
                    <div className="input-group">
                        <input type="text" name="str" className="form-control" ref={inputElem}/>
                        <button className="btn btn-outline-primary btn-sm" onClick={changeName}>ADD</button>
                    </div>
                    
                    
            </div>
        </div>
    )
}

export default A05Hook
