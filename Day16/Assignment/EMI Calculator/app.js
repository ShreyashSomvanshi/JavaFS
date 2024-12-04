const express = require('express');
const path = require('path');
const app = express();
const port = 3000;

app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'pug');

// Middleware to parse JSON and URL-encoded data
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.use(express.static(path.join(__dirname, 'public')));

//interest rates for loan types
const interestRates = {
    'Home Loan': 0.07,
    'Car Loan': 0.09,
    'Education Loan': 0.08
};

// EMI Calculation 
const calculateEMI = (loanAmount, interestRate, loanDuration) => {
    const monthlyInterestRate = interestRate / 12;
    const emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanDuration)) /
                (Math.pow(1 + monthlyInterestRate, loanDuration) - 1);
    return emi.toFixed(2);
};

app.get("/", (req, res)=>{
    res.render('emi')
});

app.get("/login", (req, res)=>{
    res.render('login')
});


// Route to handle EMI calculation
app.post('/calculate', (req, res) => {
    const { salary, loanAmount, loanType } = req.body;

    let loanDuration;
    if (salary < 20000) {
        loanDuration = 12; // 1 year
    } else if (salary < 50000) {
        loanDuration = 24; // 2 years
    } else {
        loanDuration = 36; // 3 years
    }

    const interestRate = interestRates[loanType];
    const emi = calculateEMI(loanAmount, interestRate, loanDuration);

    res.json({
        emi,
        loanDuration,
        message: `Your EMI for a ${loanType} of amount ${loanAmount} over ${loanDuration} months is ${emi}.`
    });
});

app.get('/emi', (req, res)=>{
    res.render('emi');
})


app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
