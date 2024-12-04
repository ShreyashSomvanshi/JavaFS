const express = require('express');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');
const bodyParser = require('body-parser');
const secretkey = "shreyash";
const port = 3000;

const app = express();

// authentication
app.post('/login', (req, res)=>{
    const user = {id:101, username: 'Abhi'};
    const token = jwt.sign(user, secretkey, {expiresIn: '1h'});
    res.json({token});
});

// this is a function to authenticate the token, if its valid token
// only then this function serves as a middleware

function authenticateToken(req, res, next){
    // to declare it in bearer token in postman
    // looks for jwt in Authorization header of the incoming http request
    // (req.headers['authorization']).

    const token = req.header('Authorization')?.replace('Bearer', '').trim();
    // const token = req.headers['authorization'];
    if(token == null) return res.sendStatus(401); // unauthorized 
    jwt.verify(token, secretkey, (err, user)=>{
        if (err) return res.sendStatus(403);
        // extracted user object from the token payload and assigned to req.user so 
        // it can be used later in the request processing pipeline
        req.user = user;
        next(); // to next func in express.js pipeline
    });
}


// this route authorizes the user if token is valid
app.get('/private', authenticateToken, (req, res)=>{
    try{
        res. send(res.send(`Hello, ${req.user.username} is verified user, and can access protected route`));
    }catch(error){
        res.status(401).send('Invalid user');
    }
})


//start server 
app.listen(port,()=>{
    console.log(`Server is running on port ${port}`);
});


