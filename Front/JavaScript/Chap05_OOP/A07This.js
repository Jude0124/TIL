
console.log('---------------- this -----------------');

// 객체 내부 메소드 내부의 함수.
var count = 100;

var myObj = {
	count : 0,

    // 객체에 기술된 함수(메서드)에서 this는 객체 자체를 의미
	visit: function(){ 
        ++this.count;
        console.log('visit: ', this.count);

        // 메서드 내부 함수 또는 함수 내부의 함수에서는 this가 window가 된다.
        function inner(x) {
            this.count = this.count + x;
            // let count = 100; 이라면  NaN로 표시. window 영역에 count 변수가 없음
            console.log('visit Inner: ', this.count);
        }
        inner(2);
	}
};

myObj.visit();
console.log('');


console.log('--------------- 편법 that ---------------');

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



console.log('--------------- 함수 내부의 함수 ---------------');
var cnt = 10;






var person = {
    name: 'NolBu',
    display: function() { 
        console.log(this.name);
    }
}

var emp = { name: 'HungBu' };


