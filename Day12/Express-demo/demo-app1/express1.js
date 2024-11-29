const express = require('express');

const app = express(); // instance of an express app, which is stored in the app variable

const port = 3000;

app.get("/", (req,res)=>{
    res.send('Welcome to the Express Website!');
});

// start the server
app.listen(port, ()=>{
    console.log('Server started.');
})



