
console.log('---------------- Loop Statument -----------------');

var result = 0;

for(var  i = 1 ; i <= 10; i++) {
    result = result + i ;
}

console.log(result);

result = 0;
var i = 1;

while( i <= 10){
    result += i;
    i++;

}
console.log(result);


//do ~ while
result = 0;
var i = 1;
do {
    result += 1;
    i++;
}while(i <= 10);
console.log(result);