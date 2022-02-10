
console.log('---------------- property shadowing -----------------');

function Person(name, age) {
    this.name = name;
    this.age = age;
};

Person.prototype.display = function() {
    console.log(`${this.name} / ${this.age}`);
};

var nolbu = new Person('NolBu', 30);
nolbu.display();

console.log(nolbu);


nolbu.display = function() {
    console.log(`My name is ${this.name}`);
}

console.log(nolbu);

nolbu.display();