// A00TDZ.js

console.log(this);
console.log(this == window);

this.A = 10;
window.A1 = 20;
A2 = 30; // var로 선언하지 않으면 global 영역에 정의


// var변수로 선언하면 함수와 Object 이외는 참조하는 this 객체에
// 변수를 정의

// window 영역에 빌드인 함수 alert의 값이 Hello로 변경된다.
// var alert = 'Hello';

//  재 정의 에러 아니다.
var A3 = 40;


{
    var A3 = 'NolBu';
}

//  let, const로 선언된 변수는 global 영역에 만들어지지 않는다.
// console.log(A10);        // hoisting은 발생하지만 먼저 꺼내 사용할 수는 없음
let A10 = 10;

// var 변수로 선언되던 let로 선언되던 중복선언은 안된다.
// let A3 = 100;

{
    let A10 = 20;
    console.log('{} 내부 => ', A10);
}   // 이 }를 만나면 {} 내부에 선언된 let 변수는 모두 삭제된다.(지역변수)

console.log('{} 외부 =>' , A10);
// console.log('{} 외부 => ', A11); //Error

const A20 = 100;

console.log('A20 => ', A20);
// A20 = 200;

const obj = {
    name: 'NolBu'
};

obj.age = 30;
obj.name = '홍길동';

// TDZ에 정의한 변수의 메모리 번지수 값을 변경하려고함. Error
obj = {
    address : 'Seoul'
}
console.log(obj);