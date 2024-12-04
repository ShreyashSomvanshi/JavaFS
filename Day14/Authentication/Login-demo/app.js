const express = require('express');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');
const bodyparser = require('body-parser');
const app = express();


// middleware to parse JSON body
app.use(bodyparser.json()); 

const secretKey = 'key';

const users = [{id:1, username: 'admin', password: 'admin123@pass'}];


// post route to handle login
app.post('/login', async (req,res)=>{
    const {username, password} = req.body;
    const user = users.find(u=> u.username === username);
    if(!user){
        return res.status(401).send({message:'Invalid username or password'});
    }
    // compare the provided password with hashed password in the db
    const passwordMatch = await bcrypt.compare(password, user.password);
    if(!passwordMatch){
        return res.status(401).send({message:'Invalid user or password'});
    }
    // if auth is successfull, it generates
    const token = jwt.sign({id:user.id, username: user.username}, secretKey, {expiresIn: '1h'});
    res.json({token});
});

//middleware to authenticate the token
const authenticate = (req, res, next) =>{
    // get token from authentication header
    const token = req.header('Authorization')?.replace('bearer','');  
    // if no token provided then return 401
    if(!token){
        return res.status(410).send({message:'Access denied. No token'})
    }
    // verify token
    jwt.verify(token, secretKey, (err, user)=>{
        if(err){
            // console.log('Invalid token ', err);
            return res.status(403).send('Invalid token !');
        }
        req.user = user;
        next();
    });
};

// get - protected route, accessible only wth a valid JWT token
app.get('/protected', (req, res)=>{
    res.send(`Hello ${req.user.username}, you have access to this protected route!`);
});

// start server
const port = process.env.port || 3000;
app.listen(port, ()=>{
    console.log(`server is running http://localhost:${port}`);
    authenticate();
});


