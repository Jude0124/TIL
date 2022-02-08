
console.log('---------------- Object -----------------');

var nolbu = 'NolBu';
var kor = 100;
var eng = 80;
var total = kor + eng;
var avg = total / 2;
console.log(nolbu + '님의 총점은 ' + total + '이고 평균은 ' + avg + '입니다');
console.log(`${nolbu}님의 총점은 ${total}이고 평균은 ${avg}입니다.`);
console.log('');

// console.lot(hungbu)
// let hungbu = 'HungBu'
// let은 hoisting은 이루어지지만 호출은 안된다.

let heungbu = new Object();
heungbu.name = '흥부';
heungbu.kor = 100;
heungbu.eng = 70;
heungbu.total = heungbu.kor + heungbu.eng;
heungbu.avg = heungbu.total / 2 ;

console.log(`${heungbu.name}님의 총점은 ${heungbu.total} 이고 평균은 ${heungbu.avg} 입니다.`);

// 함수가 global 영역에서 선언되었으므로


//  new Object()를 { }로 변경해서 묶을 수 있다.
// 함수 이외의 { } 영역의 this는 window
let hyangdan = {
    name : "향단",
    kor : 100,
    eng : 80,
    // this는 window가 되버림
    total : this.kor + this.eng,
    avg : this.total /2                 // 마지막 , 는 es6부터는 있어도 에러아님(이전에는 에러)
}
console.log(hyangdan.total);

console.log(heungbu);
console.log(hyangdan);
console.log('');
console.log('');
console.dir(heungbu);
console.dir(hyangdan);

// Object는 key: value 쌍의 집합니다.
// key는 JavaScript의 변수 명명 규칙을 따른다.
// 그렇지 않은 경우는 문자열로 이름을 정의한다.
// key가 number면 문자열로 자동 치환한다.
// 문자열의 key 값은  "객체명[문자열]형태로 참조"
const bangja = {
    name : '방자',
    'bangja-kor' : 100,
    'bangja-eng' : 50,
    100: this['bangja-kor'] + this['bangja-eng'],
    //  avg : this.100 /2 ;

}
console.log(bangja);
console.log(bangja.bangja-kor);
console.log(bangja['bangja-kor']);
// console.log(bangja.100); //syntax error
console.log(bangja['100']);
console.log('');

const hong = {
    name : '홍길동',
    kor : 100,
    eng :90,

    // 객체 내부에 객체의 property 값을 참조하는 함수를 메서드라한다.
    total : function(){
        return this.kor + this.eng;
    },
    avg : function(num){
        return this.total() /num ;
    }
} 


console.log(hong);
console.log(hong.total());
console.log(hong.avg(2));
console.log('');