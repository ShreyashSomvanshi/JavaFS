const express = require('express');
const path = require('path');
const bodyparser = require('body-parser');


const app = express();

const users = [
    { username: 'admin', password: 'admin123' },
    { username: 'user', password: 'user123' },
  ];

var products = [
    { name: 'Laptop', Desc: ' 15 GB RAM', price: 55000},
    { name: 'Mobile', Desc: '4GB RAM', price: 15000},
    { name: 'TV', Desc: 'Smart TV', price: 25000},
];

// Set the views directory
app.set('views', path.join(__dirname, 'views'));

// // Set the default view engine to Pug
app.set('view engine', 'pug');

app.get('/', (req, res) => {
    res.render('index'); 
    // console.log(path.join(__dirname, 'views'));
});


app.get('/login', (req, res) => {
    res.render('login'); 
    // console.log(path.join(__dirname, 'views'));
});

// Middleware to parse form data
app.use(bodyparser.urlencoded({ extended: true }));

app.post('/login', (req, res) => {
    var { username, password } = req.body;

    var user = users.find(u=>u.username === username && u.password === password)

    if (user) {
        // res.redirect('/products'); 
        res.render('products', { username: user.username, products: products });
        res.end('');
        // res.redirect('/products');
        // res.render('products', { username: user.username, products });
    } else {
        res.render('login', { error: 'Invalid username or password' });
    }
});

app.post('/addprod', (req, res) => {
    const productname = req.body.productName;
    const productDesc = req.body.productDesc;
    const productprice = req.body.productPrice;

    // New product to add
    let newProduct = { name: `${productname}`, Desc: `${productDesc}`, price: `${productprice}` };

    // Add the new product to the array
    products.push(newProduct);
    res.render('products', {products: products});
});




// ${products.map(prod=>`<li>${prod.name} descrp= ${prod.desc} price= ${prod.price}</li>`).join('')}

// app.get('/products', (req, res) => {
//     res.render('products');
//     // res.render('products', ()=>{
//     //     res.send(`${products.map(prod=>`<li>${prod.name} descrp= ${prod.Desc} price= ${prod.price}</li>`).join('')}`) 
//     // });
// });


app.listen(3000, () => {
    console.log('Server is running on http://localhost:3000');
});

