const express = require('express');
var app = express();
const router = express.Router();

// Router level middleware applies to all routes within this router
// router.use((req,res, next)=>{
//     console.log("Router 1");
//     next();
// });

//router level middleware for speciic routes
router.use('/profile',(req,res, next)=>{
    console.log("profile demo route");
    next();
});

router.get('/profile',(req, res)=>{
    res.send("User Profile");
});

router.get('/settings',(req, res)=>{
    res.send("User settings");
});

router.use((err, req, res, next)=>{
    console.error(err.message);
    res.status(40).send("Content not found!");
});

// router.post('/submit',(req, res, next)=>{
//     // res.send("User settings");
//     console.log("post request to /submit");
//     // res.end();
//     next();
// });

// router.post('/submit',(req, res)=>{
//     res.send("Form Submitted");
// });


// Apply the router to the app for request starting with /user
app.use('/user', router);

app.listen(3050, ()=>{
    console.log('server started...');
    
})