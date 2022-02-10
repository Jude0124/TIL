
console.log('---------------- Primary Type And Reference Type-----------------');

var numA = 100;
var numB = numA;

// 비교
console.log(numA == numB, numA === numB);

numA = 200;
console.log(numA == numB, numA === numB);
console.log('');


var objA = {
    name: 'NolBu',
    age: 30,
};

var objB = objA;
console.log(objA == objB, objA === objB);

objA.name = 'HungBu';
console.log(objA == objB, objA === objB);
console.log('');


// 값이 같은 새로운 객체 
var objC = {
    name: 'HungBu',
    age: 30,
};

console.log(objA === objC);
console.log('');


function func(x, y) {
    x =  1;
    y.name = 'ABC';
};

let x = 100;
let y = { name : 'Y' , num : 200};


console.log('----- 함수 호출 이전 -----');

console.log(x, y);
func(x, y)


console.log('----- 함수 호출 이후 -----');

console.log(x,y);