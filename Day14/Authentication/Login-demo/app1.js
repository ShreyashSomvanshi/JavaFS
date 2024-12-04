const express = require('express');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');
const bodyparser = require('body-parser');
 
const app = express();
 
//middlware to parse JSON body
app.use(bodyparser.json())
 
const secretkey = 'key';
 
const users = [{id:1, username:'admin',password:'$2a$10$0qjXa848mAV9.1hoZP0Fo.Q5ir3YW0m4GiLotmclaPxlIJ.xRYhHG'},]


//post request to handle login
app.post('/login',async (req,res)=>{
    const {username,password} = req.body;
    const user = users.find(u=>u.username === username);
    if(!user){
        return res.status(401).send({message:'Invalid username or password'});
    }

    // comparing the provided password with the hashed password in the database
    const passwordMatch = await bcrypt.compare(password,user.password);
   
    if(!passwordMatch){
        return res.status(401).send({message:'Invalid username or password'})
    }
    const token = jwt.sign({id:user.id, username:user.username}, secretkey, {expiresIn:'1h'});
    res.json({token});
})
 
 
// middleware to authenticate the token
const authenticate = (req,res,next)=>{
 
    // get token from Authoriztion header
    const token = req.header('Authorization')?.replace('Bearer','').trim();
    if(!token) return res.status(401).send({message:'Access denied. No token'})
 
    // verify the token
 
    jwt.verify(token, secretkey, (err,user)=>{
        if(err){
            return res.status(403).send('Invalid token !');
        }
        // attach user infor to request object
        req.user = user;
        next();
    });
   
}
 
 
//get :- protected route, accessible only with a valid JWT token
app.get('/protected',authenticate,(req,res)=>{
    res.send(`Hello ${req.user.username}, you have access to this protected route! `);
})
 
//start the server
const port = process.env.port || 3000;
app.listen(port, ()=>{
    console.log(`server started at port http://localhost:${port}`);
});