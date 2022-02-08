
console.log('---------------- Object -----------------');
// var로 선언된 변수는 window(global) 영역을 오염시킨다.
// let, const = > TDZ에 선언되므로 window영역을 오염시키지 않고 
// 별도의 영역에 저장된다.
const obj = {
    name: 'NolBu',
    address: 'Seoul',
    info: function() {
        console.log(this.name + ' / ' + this.address);
    }
};

// obj = { name : 'ABC'} // Error
const arr = [10, 20, 30];
arr[0] = 100;

// arr = [21,22,33,44]; // Error


// property 추가

obj.age = 30;
console.log(obj);

// property 값 변경, 존재하는 property에 다른 값을 대입

obj.name = 'HungBu';
console.log(obj);

// property 삭제, delete 명령으로 기본형 변수는 삭제할 수 없음
delete obj.age;
console.log(obj);

// 메서드 (클래스(객체)내부의 변수들을 참조하여 만든 함수)
obj.display = function(){
    console.log(this.address);
}
obj.display()

delete obj.display;
console.log(obj);



















