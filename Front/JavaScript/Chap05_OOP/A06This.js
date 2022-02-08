
console.log('---------------- Object this -----------------');

const obj = {
    name: 'NolBu', 
    age: 20,
    display() {
        console.log(`${this.name} / ${this.age}`);
    }
};



function Person(name, age) {
    this.name = name;
    this.age = age;
};

Person.prototype.display = function() {
    console.log(`${this.name} / ${this.age}`)
};

