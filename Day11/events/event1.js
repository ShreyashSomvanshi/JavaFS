const EventEmitter = require('events');

const myevEmt = new EventEmitter();

myevEmt.on('welcome', (name)=>{
    console.log("Welcome to my event: ", name);
});

myevEmt.emit('welcome', 'nodejjs');



