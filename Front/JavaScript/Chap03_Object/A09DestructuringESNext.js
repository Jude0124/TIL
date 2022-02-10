
console.log('---------------- Spread Operator -----------------');
/*
    ES6 비 구조화 할당(DeStructuring)
    배열, 객체, 반복 가능한 객체에서 값을 꺼내 그 값을 별도의 변수에 대입하는 구문.
*/

var ary = [10, 11, 100, 101, 1000, 1001];
const [a, b, c ] = ary;
console.log(a,b,c);

// const abc = ary[5];

// 앞의 2개는 빼고 가져오자
const [ , ,d,e,f] = ary;
console.log(d,e,f);

// 중간꺼 빼고 가져오기
const [g, h, , i] = ary;
console.log(g,h,i);
console.log('');

// 남는 값은 모두 배열로 받아 가져오기 
const [j, k, l, ...rest] =ary;
console.log(j,k,l, rest);

//값 치환
let x = 10 ;
let y = 20;
[y, x] = [x, y];
console.log(x,y);
console.log('');


var objArray = [
    {id: 1, name: 'NolBu', age: 35}, 
    {id: 2, name: 'BangJa', age: 18}, 
    {id: 3, name: 'HungBu', age: 25}
];


let z;
[x, y, z] = objArray;
console.log(x);    //{id : 1 , name : 'NolBu', age :35}
console.log(y);
console.log(z);

var obj = {
    name: 'NolBu',
    age: 30,
    address: 'Seoul',
    getName: function(){
        return this.name
    }
}

let {name, age, address, getName} = obj;
console.log(name, age, address);

// getName이라는 변수는 함수값이 할당되어있다.
// 함수는 this가 선언되는 곳에 의해 동적으로 변경된다.
// let getName = function() { return this.name}


// var name = 'window';
window.age = 100;
console.log(getName());  //출력안됨

