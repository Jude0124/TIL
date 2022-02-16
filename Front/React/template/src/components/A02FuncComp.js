// A02FuncComp.js

function A02FuncComp() {
    const name = 'Function Component';
    const getMin = (x, y) => `${x} - ${y} = ${x - y}`;

    return (
        <div>
            <h3>A02 Function</h3>

            <div>
                Name: {name}<br />
                Func: {getMin(10 , 2)};
            </div>
        </div>
    )
}

export default A02FuncComp;