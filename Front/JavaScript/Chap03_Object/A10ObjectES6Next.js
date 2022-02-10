
console.log('---------------- Object -----------------');

var x = 10;
var str = 'Hello World';

var obj = {
    x,str
}
console.log(obj);
console.log('');


// 계산된 프로퍼티 이름
var prefix = 'prop'
for(let i = 0 ; i < 3 ; i++) {
    obj[prefix + i + 'value'] = i;
};

console.log(obj);

// 메서드를 info() 형태로 사용 가능 => vue에서 많이 사용

const nolbu = {
    name : 'NolBu',
    age : 30,
    info(){
        console.log(`${this.name}님의 나이는 ${this.age}`);
    }
}
nolbu.info();