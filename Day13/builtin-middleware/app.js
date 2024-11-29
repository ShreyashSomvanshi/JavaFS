const express = require('express');
const methodOverride = require('method-override');
const app = express();

// middleware to allow PUT and DELETE methods from HTML forms
app.use(methodOverride('_method'));

app.put('/update', (req, res)=>{
    res.send('PUT request received');
});

app.listen(3000, ()=>{
    console.log('server started...');  
});
