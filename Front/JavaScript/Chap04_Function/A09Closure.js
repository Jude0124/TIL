
console.log('---------------- Closure -----------------');

let num = 0;

const incOne = function() {
    return num++;
};

console.log(incOne());
console.log(incOne());
console.log(incOne());
console.log(incOne());
console.log(incOne());

// 외부에서 이렇게 수정할 수 없게 만들려면?
num = 100;
console.log(incOne());
console.log(incOne());

function incTwo(){
    let cnt = 0;        // 호출할때마다 0으로 초기화된다.
    return cnt++;
}

// cnt = 100;               //var 선언이 없으면 Global영역에 변수를 만든다.
// console.log(cnt);        // Error

console.log(incTwo());
console.log(incTwo());
console.log(incTwo());
console.log('');

// closure
function incThree() {
    let cnt = 0;
    
    function inner(){
        return ++cnt;
    } 
    return inner;
}

const three = incThree();

console.log(three());
console.log(three());
console.log(three());
console.log(three());
console.log('');

const three1 = incThree();
console.log(three1());

var alert = 10;
