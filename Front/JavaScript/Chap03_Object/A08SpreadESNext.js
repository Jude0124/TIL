
console.log('--------------- spread Object ---------------')
const obj = {
    name: 'NolBu',
    age: 30
};

// const name = obj.name;
// const age = obj.age;
// console.log(name, age);

// obj에 정의한 키의 값이 있으면 꺼내서 각각의 같은 이름의 변수에 대입해준다
const {name, age} = obj;
console.log(name, age);


// nickname 할당 가능
const {name: nickname, age: num} = obj;
console.log(nickname, num);


// 기본값을 할당할 수도 있다.
const {name: x = 'Unknown', age: y = 30, address = 'Seoul'} = obj;
console.log(x, y, address);

function getName(args) {
    // console.log(object);
    const {x , y} = args;
    console.log(x, y);
}

getName( {x : '홍', y: '길동'})

console.log('--------------- spread Array ---------------')
const ary = [10, 11, 100];
const aryOne = [20, 21, 200];

// 배열이라 []로 받는다
const [a, b, c] = ary;
console.log(a, b, c);

// Alias는 설정 안됨

// 기본값으로 설정 가능
const [d,e, f =100, g=200] = ary;
console.log(d, e, f, g);

// 객체처럼 복사도 가능하다
const one = [...ary];
console.log(one);

// 합쳐서 복사도 가능하다.
const two = [...ary, ...aryOne];
console.log(two);