// const express = require('express');
// const bodyparser = require('body-parser');
// const path = require('path');

// const app = express()
// const port = 3000;

// //middleware to parse form data
// app.use(bodyparser.urlencoded({extended:true}));

// // set the views directory and set pug as the template engine
// app.set('views', path.join(__dirname, 'views'));
// app.set('view engine', 'pug');

// // Sample users for login verification
// const users = [
//     {username: 'admin', password:'admin123'},
//     {username: 'user', password: 'user123'}
// ]

// // Route to render login form
// app.get('/',(req,res)=>{
//     res.render('login');
// })

// //Route to handle login form submission
// app.post('/login', (req,res)=>{
//     const {username, password} = req.body;

//     // check if entered username and pass match any user
//     const user = users.find(u=>u.username === username && u.password === password);
//     if(user){
//         res.render('success', {username: user.username});
//     } else{
//         res.render('login', {error: 'Invalid username or password'});
//     }
// });

// // Start the server
// app.listen(port, () => {
//     console.log(`Server running at http://localhost:${port}`);
// });


const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');

const app = express();
const port = 3000;

// Middleware to parse form data
app.use(bodyParser.urlencoded({ extended: true }));

// Set the views directory and set Pug as the template engine
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'pug');

// Sample users for login verification
const users = [
  { username: 'admin', password: 'admin123' },
  { username: 'user', password: 'user123' },
];

// Route to render login form
app.get('/', (req, res) => {
  res.render('login'); // Renders 'login.pug'
});

// Route to handle login form submission
app.post('/login', (req, res) => {
  const { username, password } = req.body;

  // Check if the entered username and password match any user
  const user = users.find(u => u.username === username && u.password === password);

  if (user) {
    res.render('success', { username: user.username });
  } else {
    res.render('login', { error: 'Invalid username or password' });
  }
});

// Start the server
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});

