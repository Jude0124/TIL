
import React from 'react'
import './css/todos.css'

function TodoListItem() {

    return (
        <tr>
            <td></td>
            <td><span></span></td>
            <td>
                <button className="btn btn-primary">Complete</button>
            </td>
            <td>
                <button className="btn btn-danger">Delete</button>
            </td>
        </tr>
    )
}

export default TodoListItem
