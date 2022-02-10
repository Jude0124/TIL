
console.log('---------------- Array 반복 메서드 -----------------');

var ary = [10, 11, 100, 101, 1000];

console.log('---------------- Array for -----------------');
for(let i = 0 ; i < ary.length ; i ++){
    console.log(ary[i]);
};
console.log('');

console.log('---------------- Array forEach -----------------');
ary = [10, 11, 100, 101, 1000];
ary.forEach(function(item,index){
    console.log(item, index);
})
console.log('');

console.log('한줄로 기술할때 => 뒤의 구문이 값이 아니면 실행. 값인 경우만 return을 해준다.');
// 리턴값은 없이 순환만 해준다.
let y = ary.forEach((item,index) => { console.log(item, index);})
console.log(y);
console.log('');



console.log('---------------- Array map -----------------');
console.log('배열의 값을 forEach와 같이 순차적으로 1개씩 순서대로 꺼내 콜백함수에 대입해준다.');
// 리턴구문이 있으면 리턴값을 하나의 배열로 모아서 반환한다.
ary = [10, 11, 100,101, 1000];

let x = ary.map(function(item,index){
    console.log(item, index);
    return item * 2;
})
console.log(x);

// react에서 많이 사용되는 구문
// arrow 함수의 주의점 중 하나

// ary.map( (item, index) => ( { i : index, value: item * 2})); // 아래와 동일

x = ary.map( (item, index) => {
    return { i : index, value: item * 2}
});
console.log(x);
console.log('');

console.log('---------------- Array filter -----------------');
// 걸러내는 작업을 한다. '
// 따라서 조건문이 필요하고, 조건이 True인 요소만 모아서 배열로 만들어 리턴한다.
ary = [10, 11, 100, 101, 1000];
x = ary.filter(function(item, index){
    if (item % 2 == 0) return true;    // true인 순환요소의 값이 필터에 추가된다.
    else return false
})

console.log(x);

x = ary.filter((item) =>{
    if (item % 2 == 0) return true;    // true인 순환요소의 값이 필터에 추가된다.
    else return false;
})

console.log(x);


var names = ['NolBu', 'HungBu', 'BangJa', 'HongGilDong', 'HungBu', 'BangJa',]
x = ary.reduce( (obj, item) =>{
    if( !obj[item]) obj[item] = 1;
    else obj[item] = obj[item] +1;
    
    return obj;
})




