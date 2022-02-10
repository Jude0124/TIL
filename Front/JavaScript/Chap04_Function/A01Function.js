
console.log('---------------- 함수 선언문 -----------------');

// 호이스팅
// 변수 => 메모리 확보에 undefined로 초기화
// 함수 => 메모리 확보가 되고 평가식도 같이 초기화 된다.

console.log('Hoisting');
console.log('variable => ',x);
onAdd(100, 200);

var x = 10;
console.log('Hoisting 종료');
console.log('');

// 선언문 방식의 함수 선언
// 일반 함수
/*
function 함수명([매개변수]) {
     실행구문
 }
*/

function onAdd() {
    let x = 10;
    let y = 20;
    console.log(this);

    let result = x + y ;
    console.log(` ${x} + ${y} = ${result}`);
}

// 함수의 호출
onAdd();

//  함수는 {} scope를 갖는다. 함수 내부에 선언된 변수는 지역변수다.
// console.log(x);  // Error 지역변수는 함수가 끝나면 사라지기때문에 밖에서 호출 x

// 매개변수가 있는 함수.



function onMin(x, y) {
    console.log('매개변수가 있는 함수');
    let result = 0;
    if (x > y ) {
        result = x - y;
    }else if (x < y) {
        result = y - x;
    } else {
        result = 0;
    }    
    console.log(` ${x} - ${y} = ${result}`);
}
onMin(10,2);
onMin(2,10);
console.log('');

// 반환값이 있는 함수.

function onMulti(x,y){
    console.log('반환값이 있는 함수');
    if(typeof(x) !== 'number' || typeof(y) !== 'number'){
        return 0
    } else {
        return x * y;
    }
}

const result = onMulti(12,2);
const str = onMulti(10,'2');
console.log(result,str);
console.log('');

// 반환값이 없는 함수. => undefined 확인.

function onDiv(x, y) {
    let result = x/y;
    console.log(` ${x} / ${y} = ${result}`);
    
}
const div = onDiv(10 , 2 )
console.log(div);