
console.log('---------------- defineProperty -----------------');

function printObject(data) {
    for (const prop in data) {
        console.log(prop, data[prop]);
    }
};

var obj = {
    name: 'NolBu',
    age: 30
};



