
console.log('---------------- Template Literals -----------------');
//  88, 89 page

// ES2015(es6)
let userName = 'NolBu';
let age = 30;
let address = 'Seoul';

console.log(userName + '님의 나이는 ' + age + '입니다.');
console.log(userName + '님은 ' + address + '에 거주합니다');
console.log(userName + '님의 나이는 ' + age + '입니다.\n' + userName + '님은 ' + address + '에 거주합니다');
console.log('');

console.log(`${userName}님의 나이는 ${age}입니다. `);
console.log(`${userName}님의 나이는 ${age}입니다. 
        ${userName}님은  ${address}에 거주합니다.
`);