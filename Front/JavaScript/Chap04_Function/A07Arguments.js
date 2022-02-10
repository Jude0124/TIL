
console.log('---------------- Arguments -----------------');

// 함수 내부에서 매개변수를 관리하기 위해 만들어지는 유사 배열이다.
// 자바스크립트는 함수의 매개변수를 체크하지 않는다.
function onAdd1(x, y){
    console.log(arguments);
    console.log(arguments[0]);
    let result = 0;

    for(let i = 0 ; i < arguments.length ; i ++){
        let num = Number(arguments[i]);
        if(isNaN(num)) { // isNaN() => ()의 값이 숫자가 아니면 true
            continue;
        }
        result += arguments[i];
    }
    console.log(`${x} : ${arguments.length} / Total: ${result}s`);
}

onAdd1();
onAdd1('합계',10,20,30,'a',50,60,70,80,90,100);

// ES6
// 첫번째 매개변수 이외는 rest라는 배열로 담겨 넘어온다.
function onAdd2(x, ...rest){
    console.log(arguments);
    console.log(arguments[0]);
    let result = 0;

    for(let i = 0 ; i < rest.length ; i ++){
        let num = Number(rest);
        if(isNaN(num)) { // isNaN() => ()의 값이 숫자가 아니면 true
            continue;
        }
        result += rest[i];
    }
    console.log(`${x} : ${arguments.length} / Total: ${result}s`);
}

onAdd2();
onAdd2('합계',10,20,30,'a',50,60,70,80,90,100);
