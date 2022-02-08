
console.log('---------------- Scope -----------------');

var x = 'Global';

function out(){
    var x = 'Local';
    console.log('Function IN: ', x);
}

console.log('Function OUT: ', x);


// 197 Page
var x = 'Global X';
var y = 'Global Y';

function outer() {
    var z = 'Outer Local z';

};

outer();
console.log('');



function foo() {
    var x = 10;
    bar();
};

function bar() {
    console.log(x);
};

bar();