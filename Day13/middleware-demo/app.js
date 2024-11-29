const express = require('express');
const app = express();
const port = 3030;

// application level middleware
app.use((req, res, next) =>{
    console.log("Application level Middleware");
    next();
});

app.use((req, res, next)=>{
    console.log("middleware 2");
    next();
});


app.get('/', (req, res)=>{
    res.write("Hiiii");
    res.end();
});

app.use((err, req, res, next)=>{
    console.error(err.stack);
    res.status(500).send("Some went wrong!");
});

app.listen(port, ()=>{
    console.log("Server started..");
});



