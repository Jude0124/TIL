
import React, { useState } from 'react'

function A02FunctionState() {

    const [name, setName] = useState('NolBu');
    const [age, setAge] = useState(20);
    const [ary, setAry] = useState([10, 20, 30]);
    const [obj, setObj] = useState({
        tel: '010-1234-5678',
        address: 'Seoul',
    });

    const changeName = () => setName('HungBu');
    const changeAge = (num) => setAge(num);

    // const addArray = (value) => setAry(ary.push(value));         // Error
    // const updateAry = (index, value) => setAry(ary[index] = value);     // Error
    const addArray = (value) => setAry(ary.concat(value));
    const updateAry = (index, value) => setAry( ary.map( (item, i) => index === i ? value : item) );
    const deleteAry = (index) => setAry( ary.filter((item, i) => index !== i) );

    const addObject = (key, value) => setObj( {...obj, [key]: value} );
    const updateObject = (key, value) => setObj( {...obj, [key]: value} );
    // const deleteObject = (key) => setObj( {...obj, [key]: ''} );
    const deleteObject = (key) => {
        delete obj[key];
        setObj( {...obj} );
    }


    return (
        <div>
            <h3>A02 Function State - 변경 가능</h3>

            <div>
                Name: {name} <br/>
                Age: {age + 100}<br />
                Array: {ary[0]} / {ary[1]} / {ary[10]}<br />
                {
                    ary.map( (item, index) => <span key={index}>{item} </span>)
                }
                <br />

                Object: {obj.tel} / {obj.address} / {obj.num} <br />
            </div>

            <div>
                <button onClick={changeName}>Name</button>
                <button onClick={ (evt) => changeAge(100) }>Age</button>

                <button onClick={ () => addArray(Math.ceil(Math.random() * 100)) }>Add Array</button>
                <button onClick={ () => updateAry(0, 100) }>Update Array</button>
                <button onClick={ () => deleteAry(1) }>Delete Array</button>

                <button onClick={ () => addObject('num', 200) }>Add Object</button>
                <button onClick={ () => updateObject('num', 300) }>Update Object</button>
                <button onClick={ () => deleteObject('num') }>Delete Object</button>
            </div>
        </div>
    )
}

export default A02FunctionState
