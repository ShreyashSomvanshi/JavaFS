var http = require('http');
var fs = require('fs');

const myserver = http.createServer((req, res)=>{
    const log = `\n ${Date.now()}: ${req.url} - New Req received`;
    fs.appendFile("log.txt", log, (err, data) => {
        switch(req.url){ // multiroute
            case "/":
                res.write('<h1>Welcome :)</h1><br><h3><a href="./login">Login Here</a></h3>');
                res.write("hi");
                return res.end();
                break;
            case "/login":
                var filen = "login.html";
                return fs.readFile(filen, function(err,data){
                    if(err){
                        res.writeHead(404, {'Content-Type':'text/html'});
                        return res.end("404 Not Found")
                    }
                    else{
                        res.writeHead(200, {'Content-Type': 'text/html'});
                        res.write(data);
                    return res.end();}
                });
                break;
            case "/welcome":
                var filen = "welcome.html";
                return fs.readFile(filen, function(err,data){
                    if(err){
                        res.writeHead(404, {'Content-Type':'text/html'});
                        return res.end("404 Not Found")
                    }
                    else{
                        res.writeHead(200, {'Content-Type': 'text/html'});
                        res.write(data);
                        res.write('<h3><a href="/">Log Out</a></h3>')
                    return res.end();}
                });
                break;
            default:
                return res.end("404 Not Found")
        }
    });
    
});

myserver.listen(3030, ()=>{
    console.log('serv started..')
})
