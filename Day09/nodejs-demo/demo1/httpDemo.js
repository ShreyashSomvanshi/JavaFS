/// mam killed server to...?

const http = require('http');

const server = http.createServer((req, res) => {
    if(req.url === '/'){
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write('<h1> Welcome:) </h1>');
        res.end();
    }else if(req.url === '/about'){
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write('<h1> In about !! :) </h1>');
        res.end();
    }else if(req.url === '/courses'){
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write('<h1> In Courses : Java, PHP, python ,etc...... </h1>');
        res.end();
    }
    else{
        res.writeHead(404, {'Content-Type': 'text/plain'});
        res.write('<h1>404, Not found<a href='/'>Home</a></h1>');
        res.end();
    }

})

server.listen(3000, ()=>{
    // console.log(`server running At http://${hostname}:${port}/`);
    console.log('Running on localhost');
    
    // log server url
})


/////////////////////////////////////////////
//////////////////////////////

// const http = require('http');

// const server = http.createServer((req , res)=>{
//     if(req.url === '/'){
//           res.writeHead(200 , {'Content-type' : 'text/html'});
//           res.write('<h1>Welocme :)</h1>')
//           res.end();
//     }else if(req.url === '/about'){
//         res.writeHead(200 , {'Content-type' : 'text/html'});
//         res.write('<h1> About all !! :)</h1>')
//         res.end();
//     }else if(req.url === '/courses'){
//         res.writeHead(200 , {'Content-type' : 'text/html'});
//           res.write('<h1>course List: Java , PHP , DotNet , JavaScript , react </h1>')
//           res.end();
//     }
//     else{
//         res.writeHead(404 , {'Content-Type' : 'text/plain'});
//         res.write('<h1>404 , Not found <a href='/'>Home</a></h1>');
//         res.end();
//     }
// })
// server.listen(3000 , ()=>{
//     console.log('Server is running on port 3000');
// })


