
import React from 'react'
import PropTypes from 'prop-types'

function A01FunctionProps(props) {

    const {name, age, arr, user, onPlus, isChecked, num} = props;
    const {children} = props;

     return (
        <div>
            <h3>A01 Function props - 변경 불가</h3>

            <div>
                Name: {props.name} <br />
                Age: {props.age + 100}<br />
                Array: {props.arr[0]} / {props.arr[1]} / {props.arr[10]} <br />
                User: {props.user.name} / {props.user.age} / {props.user.address} <br />
                onPlus: {props.onPlus(10, 20)} <br />
                isChecked: {props.isChecked ? 'TRUE' : 'FALSE'}<br />
                Num: {props.num} <br />
                <div>
                    {props.children}
                </div>
            </div>
            <br />

            <div>
                Name: {name} <br />
                Age: {age + 100}<br />
                Array: {arr[0]} / {arr[1]} / {arr[10]} <br />
                User: {user.name} / {user.age} / {user.address} <br />
                onPlus: {onPlus(10, 20)} <br />
                isChecked: {isChecked && <span>기본 값은 TRUE</span>}<br />
                Num: {num}<br />
                <div>
                    {children}
                </div>
            </div>
        </div>
    )
}

export default A01FunctionProps

A01FunctionProps.defaultProps = {
    num: 100,
}
A01FunctionProps.propTypes = {
    name: PropTypes.string.isRequired,
    age: PropTypes.number,
    user: PropTypes.object,
    ary: PropTypes.array,
    onPlus: PropTypes.func,
    isChecked: PropTypes.bool
}