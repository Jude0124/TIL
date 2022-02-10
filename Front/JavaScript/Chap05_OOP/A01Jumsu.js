
console.log('---------------- OOP -----------------');

var person = 'NolBu';
var kor = 100;
var eng = 80;
var onTotal = function() {
    return kor + eng;
};
var onAvg = function() {
    return onTotal() / 2;
}
var display = function() {
    console.log(`${person} / ${onTotal()} / ${onAvg()}`);
}
display();;

const heungbu =  {
    name : 'Heungbu',
    kor : 100,
    eng : 80,
    onTotal : function(){
        return this.kor + this.eng;
    },
    onAvg : function(){
        return this.onTotal() / 2;
    },
    display : function() {
        console.log(`${this.name} / ${this.onTotal()} / ${this.onAvg()} `);
    }
}
heungbu.display();



// Class. 함수의 이름을 대문자로 기술(관례)
function Jumsu(name, kor, eng){     //생성자 메서드 
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    
    this.onTotal = function(){
        return this.kor + this.eng;
    },
    this.onAvg = function(){
        return this.onTotal() / 2;
    },
    this.display = function() {
        console.log(`${this.name} / ${this.onTotal()} / ${this.onAvg()} `);
    }
};


const bangja = new Jumsu('방자', 80, 90);
const hyangdan = new Jumsu('향단', 90, 90);
console.log(bangja);
console.log(hyangdan);

bangja.display();
hyangdan.display();
console.log('');

// Class. 함수의 이름을 대문자로 기술(관례)
function JumsuProp(name, kor, eng){     //생성자 메서드 
    this.name = name;
    this.kor = kor;
    this.eng = eng;
};

JumsuProp.prototype.onTotal = function(){
    return this.kor + this.eng;
};

JumsuProp.prototype.onAvg = function(){
    return this.onTotal() / 2;
};
JumsuProp.prototype.display = function() {
    console.log(`${this.name} / ${this.onTotal()} / ${this.onAvg()} `);
};

const bangja2 = new JumsuProp('방자', 80, 90);
const hyangdan2 = new JumsuProp('향단', 90, 90);
console.log(bangja2);
console.log(hyangdan2);

bangja2.display();
hyangdan2.display();
console.log('');

Object.prototype.toText = function(){
    console.log('Hello World');
};


String.prototype.toTrim = function() {
    console.log('String toTrim');
}

let obj = { };
obj.toText();
// obj.toTrim
let arr = [];
arr.toText();

let str = 'ABC';
str.toText();
str.toTrim();