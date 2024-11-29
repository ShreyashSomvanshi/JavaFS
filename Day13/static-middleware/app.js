const express = require('express');
// import express from 'express'
const app = express();

app.use(express.static("public"));
app.use(express.json()); // post/put request 

app.get('/receivedata', (req, res)=>{
    const{name, age} = req.body;
    if (name && age){
        req.json({
            message:'message received succ',
            data:{
                name,
                age
            }
        });
    }
    else{
        res.status(404).json({
            message:"Not received"
        });
    }
});


app.post("/getdata", (req, res)=>{
    const{name, age} = req.body;
    res.status(200).json({
        message: "data received successfully",
        data: {
            name: name,
            age : age
        }
    });
});

app.listen(3000, ()=>{
    console.log("server started...");
});