
const url = require('url');

const exampleurl = 'https://www.example.com:8080/path/name?query=123#fragment';
const parsedurl = url.parse(exampleurl);

console.log('pased URL Components :');
console.log(parsedurl.protocol); // => https:
console.log('Host :',parsedurl.host);
console.log('Hostname :',parsedurl.hostname);
console.log('Port : ',parsedurl.port);
console.log('Pathname : ',parsedurl.pathname);
console.log('Search' , parsedurl.search);
console.log('Query : ',parsedurl.query);

const newUrl = url.format({
    protocol: 'https:',
    hostname: 'www.example.com',
    port :3000,
    query :{
        name: 'John',
        age : 30 
    }

});
console.log('Constructed URL :',newUrl);