// import required package
const express = require('express');
const mysql = require('mysql2');

const app = express();
const port = 3000;

const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'Admin@1234',
  database: 'capg_try'
});

db.connect((err)=>{
    if(err){
    console.error('could not connect to db', err.message);
    return;
    }
    console.log('connected to database.');
})

// create a route to fetch users from db
app.get('/users', (req, res)=>{
    db.query('select * from xyz', (err, results)=>{
        if(err){console.error('error occured while fetching xyz from db', err.message);}
        else{
            res.json(results);
        }
    })
})

// db.end();

app.listen(port, ()=>{
    console.log(`Serving on port: http://localhost:${port} `);
    
})

