
console.log('---------------- prototype chain -----------------');

function Jumsu(name) {
    this.name = name;
}

Jumsu.prototype.onTotal = function() {
    return this.name;
}

const nolbu = new Jumsu('NolBu');
console.log( nolbu.__proto__);
console.log( Object.getPrototypeOf(nolbu));
console.log( nolbu.__proto__ === Jumsu.prototype);

const arr = [10, 11, 100];
console.log( arr.__proto__ );
console.log( arr.__proto__ === Array.prototype);
console.log( arr );
console.log('');

var one = { 
    name: 'One',
    display: function() { console.log(this.name) }
};

var two = {
    name: 'Two'
};

var three = {};

console.log(two);
two.__proto__ = one;        // 부모의 prototype을 one으로 변경

console.log(two);
two.display();
console.log('');

console.log('three');
Object.setPrototypeOf(three, one);
console.dir(three);

three.name = 'Three';
three.display();

function Person(name) {
    this.name = name;
}

Person.prototype.getName = function() {
    return this.name;

};

const heunbu = new Person('흥부')
console.log( heungbu.getName() );
Object.setPrototypeOf(heungbu, obj);

heungbu.display();
heungbu.