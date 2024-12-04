// when client sends JWT token in authorization header, the server verifies
// the token to authenticate the user 

const jwt = require('jsonwebtoken');

const secretKey = 'your-secret-key';

// function to verify the jwt
const verifyToken = (token) => {
    jwt.verify(token, secretKey, (err, decode)=>{
        if(err){
            console.log('Invalid token ', err);
            return;
        }
        console.log('Decode user data: ', decode);
        
    });
};

// example token (in reality, this comes from a request header)
const token = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJTdW1pdCIsImlhdCI6MTczMzEyNTAwNiwiZXhwIjoxNzMzMTI4NjA2fQ.5Bi1b1GqomIxs0TRP8GJAGvuw5H8JXDqsfnTGv13MYQ';
verifyToken(token);


