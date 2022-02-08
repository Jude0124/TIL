
console.log('---------------- Operator -----------------');

var x = 10;
var y = 3;

// 이항 산술 연산자
var result = x + y;
console.log(x + ' + ' + y + ' = ' + result);

result = x - y;
console.log(x + ' - ' + y + ' = ' + result);

result = x * y;
console.log(x + ' * ' + y + ' = ' + result);

result = x / y;
console.log(x + ' / ' + y + ' = ' + result);

result = x % y;
console.log(x + ' % ' + y + ' = ' + result);
console.log('');


// 단항 산술 연산자. ++, --
var z = 10;
z = z + 1 ;
z++;
console.log(z);

++z;
console.log(z);
console.log('');

z = 10 ;
// 대입은 ++ 앞에 있으면 피연산자를(z)를 먼저 증가하고 값을 대입
var result = ++z;
console.log(z, result); //11, 11
console.log('');

z = 10;
//  대입은 ++뒤에 있으면  피 연산자(z)의 값을 먼저 result에 대입하고 z를 1개 증가
result = z++;
console.log(z, result); //11 10
console.log('');

x = 10;
y = 20;
result = ++x + y++;
console.log(x, y , result); //11, 21, 31
console.log('');

//할당 연산자 +=, -=, *=, /=, %=
x = 10;
x = x + 3;
console.log(x);

y = 20;
y += 3; // y = y + 3 ;
console.log('');

// Math

// 0 ~ 0.999999999999999999
console.log(Math.random());

// 무조건 올림
console.log(Math.ceil(10.00000001));
console.log('');


// 무조건 버림
console.log(Math.floor(5.99999999999));
console.log('');

//  숫자 관련 전역 
var random = Math.random() * 5;
console.log(random);
console.log( 'parseInt => ' , parseInt(random));  // 정수 값만 리턴한다.
console.log( 'parseFloat => ' , parseFloat(random));

random  = Math.ceil(Math.random()*5);
console.log('ceil =>', random);

random = Math.floor(Math.random()*5+1);
console.log('floor =>', random);

// 문자열을 숫자로 변환해 준다. 문자가 포함되었으면 문자 전까지만 변환
// 시작이 문자로 시작되면 안됨 => NaN(숫자가 아니다)
var str = "10.25a23333";
console.log( parseInt(str) + parseFloat(str)); //
console.log('');

var str2 = "abc"
console.log(parseInt(str2),typeof(parseInt(str2)));
console.log('');

// Number()는 문자가 포함되어있으면 반환 안됨
console.log(Number(str));
console.log('');

var str3 = '10.25';
console.log(Number(str3));
console.log('');


// 빈 문자열의 경우 parseInt, parseFloat => Nan
// Number => 0으로 치환해준다.
// ex) 사용자에게 Input을 받아야하는경우, Nan으로 받아와서 연산처리를 하면 에러가 떨어짐
//  그럴때 Number를 쓰는 것이 좋다.

str = '';
console.log( parseInt(str), parseFloat(str), Number(str) );
console.log('');


