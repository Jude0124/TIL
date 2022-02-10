
console.log('---------------- Array Callback -----------------');

// ES6
let ary = new Array(10);       // empty * 10
ary.fill(0, 0);
console.log(ary);

ary.fill('A', 2, 7);
console.log(ary);

// includes 
ary = [10, 11, 100, 101, 1000];
console.log(ary.includes(100));
console.log(ary.includes(123));
console.log('');


console.log('---------------- Array find, findIndex -----------------');
// JavaScript에서 가장 많이 사용되는 형태
// Java라면 ArrayList에 VO 객체가 대입되어 있는 상태
var objArray = [
    {id: 1, name: 'NolBu', age: 35},  //0
    {id: 2, name: 'BangJa', age: 18}, //1
    {id: 3, name: 'HungBu', age: 25},  //2
    {id: 4, name: 'ABC', age : 18},
];



function findItem(index) {
    return objArray[index];
};

let x  = findItem(3);  //배열에서는 3번째 인덱스가 존재하지 않음
console.log(x);

console.log('findIndex');
// id와 매칭되는 인덱스 번호를 가져오자
x = objArray.findIndex((item, index) => item.id === 3)
console.log(x);
console.log(objArray[x]);

// item 객체자체를 통채로 리턴
x = objArray.find((item, index) => item.id ===2)
console.log(x);
console.log('');
