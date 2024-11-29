const http = require('http'); 
// http ready made module loaded using require
// creates http server

const hostname = '127.0.0.1'; //localhost

const port = 3000;

// create server
const server = http.createServer((req, res) => {
    res.statusCode = 200; // status code OK
    res.setHeader('Content-Type','text/plain'); //set the response content
    res.end('Hello World !!\n')
})

// start server
server.listen(port, hostname, ()=>{
    console.log(`server running At http://${hostname}:${port}/`);
    // log server url
})

