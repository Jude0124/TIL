
console.log('---------------- Change Prototype -----------------');

function Person(name, age) {
    this.name = name;
    this.age = age;
};

Person.prototype.display = function() {
    console.log(`${this.name} / ${this.age}`);
};

var nolbu = new Person('NolBu', 30);
nolbu.display();

