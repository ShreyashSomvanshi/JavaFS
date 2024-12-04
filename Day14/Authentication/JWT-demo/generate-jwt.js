const jwt = require('jsonwebtoken');

// user data
const user = {id:1, username: "Sumit"};

// secret key used to sign the jwt
const secretKey = 'your-secret-key';

// creating a jwt token
const token = jwt.sign({id:user.id, username: user.username}, secretKey, {expiresIn: '1h'});

console.log(token);




