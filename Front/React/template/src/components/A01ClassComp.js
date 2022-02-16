// A01ClassComp.js
import React from 'react';

class A01ClassComp extends React.Component {

    constructor() {
        super();
        this.name = 'HongGilDong';
        this.age = 30;

    }

    // Event 메서드
    btnEvent = () => alert('HelloWorld');

    // View를 구성하는 함수.
    render() {
        return (
            <div>
                <h3>Class Component</h3>

                <div>
                    name : {this.name} <br />
                    Age : {this.age} <br />
                    {/* 자바스크립트 이벤트와 이름은 동일하나 on 다음을 대문자로 변경 
                        이벤트 함수는 보간법 {}을 이용해 호출. ()는 필요에 따라 기술
                        매개변수가 없으면 () 없이 기술.
                    */}

                </div>
            </div>
        )
    }
}

export default A01ClassComp;