const { log } = require('console');
const ee = require('events');
const {EventEmitter} = require('stream');

const emi = new EventEmitter();

emi.on('status', (status) => {
    console.log(`status 1: ${status}`);
});


emi.on('status', (status) => {
    console.log(`status 2: ${status}`);
});


//error handler
emi.on('error', (error)=>{
    console.log('an error occured', error);
});

// eventemitter with one time listener
emi.once('connect', ()=>{
    console.log('connected');
});


emi.emit('status', 'Active');
emi.emit('connect'); // connected
emi.emit('connect'); // no output, listener removed after first execution
emi.emit('error', 'something went wrong!');

// ================ Custom events ===============

class CustomEventEmitter extends EventEmitter{}

const emi1 = new CustomEventEmitter();

// register event listeners
emi1.on('userLogin', (username)=>{
    console.log(`user logged in: ${username}`);
    
});

emi1.on('userLogout', (username)=>{
    console.log(`user logged out: ${username}`);
    
});

//emit custom events
emi1.emit('userLogin', 'alice');
emi1.emit('userLogout', 'Alice');
