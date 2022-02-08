
console.log('---------------- Internal Slot, Method -----------------');

var obj = {
    // 데이터 프로퍼티
    firstName: 'Hong', 
    lastName: 'GilDone',
    age: 30,
    display: function() {
        console.log(`${this.firstName} / ${this.lastName}`)
    },

    // 접근자 프로퍼티 => 정의는 함수 형태로 하고 사용은 프로퍼티 형태로 한다.
    
};

console.dir(obj);
