/**
 * when a user logs in and provides their password you need to compare the entered
 * password with the stored hash in database.
 */
const bcrypt = require('bcryptjs');

const storeHash = '$2a$10$xKbPgw/uYcfkDMvvl3w9l.WqEndvmaj//DobVpbBs2oGl3rNvBBtC';

const passwordToCompare = 'mypass123';

bcrypt.compare(passwordToCompare, storeHash, (err, isMatch)=>{
    if(err) throw err;

    if (isMatch){
        console.log("Password is correct");
    }
    else{
        console.log("Password is incprrect");
    }
});


