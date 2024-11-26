var http = require('http');
var url = require('url');
var fs = require('fs');


function login_chk(){
  var email = document.getElementById('email').value;
  var password = document.getElementById('password').value;
  if(email && Password){
    if(email === "admin@gmail.com" && password === "Pass@123"){
      return true;
    }
  }else{
    alert("Enter Email/Password");
  }
}


http.createServer(function (req, res) {
  var q = url.parse(req.url, true);
  var filename = "welcome.html";
  fs.readFile(filename, function(err, data) {
    // if (err) {
    //   res.writeHead(404, {'Content-Type': 'text/html'});
    //   return res.end("404 Not Found");
    // } 
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    return res.end();
  });
}).listen(8080);



