// Lets see how Nodejs can handle http request and 
// responses asynchronously using events

const http = require('http');
const EventEmitter = require('events');

const server = http.createServer((req, res)=>{
    // create an instance of EventEmitter
    const myEvEmit = new EventEmitter();
    /// this instance is used to emit and listen to the
    // custom events inside server's request handling process

    // on() to handle event
    //  here event name is 'request'
    myEvEmit.on('request', ()=>{
        console.log('Request received..');
        res.writeHead(200, {'content-type': 'text/plain'});
        res.write('Hello, this is an event driven HTTP server!!!');
        res.end();  
    } );

    
//emitting a custom event to signal that a req has been recived..
myEvEmit.emit('request');

});


server.listen(5000, ()=>{
    console.log('server started.....');
});


