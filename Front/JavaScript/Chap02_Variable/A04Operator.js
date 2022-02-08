
console.log('---------------- Comparison Operator -----------------');

var x = 10;
var y = 3;

var result = x > y;
console.log('x > y => ' + result);

result = x >= y;
console.log('x > y => ' + result);
console.log('');


// 동등 비교
result = x == y;
console.log('x > y => ' + result);

result = x != y;
console.log('x > y => ' + result);
console.log('')

// 일치 비교
// == 값을 자바스크립트 엔진이 형 변환을 해보고 값이 같으면 true로 표시

// 1 == "1";
// "1" => Number("1") 후 비교
var x = true;
var y = 1;

result = x == y;
console.log('true == 1 => ' + result);

console.log('null == undefined = >' ,null == undefined);
console.log('1 == "1" = >' ,1 == "1");
console.log('"0xff" == 255 = >' , "0xff" == 255);
console.log('true == 1 = >' , true == 1);
console.log('true == "1" = >' , true == "1");
console.log('(new String("a")) == "a" = >' , (new String("a")) == "a" );
console.log(' [2] == 2 = >' , [2] == 2 );
console.log('');
// 엄격한 비교
// === 짜리는 형 변환을 하지 않음 (타입까지 체크)
// 1 == 1 and 'boolean' == 'string'
result = x === y;
console.log('엄격한 비교');
console.log('true === 1 => ' + result);
console.log('');

console.log("NaN 은 x !==x 를 만족하는 유일한 값이다.");
console.log('NaN === NaN => ',NaN === NaN);


// 3항 연산자
var name = 'NolBu';
result = (name === 'NolBu') ? '놀부' : '누군지 모름'; 

console.log(result);


