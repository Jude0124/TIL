
console.log('---------------- 상속 -----------------');

class Jumsu {

    // 생성자 메서드. 반환문을 갖지 않는다.
    constructor(name, kor, eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }
    onTotal() {
        return this.kor + this.eng;
    }
    onAvg() {
        return this.onTotal() / 2;
    }
    display() {
        console.log(`${this.name} / ${this.onTotal()} / ${this.onAvg()}`);
    }
}

