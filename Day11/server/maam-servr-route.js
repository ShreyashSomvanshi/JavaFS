const http = require('http');
const url = require('url'); //to parse the request url 
const querystring = require('querystring'); //to parse the query string of the request url

//store data for simplicity (in-memory)
let data = ['product 1','Product 2','Product 3'];

//create the http server 
const server = http.createServer((req, res) => {
    const parsedUrl = url.parse(req.url ,  true);// http://www.abc.com/inbox?mail = TCS
    /* url.parse() parses a URL string into an object and break down into its variouse component(like prtocol , hostname , path etc)
    req.url => this is URL part of incoming HTTP request when client make request (like /inbox or /inbox ? mail= 'TCS')
    true=> it tells url.parse() to also pase the query string( part after ? in the url ) into an object . if it is true , the query parameter are converted into javascript object , make it easier to access them . 
     */
    const pathname = parsedUrl.pathname ; //--- /inbox 
    /* paserdUrl.pathname = it will extract th epath from parsed url object . It is the part of url that specifies resources being requested on the server .exculed domain name , protocol and query paramaeters . 
     */

    //handleing Get request to display the current products 
    if(pathname === '/' && req.method === 'GET'){
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write('<h1> Product List</h1>');
        res.write('<ul>');
        data.forEach(product => {
            res.write(`<h2>${product}<\h2>`)
        });
        res.write('</ul>');
    }
});



