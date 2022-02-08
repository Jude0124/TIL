
console.log('---------------- prototype chain -----------------');

var one = { 
    name: 'One',
    display: function() { console.log(this.name) }
};

var two = {
    name: 'Two'
};

var three = {};
