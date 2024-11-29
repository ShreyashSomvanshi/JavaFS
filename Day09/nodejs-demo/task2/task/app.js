var http = require('http');
var url = require('url');
var fs = require('fs');

http.createServer(function (req, res) {
    var urlentered = url.parse(req.url, true);
    var filen = "." + urlentered.pathname;
    // console.log(filen);
    fs.readFile(filen, function(err,data){
        if(err){
            res.writeHead(404, {'Content-Type':'text/html'});
            return res.end("404 Not Found")
        }
        else{
        res.writeHead(200, {'Content-Type': 'text/html'});
        res.write(data);
        return res.end();}
    })
    console.log(filen);
}).listen(3001);