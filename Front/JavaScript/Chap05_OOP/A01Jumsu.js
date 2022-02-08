
console.log('---------------- OOP -----------------');

var person = 'NolBu';
var kor = 100;
var eng = 80;
var onTotal = function() {
    return kor + eng;
};
var onAvg = function() {
    return onTotal() / 2;
}
var display = function() {
    console.log(`${person} / ${onTotal()} / ${onAvg()}`);
}
display();;


