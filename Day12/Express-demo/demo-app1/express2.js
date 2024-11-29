const express = require('express');

const app = express(); // instance of an express app, which is stored in the app variable

const port = 3000;

// ser ejs as the template engine
app.set('view engine', 'ejs');
// app.set('views', 'ejs'); OR
// app.set('views',__dirname+ './views');


// render a dynamic html page
app.get("/", (req,res)=>{
   // res.send('Welcome to the Express Website!');
   res.render('index', {message: 'Welcome to the Express website! designed using template engine.'})
});

// start the server
app.listen(port, ()=>{
    console.log('Server started.');
});



