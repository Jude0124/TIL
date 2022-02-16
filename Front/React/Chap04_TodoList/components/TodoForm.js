
import React from 'react'

function TodoForm() {

    return (
        <form>
            <div className="input-group">
                <input type="text" className="form-control" />
                <div className="input-group-append">
                    <button type="submit" className="btn btn-primary mr-1">Submit</button>
                </div>
            </div>  
        </form>
    )

}
export default TodoForm