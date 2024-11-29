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
    console.log(parsedUrl);
    console.log(pathname);

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

        // form forr adding new items:
        res.write(`<form method="POST" action="/add-product">
            <input type="text" name="item" placeholder="new Item" required>
            <button type="submit">ADD item</button>
            </form>`);

        // form for deleting new items:
        res.write(`<form method="POST" action="/delete-product">
            <input type="text" name="item" placeholder="new Item" required>
            <button type="submit">DELETE item</button>
            </form>`);

        res.write(`<hr>`);
        res.write(`<form method="DELETE" action="/delete">
            <input type="text" name="item" placeholder="new Item" required>
            <button type="submit">DELETE item</button>
            </form>`);

        res.end()
    }

    // handling POST req to add new item
    else if(pathname === '/add-product' && req.method ==='POST'){
        let body = '';
        req.on('data', chunk => {
            body+=chunk;
        });
        req.on('end', ()=>{
            const parsedBody = querystring.parse(body);
            const newItem = parsedBody.item;
            data.push(newItem);
            res.writeHead(302, {'location':'/'});
            res.end();
        });
    }

    // handling POST req to delete new item
    else if(pathname === '/delete-product' && req.method ==='POST'){
        let body = '';
        req.on('data', chunk=>{
            body += chunk;
        });
        req.on('end', ()=>{
            const parsedBody = querystring.parse(body);
            const itemtoDelete = parsedBody.item;
            data = data.filter(item => item !== itemtoDelete);
            res.writeHead(302, {'location':'/'});
            res.end();
        });
    }

    // delete request
    else if(pathname === '/delete' && req.method ==='DELETE'){
       const parsedBody = parsedUrl.query; // ..../delete?item=productx
       const itemtoDelete = parsedBody.item;
       data = data.filter(item => item !== itemtoDelete);
       res.writeHead(200, {'content-type':'application/json'});
       res.end(JSON.stringify({message: 'product deleted successfully', data}));
    }

    else{res.writeHead(404, {'content-type':'text/html'});
        res.write('<h1>Product Not Found</h1>');
        res.end();
        // res.end(JSON.stringify({message: 'product deleted successfully', data}));
    }

    /*
    else if(pathname === '/delete' && req.method==="GET"){
        res.writeHead(200, {'Content-Type': 'text/html'});

        //write content to server body
        res.write('<h1> DELETE Product List:</h1>');
        res.write('<ul>');
        // data.forEach((product) => {
        //     res.write(`<h2>${product}</h2>`);
        // });
        data.splice(0, 2);
        data.forEach((product) => {
            res.write(`<h2>${product}</h2>`);
        });
        // end response
        res.write('</ul>');
        res.end()
    }
    */
});



server.listen(3000, ()=>{
    console.log("Servr started...");
    
});




