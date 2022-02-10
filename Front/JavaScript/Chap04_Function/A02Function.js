
console.log('---------------- 함수 표현식 -----------------');

// 변수이므로 undefined가 할당. 함수 형식으로 호출할 수 없음.

console.log(onAdd);
// console.log(onAdd());     // Error
onAdd;

// 함수 표현식. 익명함수를 이용한다. 이름을 붙이면 기명함수라 한다.
// 표현식 방식의 함수 선언(익명함수)
var onAdd = function() {
    let x = 10;
    let y = 20;
    // console.log(this);              //Global 영역에서 호출된다

    let result = x+y;
    console.log(`${x}+ ${y} = ${result}`);
}

onAdd();
console.log('');

let factorial = function(n){
    if ( n  ===  1 ) return 1;
    return n * factorial(n-1);
}
console.log(factorial(10));
console.dir(factorial);


// 표현식 방식의 함수 선언(기명함수)


// 익명함수에 함수 이름을 기술하면 내부에서만 사용 가능하다.
let factorial1 = function fact(n){
    if ( n  ===  1 ) return 1;
    return n * fact(n-1);
}
console.log(factorial1(10));

console.dir(factorial1);



// Function 생성자 함수 이용
// 마지막 하나의 매개변수만 실행 구문
var onMIn = new Function('x', 'y', 'return x - y');
console.log(onMIn(10,2));
