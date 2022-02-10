
console.log('---------------- OOP -----------------');

var Jumsu = (function(){
    function Jumsu(name, kor, eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    Jumsu.prototype.onTotal = function() {
        return this.kor + this.eng;
    }
    Jumsu.prototype.onAvg = function() {
        return this.onTotal() / 2;
    }
    Jumsu.prototype.display = function() {
        console.log(`${this.name} / ${this.onTotal()} / ${this.onAvg()}`);
    }

    return Jumsu;
})();

let nolbu = new Jumsu('NolBu', 100, 80);
nolbu.display();

// ES6 부터 자스에서도 클래스 가능

class JumsuCls {
    // 멤버변수 선언은 없음. 멤버변수는 생성자 메서드 내부에서 정의

    constructor(name, kor, eng) {  //생성자 메서드는 constructor라는 이름으로 고정
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    onTotal() {
        return this.kor + this.eng;
    };

    onAvg(num) {
        return this.onTotal() / num;
    }
    get _kor() {
        return this.kor
    }

    set _kor(num) {
        this.kor = num;
    }

    // static
    // static에서는 this 참조 안됨
    static getArea(w, h){
        console.log(`면적은 ${w * h}`);
    }
    // static (){
    //     console.log(`${this.name}님의 총점은 ${this.onTotal()} / ${this.onAvg(2)}`);
    // }
    static progName ='Jumsu Program';
}

const heungbu = new JumsuCls('흥부', 100, 80);
console.log(heungbu);

console.log(heungbu.onTotal(), heungbu.onAvg(2));

// static
JumsuCls.getArea(10, 20);

// GETTER , SETTER
// 프로퍼티처럼 사용한다.
heungbu._kor = 1000;
console.log(heungbu._kor);
