
console.log('---------------- Closure -----------------');
// Immediately Invoked Function Expression


// 괄호는 먼저 실행하라는 것을 의미한다. 
// 먼저함수를 실행하여라(익명 함수)
(function(){
    console.log('즉시 실행함수 1');
}());

(function(){
    console.log('즉시 실행함수 2');
})();

let x = 10;
(function(num){
    console.log('즉시 실행함수 3 => ' + num);
})(x);

const result = (function(){
    var x = 10 ;
    var y = 20 ;
    var result = 0;
    var alert = '값이 올바르지 않습니다.'

    return x;
})();

// console.log(window);
console.log(result);

const calc = (function(){
    var x = 10 ;
    var y = 20 ;
    var result = 0;
    var alert = '값이 올바르지 않습니다.'

    let onAdd = function(){
        result = x + y ;
        return result;

    }
    let onMin = function(){
        return x - y;
    }
    
    let getResult = function() {
        return result;
    }

    return {
        result,
        alert,
        onPlus : onAdd ,
        onMin,
        getResult
    }
})();

console.log(calc);
console.log(calc.onPlus());
console.log(calc.onMin());
console.log(calc.alert);
// onPlus()를 호출했다고 하더라도 즉시 실행 함수가 실행된 상태에 리턴된 값을
// 이미 0인 상태에서 result 값이 리턴됨. ()
console.log(calc.result);
console.log(calc.getResult());
console.log('');



console.log('*다른 방식의 구현 방법*'); // 이 방법으로도 구현한다.
(function(){
    var x = 10 ;
    var y = 20 ;
    var result = 0;
    var alert = '값이 올바르지 않습니다.'

    let onAdd = function(){
        result = x + y ;
        return result;

    }
    let onMin = function(){
        return x - y;
    }
    
    let getResult = function() {
        return result;
    }

    let obj = {
        result,             //0
        alert,
        onPlus : onAdd ,
        onMin,
        getResult
    }

    console.log(this);  // window
    window.myLib = obj; // window 영역에 myLib 변수 선언하고 obj 값 대입
})();

console.log ( myLib );
console.log( myLib.onPlus() );
console.log( myLib.onMin() );
console.log( myLib.alert );
console.log( myLib.result );
console.log( myLib.getResult() );

