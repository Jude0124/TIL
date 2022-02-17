
import React from 'react'

import './css/A01Style.css'

function A07Style() {

    const clzName = 'title color';
    const style = {
        backgroundColor : 'black',
        fontSize : '24pt',
        fontWeight : 'bold',
        padding : '20px',
        color : 'white'
    }

    return (
        <div>
            <h3 className='title color'>A01 Style</h3>
            <h3 className={clzName}>A01 Style</h3>
            <h3 style = {style}>A01 Style</h3>
            <h3 style ={{
                backgroundColor : 'black',
                fontSize : '24pt',
                fontWeight : 'bold',
                padding : '20px',
                color : 'white'
            }}>A01 Style</h3>
        </div>
    )
}

export default A07Style
