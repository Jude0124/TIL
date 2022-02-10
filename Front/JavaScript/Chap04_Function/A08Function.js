
console.log('---------------- Closure -----------------');

var count = 100;

var myObj2 = {
	count : 0,

	visit: function(){ 
        ++this.count;
        console.log('visit: ', this.count);

        //  여기까지는 this가 myObj2인 상태. 여기서 that은 myObj2 이다.
        //  this가 아닌 변수로 선언했으므로 scope chain을 따른다.
        let that = this;

        function inner(x) {
            this.count = that.count + x;
            // let count = 100; 이라면  NaN로 표시. window 영역에 count 변수가 없음
            console.log('visit Inner: ', that.count);
        }
        inner(2);
	}
};

myObj2.visit();
console.log('');







var x = 10;

function one() {
    var x = 'one';
}

function two() {
    console.log(x);
};

function three() {
    let x = 'Three X';
    // let y = 'Three Y';

    function inner(){
        return x;
    };

    return inner;
}

const threeIn = three();
// console.log(threeIn);

const threeX = threeIn();
console.log(threeX);

// 클로저 구조를 확장해서 만든 것이 즉시 실행함수이다.
// 두번째 목적은 값을 유지하자.
// react에서 hook이 이 구조를 이용한다. userrex 또한 마찬가지.
