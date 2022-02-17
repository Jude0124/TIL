
import React from 'react'

// Module 방식이라 imp로 가져온다.
import one from './css/A02Style1.module.css';
import two from './css/A02Style2.module.css';
function A08StyleModule() {
    return (
        <div>
            <h3 className = {one.title}>A02 Style <span>Module</span> Component</h3>
            <h3 className = {`${two.title} ${two.reverse}`}>A02 Style Module Component</h3>
            <h3 className = {[two.title, two.reverse].join(' ')}>A02 Style Module Component</h3>
        </div>
    )
}

export default A08StyleModule;
