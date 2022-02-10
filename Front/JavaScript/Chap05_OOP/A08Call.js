
console.log('---------------- [354] call, apply, bind -----------------');

var count = 100;

var myObj = {
    count: 0,

    visit: function() {
        this.count++;
        console.log('visit=> ', this.count);

        function inner(x) {
            this.count = this + x;                                  // this => window    
            console.log('call, apply this=> ', this.count, this);
        }
        // this를 동적으로 변경. call, apply
        // inner.call(myObj, 2);                    // inner 함수 내부의 this를 myObj로 변경해서 실행
        inner.apply(myObj, [2,2,2])
    }
}
myObj.visit();
console.log('합계', myObj.count);
console.log('');


console.log('--------------- bind의 이용 ---------------');
var count = 100;

var yourObj = {
    count: 0,

    visit: function() {
        this.count++;
        console.log('visit=> ', this.count, this);

        function inner(x) {
            this.count += x;
            console.log('bind this=> ', this.count, this);
        }

        // inner(2);
        // this가 변경된 메서드를 새롭게 생성
        // inner 메서드의 this의 참조를 yourObj로 변경한 후에 
        // 함수 내용을 그대로 bindInner 라는 변수에 대입
        // bindInner와 inner의 내용은 동일하지만 this 참조만 달라진다.
        let bindInner = inner.bind(yourObj);
        // console.log(bindInner);
        bindInner(3);

    }
}
yourObj.visit();
console.log('합계', yourObj.count);
console.log('');


