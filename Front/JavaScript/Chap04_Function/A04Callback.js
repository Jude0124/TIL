
console.log('---------------- 중첩함수, 콜백함수 -----------------');
/*
함수는 일급객체
    1. 리터럴에 의해 생성 가능
    2. 변수나 배열요소, 객체의 프로퍼티로 할당 가능
    3. 함수의 인자나 리턴 값으로 사용 가능
    4. 동적으로 프로퍼티 생성 가능
*/

// 중첩함수
function outer() {
    var x = 10;

}
outer();
console.log('');


function outer2(x) {
    console.log('outer 함수 호출', x);

}

var inner = outer2(10);




// 함수의 인자나 리턴 값이 될 수 있다.


