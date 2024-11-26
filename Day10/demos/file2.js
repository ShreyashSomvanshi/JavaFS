const counterModule = require('./file1.js');
console.log(counterModule.increment()); //prints1
console.log(counterModule.increment());

console.log(global.config.appName);
console.log(global.config.version);
console.log(global.config.port);
