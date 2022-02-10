
console.log('---------------- Object Clone, Spread Operator -----------------');

var objA = {
    name: 'NolBu',
    age: 30
};

var objB = {
    address: 'Seoul',
    age: 100
}

// shallow Clone
// prototype 상속(복사)
const one = Object.create(objA);
one.name = '흥부';

// [[Prototype]]을 확인
console.log(one);
console.log(one.name, one.age);
console.log('');


// 복사 CLONE
const two = Object.assign({},objA)
console.log(two);
console.log(two == objA);
console.log('');

// 동일한 속성이 있으면 복사되는 객체의 값으로 덮어쓴다.
// objA 자체가 변경된다.
// assign(복사대상 또는 변경대상이 되는 객체, 값을 가져와 앞에 추가할 객체)

const three = Object.assign(objA,objB);
console.log(three);
console.log(objA);
console.log('');


// ECMA2015(ES6) Spread Operator
var objC = {
    name: 'NolBu',
    age: 30
};

var objD = {
    address: 'Seoul',
    age: 100
}

const four = {...objC};
console.log(four, objC);

const five = {id : 1 , ...objC , blood : "B"}
console.log(five);


const six = {...objC, ...objD}
console.log(six);
console.log('');

var objE = {
    name: 'NolBu',
    age: 30,
    info: {
        tel: '010-1234-5678', 
        address: 'Seoul'
    }
};

const seven = {...objE};

seven.name = '방자';
seven.info.tel = '000-0000-0000';
console.log(objE);
console.log(seven);

const deep = {
    ...objE,
    info : {
        ...objE.info
    }
}

deep.name = '향단';
deep.info.tel  = '111-2356-7895'
console.log(objE);
console.log(deep);