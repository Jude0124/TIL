console.log('---------------- Array -----------------');


var ary = [10, 11, 100, 101, 1000, 11, 100];


console.log('---------------- ***Array 추가 삭제 -----------------');

// 배열의 전체 개수
console.log(ary.length);

// 배열 맨 뒤에 값 추가. a는 추가 후 length 값
let a = ary.push(20);

// 배열 맨 앞에 값 추가. b는 추가 후 length 값
let b = ary.unshift(0);
console.log(a, b, ary);

// 배열 맨 뒤에 값 삭제. x는 삭제된 값
x = ary.pop();   

// 배열 맨 뒤에 값 삭제. y는 삭제된 값
y = ary.shift();
console.log(x, y, ary);

console.log('---------------- **splice 중간 값 삭제 -----------------');
// 배열의 중간 값을 수정, 삭제, 추가
x = ary.splice(2, 0, 200);
console.log(x, ary);

// [10, 11, 200, 100, 101, 1000, 11, 100];
x = ary.splice(-1, 1, 222);
console.log(ary);

// 2번째 위치에서 2개를 333로 치환. 2개 222와 100이 대치되는 333으로 변경됨
x = ary.splice(2, 2, 333);
console.log(ary);

// 삭제는 치환값을 안주면 된다.
x = ary.splice(2, 5);
console.log(ary);

// [10, 11, 20, 21, 101, 1000, 11, 100]
// 2번째 위치에서 1개를 30, 31로 치환. 1개는 수정 1개가 추가됨

// 뒤 부분을 삭제하는 것은 이렇게도 가능
ary = [10, 11, 20, 101, 1000, 11, 100];
ary.length = 3
console.log(ary);
console.log('');

// delete로 삭제가능. 값만 삭제하고 length
ary = [10, 11, 100, 101, 1000, 11, 100];
delete ary[3];
console.log(ary);
console.log('');

console.log('---------------- Slice로 짤라내기 -----------------');

ary = [10, 11, 100, 101, 1000, 11, 100];

// 원본 배열은 그대로 유지된다.
x = ary.slice(3);           // 시작번호부터 마지막까지(length)
console.log(x, ary);

x = ary.slice(3, 5);
console.log(x, ary);

x = ary.slice(-3)
console.log(x, ary);

x = ary.slice(-5,-3);
console.log(x, ary);
console.log('');

console.log('---------------- join을 이용하여 연결(문자열이 된다.) -----------------');

ary = [10, 11, 100, 101, 1000, 11, 100];
let str = ary.join('-');
console.log(str, typeof(str));

str = ary.join(', ');
console.log(str, typeof(str));
console.log('');

console.log('---------------- ***concat을 이용하여 새배열 생성 -----------------');

//  react에서 엄청 사용
ary = [10, 11, 100, 101, 1000, 11, 100];
x = ary.concat(200)
x.splice(2, 2, 20,20)
console.log(ary, x);

// 뒤에서부터 찾아라. 카운트는 항상 앞에서 부터 한다 => 5


// 중복 방지
if(ary.indexOf(100) === -1) {
    ary.push(100);
}

// es6
x = ary.includes(11);
console.log(x);

// 중복 방지
if( !ary.includes(100)){
    ary.push(100);
};
console.log('');

console.log('---------------- Sort -----------------');

var names = [ 'NolBu', 'BangJa', 'HungBu' ];
let sorted = names.sort();
console.log(sorted);

ary = [10, 11, 100, 101, 1000, 11, 100];
let sortAry = ary.sort();
console.log(sortAry);

sortAry = ary.sort(function(x, y){
    if(x > y) return 1
    else if(x < y) return -1
    else return 0
})
console.log(sortAry);

sortAry = ary.sort((x, y) => {
    if(x > y) return 1
    else if(x < y) return -1
    else return 0
})
console.log(sortAry);

