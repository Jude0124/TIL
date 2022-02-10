
console.log('---------------- Instanceof -----------------');

function Person(name, age) {
    this.name = name;
    this.age = age;
};

Person.prototype.display = function() {
    console.log(`${this.name} / ${this.age}`);
};

var nolbu = new Person('NolBu', 30);
nolbu.display();

console.log(nolbu instanceof Person);
console.log(nolbu instanceof Object);

const today = new Date();
console.log(today instanceof Person);
console.log(today instanceof Date);
console.log(today instanceof Object);
console.log('');

console.log( nolbu.constructor);
console.log( today.constructor);
console.log('');

//in
console.log('name' in nolbu);
console.log('address'in nolbu);