var fs = require('fs');

console.log("Start");

setTimeout(()=>{
    console.log("timer1 expired");    
},0);

setImmediate(()=>{
    console.log("immediate 1 executed");
});

fs.readFile(__filename, ()=>{
    console.log("file read completed");
});

setTimeout(()=>{
    console.log("timer 2 expired");
},0)

console.log("End");
