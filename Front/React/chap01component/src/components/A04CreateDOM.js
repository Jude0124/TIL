
import React, { useState } from 'react'

// useRef()으로 변경
let cnt = 4;

function A04CreateDOM() {
    const baseArray = ['NC', '두산', '엘지', 'KT', '키움'];

    const [baseObject, setBaseObject] = useState([
        {id: 1, team: 'NC', value: 'NC'},
        {id: 2, team: '두산', value: 'Doosan'},
        {id: 3, team: '엘지', value: 'LG'},
    ]);

    const [data, setData] = useState({
        teamOne: '',
        teamTwo: '',
        isChecked: false,
    });

    const changeTeam = (evt) => setData({...data, [evt.target.name] : evt.target.value })
    const addArray = () => baseArray.push('한화');
    const showHide = () => setData( {...data, isChecked : !data.isChecked})
    const addTeam = () => {
        const data = {id: cnt++, team: '한화', value : 'Hanwha'};
        setBaseObject( baseObject.concat( data));
    }
    return (
        <div>
            <h3>A04 Make DOM</h3>
            
            SelectBox: {data.teamOne}<br/>
            <select name="teamOne" className="form-control" onChange = {changeTeam}>
                <option>선택해주세요</option>
                {/* {} 구문은 for, while, if  등의 제어문 구문은 기술 안됨 
                    map, filter는 가능. 이건 함수다
                    map( (item, index) => {} ) 
                */}
                { baseArray.map((item, index) => <option key={index}>{item}</option>)}
            </select>

            SelectBox: {data.teamTwo}<br/>
            <select name = "teamTwo" className = "form-control">
                <option value = "">선택해 주세요</option>
                { baseObject.map( item => {
                    return <option value={item.value} key ={item.id}>{item.team}</option>
                })}
            </select>

            <table className="table">
                <thead>
                    <tr>
                        <th>NO</th><th>Team</th><th>Value</th>
                    </tr>
                </thead>
                <tbody>
                    { baseObject.map((item) => {
                        return ( 
                            <tr key = {item.id}>
                            <td>{item.id}</td>
                            <td>{item.team}</td>
                            <td>{item.value}</td>
                        </tr>
                        )
                    })}
                </tbody>
            </table>
            {/* ||, && 연산자로도 사용한다. */}
            { data.isChecked &&   
                <div className="input-group">
                    <input type="text" className="form-control" />
                    <button className="btn btn-outline-primary btn-sm" onClick={addArray}>ADD</button>
                </div>
            
            }  
        <br />
            <button className="btn btn-outline-primary btn-sm" onClick={addTeam} >ADD TEAM</button>
            <button className="btn btn-outline-primary btn-sm"onClick={showHide}>{data.isChecked ? 'HIDE' : 'SHOW'}</button>
        </div>
    )
}

export default A04CreateDOM
