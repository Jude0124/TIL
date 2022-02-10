
console.log('---------------- defineProperty -----------------');

function printObject(data) {
    for (const prop in data) {
        console.log(prop, data[prop]);
    }
};

var obj = {
    name: 'NolBu',
    age: 30
};

printObject(obj);
console.log('');

// 프로퍼티 추가
obj.address = 'Seoul'


// // Getter, Setter도 정의 가능
//  Object.defineProperties(obj, 'nickname', {
//      enumerable : false,
//      configurable : false,
//      get() {
//          return this.name
//      },
//      set(name){
//          this.name = name;
//      }
//  });
console.log(obj);
console.log('');


// 여러개를 한번에 정의
const person = {};
Object.defineProperties(person, {
    name : {value : 'HungBu'},
    age : {value : 20 , writable : true, enumerable : true, configurable : false},
    info : {
        enumerable: false,
        configurable : false,
        get() {
            return `${this.name} / ${this.age}`
        },
        set(obj){
            this.name  = obj.name;
            this.age = obj.age
        }
    }
});
console.log(person);

printObject(person);