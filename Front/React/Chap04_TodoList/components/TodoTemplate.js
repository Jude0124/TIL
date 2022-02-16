
import React from 'react'

const makeTodo = () => {
    const todos = [];
    for(let i = 1; i <= 5000; i++) {
        todos.push( {id: i, text: `${i}번째 할 일`, done: false} );
    }
    return todos;
}

const TodoTemplate = () => {

    return (
        <div>
            <h3>Todo List</h3>

        </div>
    )
}
export default TodoTemplate;