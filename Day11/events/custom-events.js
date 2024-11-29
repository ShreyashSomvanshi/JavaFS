// Lets create an application that processes user
//  and their associated actions(register user, logging in) using events

const EventEmitter = require('events');

class UserEvents extends EventEmitter{};

const userE = new UserEvents();

// Register
userE.on('register', (userData)=>{
    console.log(`User Registered: ${userData.name}`);  
    setTimeout(()=>{
        console.log(`Welcome mail sent @: ${userData.email}`);   
    }, 2000) ;
    
});


// Login
userE.on('login', (userData)=>{
    console.log(`User logged in: ${userData.name}`); 
    // setTimeout(()=>{
    //     console.log(`Welcome mail sent @: ${userData.email}`);   
    // }, 2000) ;
});


// emitting events
const newUser = {name: 'John Doe', email: 'john.doe@xyz.com'}
userE.emit('register', newUser);
userE.emit('login', newUser);


// task : after register, user receives confirmation by sending
//  welcome mail on user mailid, using async




