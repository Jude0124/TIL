
console.log('---------------- Scope -----------------');

var x = 'Global';

function out(){
    var x = 'Local';
    console.log('Function IN: ', x);           // Local
}
out();

console.log('Function OUT: ', x);              // Global


// 함수가 만들어지는 순서
//  1. arguments 객체 생성
//  2. scope chain을 생성한다.
//  3. 내부 변수 선언
//  4. this 바인딩
//  5. 실행
var x = 'Global X';
var y = 'Global Y';

function outer() {
    var z = 'Outer Local z';

    console.log('outer x', x);
    console.log('outer y', y);
    console.log('outer z', z);

    function inner() {
        var z = 'Inner Local z';
        
        console.log('outer x', x);
        console.log('outer y', y);
        console.log('outer z', z);

    }
    inner();
};

outer();
console.log('');

var x = 'Global X';

function foo(){
    var x = 10;
    console.log('bar() 실행');
    
    // 위에 함수 만들어질때 순서를 참조해보면 
    // 2번 scope chain이 만들어지면서 scope가 결정된다.
    
    bar();  // console.log(x);
    
    // function bar(){
    //     console.log(x);
    // };
    // bar();
}

function bar(){
    console.log(x);
}

// bar();
foo();
