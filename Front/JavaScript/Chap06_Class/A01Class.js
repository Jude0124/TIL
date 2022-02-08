
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


