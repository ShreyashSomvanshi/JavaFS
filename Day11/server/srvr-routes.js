const http = require('http');

// to parse the req url
const url = require('url');

// to parse query string of req url
const querystring = require('querystring');

// store data for simplicity (in-memory)
let data = ['product 1', 'product 2','product 3'];

//create the http server
const server = http.createServer((req, res) => {
    const parsedUrl = url.parse(req.url, true);
    const pathname = parsedUrl.pathname;
    // console.log(parsedUrl);
    // console.log(pathname);

    //handling GET req to display current products
    if(pathname === '/' && req.method==="GET"){
        res.writeHead(200, {'Content-Type': 'text/html'});

        //write content to server body
        res.write('<h1>Product List:</h1>');
        res.write('<ul>');
        data.forEach((product) => {
            res.write(`<h2>${product}</h2>`);
        });
    
        // end response
        res.write('</ul>');
        res.end()
    }
});

server.listen(3000, ()=>{
    console.log("Servr started...");
    
});

