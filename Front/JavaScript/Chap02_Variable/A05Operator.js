
console.log('---------------- Logical Operator -----------------');

var x = 10;
var y = 5;
var z = 5;
var result;

result = (x > y) && (x > z);
console.log('(x > y) && (x > z) => ' + result);
console.log('');

// 연산자로 사용.
var age;

// &&는 앞에 조건이 false면 뒤를 체크하지 않음
// ||는 앞의 조건이 true면 뒤를 체크하지 않음
result = (x<y ) && (y< z++);
console.log(result, z);
console.log('');


console.log('0을 제외한 모든 숫자는 true로 반환된다.');
console.log("'2' == true => ", '2' == true );
console.log('');

var flag = 10;
 
if(flag) {
    console.log('True');
} else {
    console.log('False');
}

console.log('');

if(typeof(10)) {
    console.log('True');
} else {
    console.log('False');
}

console.log('');
// &&, ||를 연산자로 사용

// 앞의 값(age 의 값)이 있으면 age의 값을 result에 대입
// 없으면 뒤가 평가되서 10이라는 값을 result에 대입

var result = age || 10;
console.log(result + 100);
console.log('');

// 앞의 값(age의 값)이 있으면 뒤가 평가되서 10이 result에 대입
// 없으면 age 값이 result에 대입
var result = age && 10;
console.log(result);
console.log('');

age = 1

// 값이 존재하기 때문에 뒤의 값을 대입
var result  = age && '<div>Hello World</div>';
console.log(result);
console.log('');

// ** => ES7 (ECMA 2016)
var two = 2;
result = two ** 3;  //2 * 2 * 2
console.log(result);
console.log('');

// boolean 값으로 변환
console.log( !!0 );
console.log( !!10);
console.log( !!'');
console.log( !!'');
console.log();
console.log();
console.log();
