const bcrypt = require('bcryptjs');

// your plain password
const plainpassword = 'admin123';

// generate a hashed password

bcrypt.hash(plainpassword, 10, (err, hashedPassword) => {
    if (err) throw err;
    console.log('Hashed Password: ', hashedPassword);
})