var http = require('http')
var fs = require('fs')
var url = require('url');
 
http.createServer(function(request,response){
    var pathname = url.parse(request.url).pathname;
    console.log('Requested for '+pathname+'receievd');
    fs.readFile(pathname.substr(1),function(err,data){
        if(err){
            console.log(err.stack);
            response.writeHead(404,{'content-type':'text/html'});
           
        }else if(request.url === '/try'){
            res.writeHead(200 , {'Content-type' : 'text/html'});
            res.write('<h1>course List: Java , PHP , DotNet , JavaScript , react </h1>')
            res.end();}
        else{
            response.writeHead(200,{'content-type':'text/html'});
            response.write(data.toString());
        }
        response.end();
    });
   
}).listen(8081);
 
console.log('Server running at http://127.0.0.1:8081/test.html');
 
 
 
// create this file with name http_server.js 
 