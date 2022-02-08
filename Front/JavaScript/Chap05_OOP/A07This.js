
console.log('---------------- this -----------------');

// 객체 내부 메소드 내부의 함수.
var count = 100;

var myObj = {
	
	visit: function(){ 
        

        function inner(x) {
            
        }

        inner(2);
	}
};

myObj.visit();
console.log('');


console.log('--------------- 편법 that ---------------');
var count = 100;




console.log('--------------- 함수 내부의 함수 ---------------');
var cnt = 10;






var person = {
    name: 'NolBu',
    display: function() { 
        console.log(this.name);
    }
}

var emp = { name: 'HungBu' };


