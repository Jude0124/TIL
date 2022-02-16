
import React from 'react'

function A03FuncEvent() {

    return (
        <div>
            <h3>A03 Function Component Event & Form</h3>

            <form>
                Name: 
                    <input type="text" name="name" className="form-control" />
                Age: 
                    <input type="text" name="age" className="form-control" />
                Date: 
                    <input type="date" name="date" className="form-control" />

                RadioButton: <br />
                    <div className="form-check">
                        <input type="radio" name="sports" value="baseball" id="baseball" className="form-check-input" />
                        <label htmlFor="baseball" className="form-check-label">야구</label>
                    </div>
                    <div className="form-check">
                        <input type="radio" name="sports" value="soccer" id="soccer" className="form-check-input" />
                        <label htmlFor="soccer" className="form-check-label">축구</label>
                    </div>
                    <div className="form-check">
                        <input type="radio" name="sports" value="basketball" id="basketball" className="form-check-input" />
                        <label htmlFor="basketball" className="form-check-label">농구</label>
                    </div>

                CheckBox One: <br />
                    <div className="form-check">
                        <input type="checkbox" id="check" className="form-check-input" />
                        <label htmlFor="check" className="form-check-label">동의</label>
                    </div>

                CheckBox: <br />
                    <div className="form-check">
                        <input type="checkbox" name="language" value="Angular" id="angular" className="form-check-input" />
                        <label htmlFor="baseball" className="form-check-label">야구</label>
                    </div>
                    <div className="form-check">
                        <input type="checkbox" name="language" value="React" id="react" className="form-check-input" />
                        <label htmlFor="react" className="form-check-label">축구</label>
                    </div>
                    <div className="form-check">
                        <input type="checkbox" name="language" value="Vue" id="vue" className="form-check-input" />
                        <label htmlFor="vue" className="form-check-label">농구</label>
                    </div>

                SelectBox: <br/>
                    <select name="baseball" className="form-control"  >
                        <option>NC</option>
                        <option>두산</option>
                        <option>엘지</option>
                    </select>
                
                SelectBox Multi: <br />
                    <select name="four" multiple size="3" className="form-control" >
                        <option>NC</option>
                        <option>두산</option>
                        <option>엘지</option>
                    </select>
                    <br />

                <button type="submit">SEND</button>
            </form>
        </div>
    )
}

export default A03FuncEvent
