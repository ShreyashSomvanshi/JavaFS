const http=require('http');

// create http server
var servr = http.createServer((req, res)=>{
    // console.log("hi");

    // set response hesader to indicate content type
    // res.writeHead(200, {'Content-Type': 'text/html'});

    // //write content to server body
    // res.write('<h1>Heading 1</h1><br> Hellllo')
  
    // // end response
    // res.end("ON WEBPAGE")

    if(req.url === '/'){
        res.writeHead(200, {'Content-Type': 'text/html'});

        //write content to server body
        res.write('<h1>Heading 1</h1><br> Hellllo')
    
        // end response
        res.end();
    }

    else if(req.url === '/new'){
        res.writeHead(200, {'Content-Type': 'text/html'});

        //write content to server body
        res.write('<h1>Inside New </h1><br> Hellllo')
    
        // end response
        res.end();
    }

    else{
        res.writeHead(200, {'Content-Type': 'text/html'});

        //write content to server body
        res.write('<h1>404 Err</h1><hr>')
    
        // end response
        res.end();
    }

    // console.log(req.url);

})

const port = 3000;
const host = '127.0.0.1';

servr.listen(port,host,()=>{
    console.log("server started");
})


