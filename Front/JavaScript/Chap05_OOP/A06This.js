
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

const nolbu = new Person('NolBu' , 30);
nolbu.display();

const heungbu = new Person('Heungbu', 30);
heungbu.display();
console.log('');

console.log(this);          //window

function onAdd() {
    console.log(this);
}

onAdd();                    //window

const objA = {
    name: Object,
    onAdd : onAdd
}

console.log(objA.name);
objA.onAdd();
console.log('');

