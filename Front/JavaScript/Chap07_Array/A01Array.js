
console.log('---------------- Array -----------------');

var nolbu = 'NolBu';
var kor = 100;
var eng = 80;
var total = kor + eng;
var avg = total / 2;
console.log(nolbu + '님의 총점은 ' + total + '이고 평균은 ' + avg + '입니다');
console.log(`${nolbu}님의 총점은 ${total}이고 평균은 ${avg}입니다.`);
console.log('');

let onTotal = (kor, eng) => kor + eng;
let onAvg = (total) => total / 2;
let display = (name, total, avg) => `${name}님의 총점은 ${total} / ${avg}`;

const heungbu = [90, 80, 0, 0, onTotal, onAvg, display]
heungbu[2] = heungbu[4](heungbu[0],heungbu[1])
heungbu[3] = heungbu[5](heungbu[2])
heungbu[6](heungbu[2], heungbu[3])



// 배열
const arr = [10, 11, 100, 101, 1000];
console.log(arr);

const arrTwo = new Array();
console.log(arrTwo);

// []를 이용하여 값을 추가한다.
// 배열의 시작은 0부터 시작한다.
arrTwo[0] = 10;
arrTwo[1] = 11;
arrTwo[2] = 100;

// 개수가 정해진(?) 배열을 생성. 6번째 입력을 하면 값이 들어간다.(늘어남)

const arrThree = new Array(5);
console.log(arrThree);
arrThree[0] = 10;
arrThree[1] = 11;
arrThree[2] = 100;
arrThree[3] = 101;
arrThree[4] = 1000;
arrThree[5] = 1001;
console.log(arrThree);

// 값의 수정
arrThree[1] = 21;
console.log(arrThree);

// 배열은 타입을 혼합해서 넣을 수 있다.
const arrFour = [10, 'NolBu', true, undefined, null, function(){return 100}, new Date()];
console.log(arrFour[0]);
console.log(arrFour[1]);
console.log(arrFour[2]);
console.log(arrFour[3]);
console.log(arrFour[4]);
console.log(arrFour[5]());
console.log(arrFour[6]);


