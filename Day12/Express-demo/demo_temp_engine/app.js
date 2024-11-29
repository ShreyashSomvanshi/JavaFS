const express = require('express');
const app = express();
app.set('view engine', 'pug');

app.get('/', (req, res) => {
  res.render('index');
});

app.listen(3000, () => {
  console.log('Listening on port 3000...');
});




// const express = require('express');
// const app = express();

// app.get('/',(req, res) => {
//     res.send('Hello World');
// })

// app.listen(3000, ()=>{
//     console.log('Server started');
// })