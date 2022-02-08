
console.log('---------------- [354] call, apply, bind -----------------');

var count = 100;

var myObj = {
    count: 0,

    visit: function() {
        this.count++;
        console.log('visit=> ', this.count, this);

        function inner(x) {
            this.count += x;
            console.log('call, apply this=> ', this.count, this);
        }

        inner(2)
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

        inner(2);
    }
}
yourObj.visit();
console.log('합계', yourObj.count);
console.log('');


